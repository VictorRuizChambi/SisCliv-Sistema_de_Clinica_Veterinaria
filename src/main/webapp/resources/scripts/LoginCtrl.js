angular
		.module(
				'LoginApp',
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

				}).controller("controllerLogin", function($scope, $http) {

			$scope.verificaUsuario = function() {
				console.log("VERIFICANDO->"+$scope.dni+"      "+$scope.contrasena);
				$http.post('ProcesaLogin', {
					dni : $scope.dni,
					contrasena : $scope.contrasena
				}).success(function(data) {
					swal(
							'Logeo Exitoso',
							'Se ha logueado correctamente',
							'success'
							);
					console.log("logeo exitoso");
					console.log(data);
					switch (data)
					{
					case "1":
						location.href="ConsultarCliente";
						break;
					case "2":
						location.href="ConsultarConsultasAsignadas";
						break;
					case "3":
						location.href="ConsultarConsultasAsignadas";
						break;
					case "5":
						location.href="ReservarCita";
						break;
					}					
					$scope.logeado = 1;					
				}).error(function(err) {
					swal(
					'Error',
					'Contraseña o Usuario incorrecto',
					'error'
					);
					$scope.logeado=0;
				});

			}

		});
