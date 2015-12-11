angular
		.module(
				'UsuarioApp',
				[],
				function($httpProvider) {
					// Use x-www-form-urlencoded Content-Type
					$httpProvider.defaults.headers.post['Content-Type'] = 'application/x-www-form-urlencoded;charset=utf-8';
					/**
					 * The workhorse; converts an object to
					 * x-www-form-urlencoded serialization.
					 * 
					 * @param {Object}
					 *            obj
					 * @return {String}
					 */
					var param = function(obj) {
						var query = '', name, value, fullSubName, subName, subValue, innerObj, i;

						for (name in obj) {
							value = obj[name];

							if (value instanceof Array) {
								for (i = 0; i < value.length; ++i) {
									subValue = value[i];
									fullSubName = name; // + '.' + i + '';
									innerObj = {};
									innerObj[fullSubName] = subValue;
									query += param(innerObj) + '&';
								}
							} else if (value instanceof Object) {
								for (subName in value) {
									subValue = value[subName];
									fullSubName = name + '.' + subName + '';
									innerObj = {};
									innerObj[fullSubName] = subValue;
									query += param(innerObj) + '&';
								}
							} else if (value !== undefined && value !== null)
								query += encodeURIComponent(name) + '='
										+ encodeURIComponent(value) + '&';
						}

						return query.length ? query.substr(0, query.length - 1)
								: query;
					};

					// Override $http service's default transformRequest
					$httpProvider.defaults.transformRequest = [ function(data) {
						return angular.isObject(data)
								&& String(data) !== '[object File]' ? param(data)
								: data;
					} ];

				}).controller("controllerReservarCita", function($scope, $http) {
					
					$http.get('getUsuario')
					.success(function(data){
						
						$scope.dni = data;
						console.log("devolvio algo"+data );
					})
					.error(function(err){
						console.log("no regreso nada");
					});
					
			$scope.ReservarCita = function() {
				$http.post('ReservarCita', {
					dni : $scope.dni,
					fecha : $scope.fecha
				}).success(function(data) {
					
					console.log("reservar cita exitoso");														
					$scope.logeado = 1;					
				}).error(function(err) {
					console.log("error samir");
//					swal(
//					'Error',
//					'Contraseña o Usuario incorrecto',
//					'error'
//					);
					$scope.logeado=0;
				});

			}
			$scope.CerrarSesion = function() {
				$http.post('CerrarSesion', {
					
				}).success(function(data) {
					console.log("sesseion cerrada con exito");																								
					location.href="Inicio";
				}).error(function(err) {
					console.log("error al cerra sesion");					
				});

			}
			$scope.VerHistorial = function() {
				$http.post('VerHistorial', {					
				}).success(function(data) {
					location.href="Historial";
					console.log("ver historial con exito");																													
				}).error(function(err) {
					console.log("error  ver historial");					
				});

			}

		});
