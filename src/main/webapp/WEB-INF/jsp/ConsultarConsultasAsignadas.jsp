<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html ng-app="miapp">
	<head>
	
      <link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/materialize.min.css'/>" media="screen,projection"/>     
      <link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/font-awesome.css'/>"  media="screen,projection"/>
      <link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/sweetalert2.css'/>"    media="screen,projection"/>
<%--       <link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/bootstrap.css'/>"    media="screen,projection"/> --%>
<%--       <link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/calendar.min.css'/>"    media="screen,projection"/>  --%>
      <link href="<c:url value='https://fonts.googleapis.com/icon?family=Material+Icons'/>" rel="stylesheet">     
     <title>Clientes</title>
		
	
	</head>
	<body class="indigo lighten-5" ng-controller="micontrolador" >
	<div class="navbar-fixed">
		<nav>
			<div class="nav-wrapper indigo darken-2">
				<a class="brand-logo white-text text-darken-2">&nbsp&nbsp&nbspSISCLIV</a>
				<a href="#" data-activates="mobile-demo" class="button-collapse"><i
					class="material-icons indigo darken-2">menu</i></a>
				<ul class="right hide-on-med-and-down">
					<li><a href="ConsultarCliente" class="white-text text-darken-2">Cliente </a></li>
					<li><a href="ConsultarMascota" class="white-text text-darken-2">Mascota</a></li>
<!-- 					<li><a class="dropdown-button" href="ConsultarCliente">Clientes</a></li> -->
<!-- 					<li><a class="dropdown-button" href="ConsultarMascota">Mascotas</a></li> -->
					<li><a class="dropdown-button" href="#!">Servicios</a></li>
				</ul>
				<ul class="side-nav" id="mobile-demo">
					<li><a href="ConsultarCliente" class="blue-text text-darken-2">Cliente </a></li>
					<li><a href="ConsultarMascota" class="blue-text text-darken-2">Mascota</a></li>
					<li><a href="obras" class="blue-text text-darken-2">Servicios</a></li>
				</ul>
			</div>
		</nav>
	</div>
		<br>

	<div class=" card-panel indigo lighten-5" ng-init="flag=0">

		<!-- 		<div class="row"> -->
		<div class="col s12 m12 l12 " >
			<div class="input-field card-panel" >
				<b>Consultas: </b> <br>

				<!--  -->


				<div class="input-field col s12 m6" ng-show="flag==0">
					<input style="border-radius: 4px;" id="fullname" type="text"
						name="search" ng-model="searchText" /> <label for="fullname"
						class="active"> <span class="fa fa-search"></span>
						Busqueda:
					</label>
				</div>
				<table class=" bordered striped hoverable centered responsive-table" ng-show="flag==0">
					<thead>
						<tr>
							<th data-field="fullName">N°</th>
							<th data-field="fullName">Mascota</th>
							<th data-field="fullName">Historia</th>
							<th data-field="fullName">Cliente</th>
							<th data-field="fullName">Apellido Paterno</th>
							<th data-field="fullName">Apellido Materno</th>
							<th data-field="fullName">Fecha</th>
							<th data-field="fullName">Atender</th>
						</tr>
					</thead>
					<tbody>


						<tr
							ng-repeat="consulta in consultas | orderBy:predicate:reverse | filter:searchText | limitTo:10">
							<td>{{consulta.smInServicioMascotaPk}}</td>
							<td>{{consulta.historial.mascota.mStNombre}}</td>
							<td>{{consulta.historial.hInHistorialPk}}</td>
							<td>{{consulta.historial.mascota.cliente.cStNombres}}</td>
							<td>{{consulta.historial.mascota.mStApellidoPaterno}}</td>
							<td>{{consulta.historial.mascota.mStApellidoMaterno}}</td>
							<td>{{consulta.smDtFechaServicio}}</td>
							

							<td><a href="#"   ng-click="asignarServicioMascota(consulta); "><i class="material-icons right">pets</i></a></td>
						</tr>
					</tbody>
				</table>
				<div class="row" ng-show="flag==1">
					<div class="input-field col s12 m12 l6" >
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="consulta.historial.mascota.mStNombre" disabled> <label
							for="icon_prefix">Nombres</label>
					</div>
					
<!-- 					CONSULTA -->
					<div class="input-field col s12 m12 l6" ng-show="usuario==2 && servicio==1">
						<i class="material-icons prefix">hot_tub</i> <input
							id="icon_telephone" type="tel" class="validate" ng-model="temperatura"> <label
							for="icon_telephone">Temperatura</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==2 && servicio==1">
						<i class="material-icons prefix">room_service</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="peso"> <label
							for="icon_prefix">Peso</label>
					</div>
					<div class="input-field col s12 m12 s6" ng-show="usuario==2 && servicio==1">
						<i class="material-icons prefix">mode_edit</i>
						<textarea id="icon_prefix2" class="materialize-textarea" ng-model="ObservacionesConsulta"></textarea>
						<label for="icon_prefix2">Observaciones</label>
					</div>
<!-- 					TRATAMIENTO -->
					<div class="input-field col s12 m12 s6" ng-show="usuario==3 && servicio==3">
						<i class="material-icons prefix">mode_edit</i>
						<textarea id="icon_prefix2" class="materialize-textarea" ng-model="ObservacionesTratamiento"></textarea>
						<label for="icon_prefix2">Observaciones de Tratamiento</label>
					</div>
					
					
<!-- 					ANALISIS DE SANGRE -->
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="leucositos" > <label
							for="icon_prefix">Leucositos</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="hematies" > <label
							for="icon_prefix">Hematies</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="hematocrito" > <label
							for="icon_prefix">Hematocrito</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="hemoglobina" > <label
							for="icon_prefix">Hemoglobina</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="vmc" > <label
							for="icon_prefix">Vmc</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="chm" > <label
							for="icon_prefix">Chm</label>
					</div>
					<div class="input-field col s12 m12 s6"	ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">mode_edit</i>
						<textarea id="icon_prefix2" class="materialize-textarea"
							ng-model="ObservacionesSangre"></textarea>
						<label for="icon_prefix2">Observaciones de Análisis de Sangre</label>
					</div>

<!-- 					UROLOGIA -->
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="color" > <label
							for="icon_prefix">Color</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="aspecto" > <label
							for="icon_prefix">Aspecto</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="densidad" > <label
							for="icon_prefix">Densidad</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="ph" > <label
							for="icon_prefix">Ph</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="proteinas" > <label
							for="icon_prefix">Proteinas</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="billiabuinos" > <label
							for="icon_prefix">Billiabuinos</label>
					</div>
					<div class="input-field col s12 m12 s6"	ng-show="usuario==3 && servicio==7">
						<i class="material-icons prefix">mode_edit</i>
						<textarea id="icon_prefix2" class="materialize-textarea"
							ng-model="ObservacionesUrologia"></textarea>
						<label for="icon_prefix2">Observaciones de Urología</label>
					</div>				
				</div>
			</div>
		</div>

<!-- pets wc-->
	</div>



		<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
			<a class="btn-floating btn-large red" ng-show="flag==1;" ng-click="flag=0; saveServicio();"><i class="material-icons">save</i></a>
		</div>

	<footer>
  		<div class="primero_f"> </div>
	</footer>

		<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/js/sweetalert2.js" />"></script>
		<script src="<c:url value="/resources/js/materialize.min.js" />"></script>
		<script src="<c:url value="/resources/bower_components/angular/angular.js" />"></script>
		<script src="<c:url value="/resources/bower_components/angular-materialize/src/angular-materialize.js" />"></script>
		<script src="<c:url value="/resources/scripts/MedicoCtrl.js" />"></script>
<script type="text/javascript">
$(".button-collapse").sideNav();

$(".dropdown-button").dropdown();
</script>	
</body>
</html>