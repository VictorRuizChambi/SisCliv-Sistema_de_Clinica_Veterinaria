angular.module('miapp', ['ui.materialize'],function($httpProvider) {
	  // Use x-www-form-urlencoded Content-Type
	  $httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
	   /**
	   * The workhorse; converts an object to x-www-form-urlencoded serialization.
	   * @param {Object} obj
	   * @return {String}
	   */ 
	  var param = function(obj) {
	    var query = '', name, value, fullSubName, subName, subValue, innerObj, i;
	      
	    for(name in obj) {
	      value = obj[name];
	        
	      if(value instanceof Array) {
	        for(i=0; i<value.length; ++i) {
	          subValue = value[i];
	          fullSubName = name ; // + '.' + i + '';
	          innerObj = {};
	          innerObj[fullSubName] = subValue;
	          query += param(innerObj) + '&';
	        }
	      }
	      else if(value instanceof Object) {
	        for(subName in value) {
	          subValue = value[subName];
	          fullSubName = name + '.' + subName + '';
	          innerObj = {};
	          innerObj[fullSubName] = subValue;
	          query += param(innerObj) + '&';
	        }
	      }
	      else if(value !== undefined && value !== null)
	        query += encodeURIComponent(name) + '=' + encodeURIComponent(value) + '&';
	    }
	      
	    return query.length ? query.substr(0, query.length - 1) : query;
	  };
	 
	  // Override $http service's default transformRequest
	  $httpProvider.defaults.transformRequest = [function(data) {
	    return angular.isObject(data) && String(data) !== '[object File]' ? param(data) : data;
	  }];
	  
	})
	.filter('dateToISO', function() {
	  return function(input) {
	    input = new Date(input).toISOString();
	    return input;
	  };
	})
	.controller("micontrolador",function($scope , $http,$filter){
	$scope.mascota=null;	
	$scope.modificar=0;
		$http.get('getMascotas')
		.success(function(data){
			$scope.mascotas = data;
			console.log($scope.mascotas+"devolvio algo");
		})
		.error(function(err){
			console.log("no regreso nada");
		});

		$http.get('getClientes')
		.success(function(data){
			$scope.clientes = data;
			console.log($scope.clientes+"devolvio algo");
		})
		.error(function(err){
			console.log("no regreso nada");
		});
		
		
		$scope.modificarMascota=function(mascota){
//			$scope.mascota.mDtFechaNacimiento
			$scope.flag=1;
			$scope.modificar=1;
			if (mascota.mInEsterilizado==1) {
				mascota.mInEsterilizado="S";
			} else {
				mascota.mInEsterilizado="N";
			}

			$scope.mascota=mascota;
			$scope.cliente=mascota.cliente;

		}
		
		
		$scope.asignarCliente=function(cliente){
			$scope.cliente=cliente;
		}
		
		$scope.saveMascota=function(){
			if($scope.mascota==null){
				swal(       
						'Error',
						'Debe ingresar datos!',
						'error'
						);
				
			}
			else{
			if($scope.mascota.mInEsterilizado=="S"){
				$scope.mascota.mInEsterilizado=1;
			}
			else{
				$scope.mascota.mInEsterilizado=0;			
				
			}
			if ($scope.modificar==1) {
				
				$http.post('actualizarMascota',{
					mInMascotaPk:$scope.mascota.mInMascotaPk,
					mChSexo:$scope.mascota.mChSexo,
					mDtFechaNacimiento:$scope.mascota.mDtFechaNacimiento,
					mInEsterilizado:$scope.mascota.mInEsterilizado,
					mStNombre:$scope.mascota.mStNombre,
					eInEspeciePk:$scope.mascota.especie.eInEspeciePk,
					cInClientePk:$scope.cliente.cInClientePk
				})			
				.success(function(data){
					console.log("logeo exitoso");
					swal(   
						'Modificado!',
						'Los datos de '+$scope.mascota.mStNombre+' han sido modificados exitosamente!',
						'success' 
						);
				})
				.error(function(err){
					swal(       
							'Error',
							'No se ha podido modificar los datos de '+$scope.mascota.mStNombre+' !',
							'error'
							);
					});
				
			} else {

				$http.post('guardarMascota',{
					mChSexo:$scope.mascota.mChSexo,
					mDtFechaNacimiento:$scope.mDtFechaNacimiento,
					mInEsterilizado:$scope.mascota.mInEsterilizado,
					mStNombre:$scope.mascota.mStNombre,
					eInEspeciePk:$scope.eInEspeciePk,
					cInClientePk:$scope.cliente.cInClientePk
				})			
				.success(function(data){
					console.log("logeo exitoso");
					swal(   
						'Registrado!',
						'Los datos de '+$scope.mascota.mStNombre+' han sido registrados exitosamente!',
						'success' 
						);
				})
				.error(function(err){
					swal(       
							'Error',
							'No se ha podido registrado los datos de '+$scope.mascota.mStNombre+' !',
							'error'
							);
					});
			}
		}
		}
		$scope.eliminarMascota=function(mascota){
			$http.post('eliminarMascota',{
				mInMascotaPk:mascota.mInMascotaPk,
		})			
			.success(function(data){
				console.log("logeo exitoso");
				swal(   
					'Eliminado!',
					'Los datos de '+mascota.mStNombre+' han sido eliminado exitosamente!',
					'success' 
					);
			})
			.error(function(err){
				swal(       
						'Error',
						'No se ha podido eliminar los datos de '+mascota.mStNombre+' !',
						'error'
						);
				});
			
		}
		
		
		
		
  });
  