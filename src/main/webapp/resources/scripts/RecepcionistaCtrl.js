angular.module('recepcionistaapp', [])
	.controller("recepcionistacontrolador",function($scope , $http){
		
		$scope.codigo="";
		$scope.cliente="";
		$scope.mascota="";
		
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
//Peticion para traer todos las mascotas
		$http.get('getMascotas')
			.success(function(data){
				$scope.mascotas = data;
				console.log($scope.mascotas+"devolvio algo");
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
		$scope.saveCliente = function() {
		  
				$http.post('saveCliente', {
					"sexo" : $scope.cliente.cChSexo,
					"fechanacimiento" : $scope.cliente.cDtFechaNacimiento,
					"dni":$scope.cliente.cInDni,
					"apellidoMaterno":$scope.cliente.cStApellidoMaterno,
					"apellidoPaterno" : $scope.cliente.cStApellidoPaterno,
					"direccion":$scope.cliente.cStDireccion,
					"correo":$scope.cliente.cStCorreo,
					"nombres" :$scope.cliente.cStNombres

				}).then(function(response) {
				console.log("se guardo correctamente");

				}, function(response) {
					$scope.cliente="";
					console.log("no se guardo");
				});

			}
		
		
		$scope.setCliente=function(cliente){
			console.log(cliente);
			$scope.cliente=cliente;
		}
		$scope.setMascota=function(mascota){
			console.log(mascota);
			$scope.mascota=mascota;
		}
		
		
		
		
		
  });
  