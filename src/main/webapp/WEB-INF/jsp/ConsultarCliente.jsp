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
				<b>Clientes: </b> <br>

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
							<th data-field="fullName">DNI</th>
							<th data-field="fullName">Nombres</th>
							<th data-field="fullName">Apellido Paterno</th>
							<th data-field="fullName">Apellido Materno</th>
							<th data-field="fullName">Sexo</th>
							<th data-field="fullName">Fecha de Nacimiento</th>
							<th data-field="fullName">Teléfono</th>
							<th data-field="fullName">Dirección</th>
							<th data-field="fullName">Correo</th>
							<th data-field="fullName">Editar</th>
							<th data-field="fullName">Eliminar</th>
						</tr>
					</thead>
					<tbody>


						<tr
							ng-repeat="cliente in clientes | orderBy:predicate:reverse | filter:searchText | limitTo:10">
							<td>{{cliente.cInDni}}</td>
							<td>{{cliente.cStNombres}}</td>
							<td>{{cliente.cStApellidoPaterno}}</td>
							<td>{{cliente.cStApellidoMaterno}}</td>
							<td>{{cliente.cChSexo}}</td>
							<td>{{cliente.cDtFechaNacimiento}}</td>
							<td>{{cliente.cInTelefono}}</td>
							<td>{{cliente.cStDireccion}}</td>
							<td>{{cliente.cStCorreo}}</td>
							<td><a href="#" ng-click=" modificarCliente(cliente);"><i class="material-icons right">mode_edit</i></a></td>
							<td><a href="#" ng-click="eliminarCliente(cliente);"><i class="material-icons right">delete</i></a></td>
						</tr>
					</tbody>
				</table>

				<div class="row" ng-show="flag==1">
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="cliente.cStNombres"> <label
							for="icon_prefix">Nombres</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">credit_card</i> <input
							id="icon_telephone" type="tel" class="validate" ng-model="cliente.cInDni"> <label
							for="icon_telephone">DNI</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate" ng-model="cliente.cStApellidoPaterno"> <label
							for="icon_prefix">Apellido Paterno</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">account_circle</i> <input
							id="icon_prefix" type="text" class="validate"ng-model="cliente.cStApellidoMaterno"> <label
							for="icon_prefix">Apellido Materno</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">phone</i> <input
							id="icon_telephone" type="tel" class="validate" ng-model="cliente.cInTelefono"> <label
							for="icon_telephone">Teléfono</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">email</i> <input
							id="icon_telephone" type="tel" class="validate" ng-model="cliente.cStCorreo"> <label
							for="icon_telephone">Correo Electrónico</label>
					</div>
					<div class="input-field col s12 m12 l6">
						<i class="material-icons prefix">home</i> <input
							id="icon_telephone" type="tel" class="validate" ng-model="cliente.cStDireccion"> <label
							for="icon_telephone">Dirección</label>
					</div>
					<div class="input-field col s12 m12 l6" ng-show="modificar==0">
						<label for="inputCreated">Fecha de Nacimiento</label> <input input-date
							type="text" name="created" id="inputCreated"
							ng-model="cDtFechaNacimiento" container="body" format="dd/mm/yyyy"
							months-full="{{ month }}" months-short="{{ monthShort }}"
							weekdays-full="{{ weekdaysFull }}"
							weekdays-short="{{ weekdaysShort }}"
							weekdays-letter="{{ weekdaysLetter }}" disable="disable"
							min="{{ minDate }}" max="{{ maxDate }}" today="today"
							clear="clear" close="close" select-years="15"
							on-start="onStart()" on-render="onRender()" on-open="onOpen()"
							on-close="onClose()" on-set="onSet()" on-stop="onStop()" />

						<!-- 						<i class="material-icons prefix">today</i> <input -->
						<!-- 							id="icon_telephone" type="tel" class="validate"> <label -->
						<!-- 							for="icon_telephone">Fecha de Nacimiento</label> -->
					</div>
					<div class="input-field col s12 m12 l6">
						<select class=""
							ng-model="cliente.cChSexo" material-select watch
							data-placeholder="Seleccione" >
							<option value="F" >Femenino</option>
							<option value="M" >Masculino</option>
						</select> <label
							for="icon_telephone">Sexo</label>
					</div>						
				</div>
			</div>
		</div>

<!-- pets wc-->
	</div>



		<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
			<a class="btn-floating btn-large red" ng-show="flag==0; " ng-click="flag=1;"><i class="material-icons">add</i></a>
			<a class="btn-floating btn-large red" ng-show="flag==1;" ng-click="flag=0; saveCliente();"><i class="material-icons">save</i></a>
<!-- 		    <a class="btn-floating btn-large red" ng-show="flag==" ng-click="flagbtn=0; actualizarCliente();"><i class="material-icons">pets</i></a> -->
		</div>

	<footer>
  		<div class="primero_f"> </div>
	</footer>

		<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/js/sweetalert2.js" />"></script>
		<script src="<c:url value="/resources/js/materialize.min.js" />"></script>
		<script src="<c:url value="/resources/bower_components/angular/angular.js" />"></script>
		<script src="<c:url value="/resources/bower_components/angular-materialize/src/angular-materialize.js" />"></script>
		<script src="<c:url value="/resources/scripts/ClienteCtrl.js" />"></script>
<script type="text/javascript">
$(".button-collapse").sideNav();

$(".dropdown-button").dropdown();
</script>	
</body>
</html>