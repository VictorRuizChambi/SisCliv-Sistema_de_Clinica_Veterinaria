<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Siscliv - Recepcionista</title>
		<link rel="stylesheet" href="<c:url value='css/materialize.min.css'/>">
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	</head>
	<body class = "blue-grey lighten-3">

		<div class="navbar-fixed">
			<nav class = "blue-grey darken-1" style= "height:80px;">
			    <div class="nav-wrapper">
			    	<a href="#!" class="brand-logo">
				      	
				      	<img src="<c:url value="Imagenes/logo3.png" />" class = "responsive-img " style= "padding:10px;height:60px;" >
				      	Siscliv - Recepcionista
			    	</a>
			      	<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="mdi-navigation-menu"></i></a>
			      	<ul class="right hide-on-med-and-down">
			      		<li><a href="Inicio.html">Inicio</a></li>
			        	<li><a href="LoguinTrabajador.html">Salir</a></li>
			      	</ul>
			      	<ul class="side-nav" id="mobile-demo">
			        	<li><a href="Inicio.html">Inicio</a></li>
			        	<li><a href="LoguinTrabajador.html">Salir</a></li>
			      	</ul>
			    </div>
			 </nav>
		</div>
		<!--
		<br><br>
		<div style = "width:80%" class="row ">
			<div  class="col s1">
				<img src="Imagenes/mascota.jpg" class="responsive-img circle">
			</div>
		</div>
		-->
		
		<br>
		<div class ="row" style = "width:82%;min-width:800px">
				<div class="col s12">
					<ul class= "tabs  blue-grey lighten-4 z-depth-1">
						<li class = "tab col s2">
							<a href="#trabajadores"  style= "color:45666A;">
								Trabajadores
							</a>
						</li>
						<li class = "tab col s2" >
							<a href="#tarifas" style= "color:45666A;">
								Programar Tarifas
							</a>
						</li>
						<li class = "tab col s2"></li>
						<li class = "tab col s2"></li>
						<li class = "tab col s2"></li>
						<li class = "tab col s2"></li>
					</ul>
				</div>
		</div>

		<div class= "container grey lighten-2 z-depth-1" id = "trabajadores" style = "padding:20px;width:80%;min-width:800px">
			Relacion de trabajadores
			<div class="row">
			    <div class="input-field col s3">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_x" type="text" class="validate">
			        <label for="icon_prefix_x">Buscar</label>
			    </div>
			    <div class="input-field col s3">
			       	<input type="submit" class = "btn" value="Nuevo" />
			    </div>
			</div>

			<div class="row" >
				<div class="col s12" >
					<table class="bordered highlight centered z-depth-1 blue-grey lighten-4">
						<thead>
						          	<tr>
						              	<th data-field="1">Codigo</th>
						              	<th data-field="2">DNI</th>
						              	<th data-field="2">Nombres</th>
						              	<th data-field="2">Apellidos</th>
						              	<th data-field="2">Cargo</th>
						              	<th data-field="2">Fecha de Nacimiento</th>
						              	<th data-field="2">Email</th>
						              	<th data-field="2">Direccion</th>
						              	<th data-field="2">Telefono</th>
						          	</tr>
						</thead>

						 <tbody>
						          	<tr>
						            	<td>100</td>
						            	<td>47567219</td>
						            	<td>Samir</td>
						            	<td>Alarcon Pillco</td>
						            	<td>Medico</td>
						            	<td>18 de Febrero de 1992</td>
						            	<td>samir180292@gmail.com</td>
						            	<td>Villa el Salvador Mz A Lt 30</td>
						            	<td>990643599</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
						            		</a>
						            	</td>
						            	<td>
						            		<a href="">
						            			<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>200</td>
						            	<td>43569584</td>
						            	<td>Mayra</td>
						            	<td>Davila Olivos</td>
						            	<td>Clinico</td>
						            	<td>22 de Noviembre de 1992</td>
						            	<td>mayra2@hotmail.com</td>
						            	<td>San juan de miraflres Mz B Lt 1</td>
						            	<td>998065765</td>
										<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
						            		</a>
						            	</td>
						            	<td>
						            		<a href="">
						            			<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	
				        </tbody>
				    </table>
				</div>			
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">account_circle</i>
			      	<input value="47567219" id="dni" type="text" class="validate">
			      	<label class="active" for="dni">DNI</label>
			    </div>
			    <div class="input-field col s3">
				    <i class="material-icons prefix">contact_phone</i>
			      	<input value="990643599" id="telefono" type="text" class="validate">
			      	<label class="active" for="telefono">Telefono</label>
				 </div>
				 <div class="input-field col s3">
				    <i class="material-icons prefix">perm_identity</i>
			      	<input value="Medico" id="cargo" type="text" class="validate">
			      	<label class="active" for="cargo">Cargo</label>
				 </div>
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_identity</i>
			      	<input value="Samir" id="nombre" type="text" class="validate">
			      	<label class="active" for="nombre">Nombre</label>
			    </div>
			    <div class="input-field col s3">
				    <i class="material-icons prefix">store</i>
			      	<input value="Villa el Salvador Mz A Lt 30" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Direccion</label>
				 </div>
				 <div class="input-field col s3">
				 	<label>Fecha de Nacimiento</label>
					 <input type="date" class="datepicker">
				 </div>
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_contact_calendar</i>
			      	<input value="Alarcon Pillco" id="apellidos" type="text" class="validate">
			      	<label class="active" for="apellidos">Apellidos</label>
			    </div>
			    <div class="input-field col s3">
			    	<i class="material-icons prefix">email</i>
			      	<input value="stm_02@hotmail.com" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Email</label>
			    </div>
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Guardar"class = "btn modal-trigger"  href="#modal1">
				 </div>	
			</div>
		</div>

		<div class= "container grey lighten-2 z-depth-1" id = "tarifas" style = "padding:20px;width:80%;min-width:800px">
			Relacion de Tarifas
			<div class="row">
			    <div class="input-field col s3">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_o" type="text" class="validate">
			        <label for="icon_prefix_o">Buscar</label>
			    </div >
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Nuevo"class = "btn" >
				 </div>
			</div>

			<div class="row">
				<div class="col s5" >
					<table class="bordered highlight centered z-depth-1 blue-grey lighten-4">

						<thead>
						          	<tr>
						              	<th data-field="1">Numero Servicio</th>
						              	<th data-field="2">Nombre Servicio</th>
						              	<th data-field="2">Precio establecido</th>
						          	</tr>
						</thead>

						<tbody>
						          	<tr>
						            	<td>123</td>
						            	<td>Consulta</td>
						            	<td>30 Soles</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>

						          	<tr>
						            	<td>213</td>
						            	<td>Tratamiento</td>
						            	<td>10 Soles</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
				        </tbody>

				    </table>
				</div>
				<div class="col s7">
					<div class="row">
						<div class="input-field col s6">
							<i class="material-icons prefix">recent_actors</i>
					      	<input value="Consulta" id="nombre" type="text" class="validate">
					      	<label class="active" for="nombre">Nombre</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s6">
							<i class="material-icons prefix">language</i>
					      	<input value="30 soles" id="precio" type="text" class="validate">
					      	<label class="active" for="precio">Precio</label>
						</div>
					</div>
					<div class="row">
						<div class="input-field col s6">
							<INPUT type="button" value="Guardar"class = "btn modal-trigger"  href="#modal1">
						</div>
					</div>
				</div>
			</div>
			
		</div>


		<div id="modal1" class="modal">
			<div class="modal-content">
				<h4>Esta seguro(a) de realizar esta accion?</h4>
			</div>
			<div class="modal-footer">
			<a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">No</a>
			<a href="#!" class=" modal-action modal-close waves-effect waves-green btn-flat">Si</a>
			</div>
		</div>	

		<div id="Carnet" class="modal modal-fixed-footer" style="width:500px;height:250px">
		    <div class="modal-content">
		      	<h4>Carnet de Mascota</h4>
		      	<div>
					<label>Numero de Historia: 123</label><br>
					<label>Nombre            : Oso</label><br>
					<label>Duenio            : Samir Alarcon</label>
		      	</div>
		    </div>
		    <div class="modal-footer">
		      	<a href="#!" class="modal-action modal-close waves-effect waves-green btn-flat ">Cancelar</a>
		      	<input type="submit" class = "modal-action modal-close  waves-green btn-flat" value="Imprimir" />
		    </div>
		</div>

	
		<script src="<c:url value="js/jquery.min.js" />"></script>
		<script src="<c:url value="js/materialize.min.js" />"></script>
		<script>
			$('.datepicker').pickadate({
			    selectMonths: true, // Creates a dropdown to control month
			    selectYears: 15 // Creates a dropdown of 15 years to control year
			  });
			$(document).ready(function() {
			    $('input#input_text, textarea#textarea1').characterCounter();
			 });
			$(document).ready(function(){
				$(".button-collapse").sideNav();
			})
			$(document).ready(function(){
	    		$('select').material_select();
	  		});
			$(document).ready(function(){
	    		$('ul.tabs').tabs();
	  		});
	  		$(document).ready(function(){
    			$('ul.tabs').tabs('select_tab', 'tab_id');
  			});
  			
  			$('.modal-trigger').leanModal({
			      dismissible: true, // Modal can be dismissed by clicking outside of the modal
			      opacity: .5, // Opacity of modal background
			      in_duration: 300, // Transition in duration
			      out_duration: 200, // Transition out duration
			      ready: function() { alert('Ready'); }, // Callback for Modal open
			      complete: function() { alert('Closed'); } // Callback for Modal close
		    	}
		  	);
		</script>
	</body>
</html>