angular.module('recepcionistaapp', [])
	.controller("recepcionistacontrolador",function($scope , $http){
		
		$scope.codigo="";
		$scope.cliente="";
		$scope.index=-1;
		
// Peticion para traer todos los clientes
		$http.get('getClientes')
			.success(function(data){
				$scope.clientes = data;
				console.log($scope.clientes+"devolvio algo");
			})
			.error(function(err){
				console.log("no regreso nada");
				console.log(err);
			});

// Peticion para traer un cliente especifico	
		$scope.getCliente = function(codigo){
		$http.get('getCliente',{
			params : {
				codigo : codigo
			}
		})
		.success(function(data){
			$scope.cliente = data;
			console.log($scope.cliente+"devolvio algo");
		})
		.error(function(err){
			console.log("no regreso nada");
		});
		};
//Peticion para guardar los datos de un cliente		
		$scope.saveCliente = function(sexo,fechaNacimiento,dni,apellidoMaterno,apellidoPaterno,direccion,correo,nombres) {
		  
				$http.post('saveMessageAsociated', {
					"sexo" : sexo,
					"fechanacimiento" : fechaNacimiento,
					"dni":dni,
					"apellidoMaterno":apellidoMaterno,
					"apellidoPaterno" : apellidoPaterno,
					"direccion":direccion,
					"correo":correo,
					"nombres" : nombres

				}).then(function(response) {
				console.log("se guardo correctamente");

				}, function(response) {
					$scope.cliente="";
					console.log("no se guardo");
				});

			}
		
  });
  