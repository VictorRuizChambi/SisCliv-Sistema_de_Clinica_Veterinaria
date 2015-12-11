<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html ng-app="Historialapp">
<head>

<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/materialize.min.css'/>"
	media="screen,projection" />
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/font-awesome.css'/>"
	media="screen,projection" />
<link type="text/css" rel="stylesheet"
	href="<c:url value='/resources/css/sweetalert2.css'/>"
	media="screen,projection" />
<link
	href="<c:url value='https://fonts.googleapis.com/icon?family=Material+Icons'/>"
	rel="stylesheet">
<title>Clientes</title>
</head>
<body class="indigo lighten-5" ng-controller="micontrolador">
	<div class="navbar-fixed">
		<nav>
			<div class="nav-wrapper indigo darken-2">
				<a class="brand-logo white-text text-darken-2">&nbsp&nbsp&nbspHistorial Médico</a>				
			
			</div>
		</nav>
	</div>
	<br>

	<div class="row">
		<div class="col s4">
			<img src="<c:url value='/resources/Otros/Imagenes/mascota.jpg'/>"
				class="circle responsive-img" style="width: 44%;" align=center >
		</div>
		
	</div>
	<div class="row">
		
		<div class="input-field col s12 m12 l6">
			<input placeholder="Cliente"  id="apellido" type="text" class="validate" readonly ng-model="cliente"> 
			<label for="apellido">Cliente</label>
		</div>
	</div>
	
	<div class=" card-panel indigo lighten-5" ng-init="flag=0">

		<!-- 		<div class="row"> -->
		<div class="col s12 m12 l12 ">
			<div class="input-field card-panel">
				<b>Historial Médico: </b> <br>

				<!--  -->


				<div class="input-field col s12 m6" ng-show="flag==0">
					<input style="border-radius: 4px;" id="fullname" type="text"
						name="search" ng-model="searchText" /> <label for="fullname"
						class="active"> <span class="fa fa-search"></span>
						Busqueda:
					</label>
				</div>

				<table class=" bordered striped hoverable centered responsive-table"
					ng-show="flag==0">
					<thead>
						<tr>
							<th data-field="fullName">Historial</th>
							<th data-field="fullName">Fecha</th>
							<th data-field="fullName">Doctor</th>
							<th data-field="fullName">Especialidad</th>							
							<th data-field="fullName">Mascota</th>								
						</tr>
					</thead>
					<tbody>


						<tr
							ng-repeat="servicioMascota in servicioMascotaList | orderBy:predicate:reverse | filter:searchText | limitTo:10">
							<td>{{servicioMascota.historial.hInHistorialPk}}</td>
							<td>{{servicioMascota.smDtFechaServicio}}</td>
							<td>{{servicioMascota.trabajador.tStNombres}}</td>
							<td>{{servicioMascota.servicio.sStNombre}}</td>							
							<td>{{servicioMascota.historial.mascota.mStNombre}}</td>
							
						</tr>
					</tbody>
				</table>


			</div>
		</div>

		<!-- pets wc-->
	</div>

	<footer>
		<div class="primero_f"></div>
	</footer>

	<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
	<script src="<c:url value="/resources/js/sweetalert2.js" />"></script>
	<script src="<c:url value="/resources/js/materialize.min.js" />"></script>
	<script
		src="<c:url value="/resources/bower_components/angular/angular.js" />"></script>
	<script
		src="<c:url value="/resources/bower_components/angular-materialize/src/angular-materialize.js" />"></script>
	<script src="<c:url value="/resources/scripts/HistorialCtrl.js" />"></script>
	<script type="text/javascript">
		$(".button-collapse").sideNav();

		$(".dropdown-button").dropdown();
	</script>