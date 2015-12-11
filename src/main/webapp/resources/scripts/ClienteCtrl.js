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
	.controller("micontrolador",function($scope , $http){
		$scope.cliente=null;	
		$scope.modificar=0;
		
		$http.get('getClientes')
			.success(function(data){
				$scope.clientes = data;
				console.log($scope.clientes+"devolvio algo");
			})
			.error(function(err){
				console.log("no regreso nada");
			});
//		
		$scope.modificarCliente=function(cliente){
			$scope.flag=1;
			$scope.modificar=1;
			console.log("MODIFICAR CLIENTE");
			console.log($scope.cliente);
			
//			console.log(cliente.cDtFechaNacimiento);
			$scope.cliente=cliente;
			}
		
		
		
		$scope.saveCliente=function(){
			if($scope.cliente==null){
				swal(       
						'Error',
						'Debe ingresar datos!',
						'error'
						);
			}
			else{
				if ($scope.modificar==1) {
					$http.post('actualizarCliente',{
						cInDni:$scope.cliente.cInDni,
						cStNombres:$scope.cliente.cStNombres,
						cStApellidoPaterno:$scope.cliente.cStApellidoPaterno,
						cStApellidoMaterno:$scope.cliente.cStApellidoMaterno,
						cStCorreo:$scope.cliente.cStCorreo,
						cStDireccion:$scope.cliente.cStDireccion,
						cInTelefono :$scope.cliente.cInTelefono,
						cChSexo :$scope.cliente.cChSexo,
						cDtFechaNacimiento:$scope.cliente.cDtFechaNacimiento,
						cInClientePk:$scope.cliente.cInClientePk,
						uInUsuarioPk:$scope.cliente.usuario.uInUsuarioPk
					})			
					.success(function(data){
						console.log("logeo exitoso");
						swal(   
								'Modificado!',
								'Los datos de '+$scope.cliente.cStNombres+' han sido modificados exitosamente!',
								'success' 
								);
					})
					.error(function(err){
						swal(       
								'Error',
								'Datos incorrectos',
								'error'
								);
					});
					
				}else{
				
			$http.post('guardarCliente',{
				cInDni:$scope.cliente.cInDni,
				cStNombres:$scope.cliente.cStNombres,
				cStApellidoPaterno:$scope.cliente.cStApellidoPaterno,
				cStApellidoMaterno:$scope.cliente.cStApellidoMaterno,
				cStCorreo:$scope.cliente.cStCorreo,
				cStDireccion:$scope.cliente.cStDireccion,
				cInTelefono :$scope.cliente.cInTelefono,
				cChSexo :$scope.cliente.cChSexo,
				cDtFechaNacimiento:$scope.cDtFechaNacimiento	
			})			
			.success(function(data){
				console.log("logeo exitoso");
				swal(   
						'Registrado!',
						'Los datos de '+$scope.cliente.cStNombres+' han sido registrados exitosamente!',
						'success' 
						);
			})
			.error(function(err){
				swal(       
						'Error',
						'Datos incorrectos',
						'error'
						);
			});
			
		}
			
			$http.get('getClientes')
			.success(function(data){
				$scope.clientes = data;
				console.log($scope.clientes+"devolvio algo");
			})
			.error(function(err){
				console.log("no regreso nada");
			});
			
			
		}
	
		}
		
			
	
		$scope.eliminarCliente=function(cliente){
		$http.post('deleteCliente',{
			cInClientePk:cliente.cInClientePk,
			})			
			.success(function(data){
				swal(       
						'Eliminado!',
						'Eliminación Exitosa',
						'success'
						);
			})
			.error(function(err){
				swal(       
						'Error',
						'Datos incorrectos',
						'error'
						);
				$scope.logeado=0;
			});
		
		
		$http.get('getClientes')
		.success(function(data){
			$scope.clientes = data;
			console.log($scope.clientes+"devolvio algo");
		})
		.error(function(err){
			console.log("no regreso nada");
		});
		}
		
		
  });
