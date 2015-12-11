<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html lang="en" ng-app="UsuarioApp">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Veterinaria</title>

<link rel="stylesheet"
	href="<c:url value='http://fonts.googleapis.com/css?family=Roboto:400,100,300,500'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/Cliente/bootstrap/css/bootstrap.min.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/Cliente/font-awesome/css/font-awesome.min.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/Cliente/css/form-elements.css'/>">
<link rel="stylesheet"
	href="<c:url value='/resources/Cliente/css/style.css'/>">



</head>

<body ng-controller="controllerReservarCita">

	<section class="contact-parlex1">
		<div class="parlex-back">
			<div class="container">
				<div class="row">
					<div class="col-sm-8 col-sm-offset-2 text">
						<h1>
							<strong>Reservar Cita</strong>
						</h1>
					</div>
				</div>
				<div class="row">
					<div class="form-top">
						<div class="form-top-left">
							<h3>Reserva tu cita, llene</h3>
							<p>Por favor llene los datos solicitados:</p>
						</div>
						<div class="form-top-right">
							<i class="glyphicon glyphicon-user"></i>
						</div>
					</div>
					<div class="form-bottom">


						<div class="form-group">
							<label for="dni">DNI</label> <input type="text"
								class="form-control" name="dni" id="dni" value
								title="Su numero de dni" ng-model="dni" readonly>
						</div>
						</br>
										
						<div class="form-group">
							<label for="dni">Fecha (dd/mm/aa)</label> <input type="text"
								class="form-control" name="dni" id="dni"
								title="Por favor ingrese la fecha de la cita" ng-model="fecha">
						</div>				
						</br>

						<div class="row form-group">
							<div class="col-md-6">
								<input class="btn btn-lg btn-primary" type="button"
									ng-click="ReservarCita();" value="Reservar">
							</div>

							<div class="col-md-6">
								<input class="btn btn-lg btn-primary" type="button"
									ng-click="VerHistorial();" value="Ver Historial">
							</div>

						</div>
						</br>

						<div class="row form-group">
							<div class="col-md-3">
								<input class="btn btn-lg btn-primary" type="button"
									ng-click="CerrarSesion();" value="Cerrar Sesion">
							</div>
						</div>



					</div>
				</div>
			</div>
		</div>
	</section>
	<script
		src="<c:url value='/resources/Cliente/js/jquery-1.11.1.min.js'/>"></script>
	<script
		src="<c:url value='/resources/Cliente/bootstrap/js/bootstrap.min.js'/>"></script>
	<script
		src="<c:url value='/resources/Cliente/js/jquery.backstretch.min.js'/>"></script>
	<script src="<c:url value='/resources/Cliente/js/scripts.js'/>"></script>
	<script
		src="<c:url value='/resources/InicioFinal/js/bootstrap-datepicker.js'/>"></script>
	<script src="<c:url value='/resources/js/jquery.min.js'/>"></script>
	<script
		src="<c:url value="/resources/bower_components/angular/angular.js" />"></script>
	<script src="<c:url value="/resources/scripts/UsuarioCtrl.js" />"></script>



</body>
</html>
