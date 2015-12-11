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
		$scope.usuario=null;
		$scope.servicio=null;
		$scope.consulta=null;	
		$scope.modificar=0;
		
		
		
		
		$scope.temperatura=null;
		$scope.peso=null;
		$scope.ObservacionesConsulta=null;
		$scope.ObservacionesTratamiento=null;
		$scope.leucositos=null;
		$scope.hematies=null;
		$scope.hematocrito=null;
		$scope.hemoglobina=null;
		$scope.vmc=null;
		$scope.chm=null;
		$scope.ObservacionesSangre=null;
		$scope.color=null;
		$scope.aspecto=null;
		$scope.densidad=null;
		$scope.ph=null;
		$scope.billiabuinos=null;
		$scope.ObservacionesUrologia=null;
		$scope.proteinas;
		
		

		
		
		
		$http.get('getConsultas')
			.success(function(data){
				$scope.consultas = data;
				$scope.usuario=$scope.consultas[0].trabajador.usuario.perfil.pInPerfilPk;
				$scope.servicio=$scope.consultas[0].servicio.sInServicioPk;
				console.log("Usuario->"+$scope.usuario);
				console.log("Servicio->"+$scope.servicio);
				console.log($scope.consultas+"devolvio algo");
				
			})
			.error(function(err){
				console.log("no regreso nada");
			});
		
	
		
		$scope.asignarServicioMascota=function(consulta){
			$scope.flag=1; 
			console.log("FLAG->"+$scope.flag);
			console.log("MODIFICAR CLIENTE");
			console.log($scope.consulta);
			
			$scope.consulta=consulta;
			}
	
		
		
		$scope.saveServicio=function(){
			$http.post('saveServicio',{
				sInServicioPk:$scope.servicio,
				smInServicioMascotaPk:$scope.consulta.smInServicioMascotaPk,
				temperatura:$scope.temperatura,
				peso:$scope.peso,
				ObservacionesConsulta:$scopeObservacionesConsulta,
				ObservacionesTratamiento:$scope.ObservacionesTratamiento,
				leucositos:$scope.leucositos,
				hematies :$scope.hematies,
				hematocrito :$scope.hematocrito,
				hemoglobina:$scope.hemoglobina,
				vmc:$scope.vmc,
				chm:$scope.chm,
				ObservacionesSangre:$scope.ObservacionesSangre,
				color :$scope.color,
				aspecto :$scope.aspecto,
				densidad:$scope.densidad,
				ph:$scope.ph,
				billiabuinos :$scope.billiabuinos,
				ObservacionesUrologia :$scope.ObservacionesUrologia,
				proteinas:$scope.proteinas
			})			
			.success(function(data){
				console.log("logeo exitoso");
				swal(   
						'Registrado!',
						'Los datos han sido registrados!',
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

  });
