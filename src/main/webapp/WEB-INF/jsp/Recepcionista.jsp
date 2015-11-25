<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<head>
		<title>Siscliv - Recepcionista</title>
		<link rel="stylesheet" href = "<c:url value='/resources/css/materialize.min.css'/>">
		<link href="<c:url value='https://fonts.googleapis.com/icon?family=Material+Icons'/>" rel="stylesheet">
	</head>
	<body class = "blue-grey lighten-3">

		<div class="navbar-fixed">
			<nav class = "blue-grey darken-1" style= "height:80px;">
			    <div class="nav-wrapper">
			    	<a href="#!" class="brand-logo">
				      	<img src="<c:url value="Imagenes/logo3.png"/>" class = "responsive-img " style= "padding:10px;height:60px;">
				      	Siscliv - Recepcionista
			    	</a>
			      	<a href="#" data-activates="mobile-demo" class="button-collapse"><i class="mdi-navigation-menu"></i></a>
			      	<ul class="right hide-on-med-and-down">
			      		<li><a href="<c:url value='Inicio'/>">Inicio</a></li>
			        	<li><a href="<c:url value='LoguinTrabajador.html'/>">Salir</a></li>
			      	</ul>
			      	<ul class="side-nav" id="mobile-demo">
			        	<li><a href="<c:url value='Inicio'/>">Inicio</a></li>
			        	<li><a href="<c:url value='LoguinTrabajador.html'/>">Salir</a></li>
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
							<a href="#tab1"  style= "color:45666A;">
								Servicios
							</a>
						</li>
						<li class = "tab col s2" >
							<a href="#tab2" style= "color:45666A;">
								Clientes
							</a>
						</li>
						<li class = "tab col s2">
							<a href="#tab3" style= "color:45666A;">
								Mascotas
							</a>
						</li>
						<li class = "tab col s2"></li>
						<li class = "tab col s2"></li>
						<li class = "tab col s2"></li>
					</ul>
				</div>
		</div>

		<div class= "container grey lighten-2 z-depth-1" id = "tab1" style = "padding:20px;width:80%;min-width:800px">
			Relacion de Mascotas
			<div class="row">
			    <div class="input-field col s3">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_x" type="text" class="validate">
			        <label for="icon_prefix_x">Buscar</label>
			    </div>
			</div>
			<div class="row" >
				<div class="col s5" >
					<table class="bordered highlight centered z-depth-1 blue-grey lighten-4">
						<thead>
						          	<tr>
						              	<th data-field="1">NHistoria</th>
						              	<th data-field="2">Mascota</th>
						              	<th data-field="2">Dueno</th>
						          	</tr>
						</thead>

						 <tbody>
						          	<tr>
						            	<td>100</td>
						            	<td>Max</td>
						            	<td>Samir Alarcon</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>200</td>
						            	<td>Osa</td>
						            	<td>Kelly Pinedo</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>300</td>
						            	<td>Pelusa</td>
						            	<td>Wilmer Quispe</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>400</td>
						            	<td>Patada</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>500</td>
						            	<td>Pluto</td>
						            	<td>Carlos Ramires</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
				        </tbody>
				    </table>
				</div>
				<div class="col s7">
							Servicios del Dia
							<table class="bordered highlight centered z-depth-1 blue-grey lighten-4" style="table-layout:fixed">
						        <thead>
						          	<tr>
						              	<th data-field="1">Cliente</th>
						              	<th data-field="2">Mascota</th>
						              	<th data-field="2">TipoServicio</th>
						              	<th data-field="2">Medico</th>
						          	</tr>
						        </thead>
						        <tbody>
						          	<tr>
						            	<td>Samir Alarcon</td>
						            	<td>Oso</td>
						            	<td>Consulta</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Estiven Gabriel</td>
						            	<td>Max</td>
						            	<td>Consulta</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Carlos Ramires</td>
						            	<td>Meca</td>
						            	<td>Banio/Peluqueria</td>
						            	<td></td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Kelly Pinedo</td>
						            	<td>Cuto</td>
						            	<td>Consulta</td>
						            	<td>Leonardo Ipchas</td>
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
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">account_circle</i>
			      	<input value="Samir Alarcon" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Cliente</label>
			    </div>
			    <div class="input-field col s3">
				    <select>
				      <option value="1">Consulta</option>
				      <option value="2">Banio/Peluqueria</option>
				      <option value="3">Tratamiento</option>
				    </select>
				    <label>Tipo de Servicio</label>
				 </div>
			</div>
			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_identity</i>
			      	<input value="Max" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Mascota</label>
			    </div>
			    <div class="input-field col s3">
				    <select>
				      <option value="1">Mayra Davila</option>
				      <option value="2">Leonardo Ipchas</option>
				    </select>
				    <label>Medico</label>
				 </div>

			</div>
			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_contact_calendar</i>
			      	<input value="11 de Noviembre 2015" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Fecha</label>
			    </div>
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Guardar"class = "btn modal-trigger"  href="#modal1">
				 </div>
				
			</div>
		</div>

		<div class= "container grey lighten-2 z-depth-1" id = "tab2" style = "padding:20px;width:80%;min-width:800px">
			Relacion de Clientes
			<div class="row">
			    <div class="input-field col s3">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_o" type="text" class="validate">
			        <label for="icon_prefix_o">Buscar</label>
			    </div >
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Nuevo Cliente"class = "btn" >
				 </div>
			</div>
			<div class="row">
				<div class="col s12" >
					<table class="bordered highlight centered z-depth-1 blue-grey lighten-4">
						<thead>
						          	<tr>
						              	<th data-field="1">DNI</th>
						              	<th data-field="2">Nombre</th>
						              	<th data-field="2">Apellidos</th>
						              	<th data-field="1">Fecha de Nacimiento</th>
						              	<th data-field="2">Email</th>
						              	<th data-field="2">Direccion</th>
						              	<th data-field="2">Telefono</th>
						          	</tr>
						</thead>

						 <tbody>
						          	<tr>
						            	<td>47567219</td>
						            	<td>Samir</td>
						            	<td>Alarcon Pillco</td>
						            	<td>18 de Febrero 1992</td>
						            	<td>stm_02@hotmail.com</td>
						            	<td>Villa el Salvador Mz A Lt 30</td>
						            	<td>990643599</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>

						          	<tr>
						            	<td>42364245</td>
						            	<td>Gabriel</td>
						            	<td>Alarcon Pillco</td>
						            	<td>22 de Noviembre 1994</td>
						            	<td>estiven22@hotmail.com</td>
						            	<td>Villa el Salvador Mz A Lt 30</td>
						            	<td>934643579</td>
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
			</div>
			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">recent_actors</i>
			      	<input value="47567219" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">DNI</label>
			    </div>
			    <div class="input-field col s3">
					<i class="material-icons prefix">contact_phone</i>
			      	<input value="990643599" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Telefono</label>
			    </div>
			    <div class="input-field col s3">
			    	<label>Fecha de Nacimiento</label>
					 <input type="date" class="datepicker">
			    </div>
			    

			</div>
			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_contact_calendar</i>
			      	<input value="Samir" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Nombre</label>
			    </div>
			    <div class="input-field col s3">
					<i class="material-icons prefix">email</i>
			      	<input value="stm_02@hotmail.com" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Email</label>
			    </div>
			    
				
			</div>
			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_contact_calendar</i>
			      	<input value="Alarcon Pillco" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Apellidos</label>
			    </div>
			    <div class="input-field col s3">
					<i class="material-icons prefix">store</i>
			      	<input value="Villa el Salvador Mz A Lt 30" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Direccion</label>
			    </div>
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Guardar"class = "btn modal-trigger"  href="<c:url value='#modal1'/>">
				 </div>
				
			</div>
		</div>

		<div class= "container grey lighten-2 z-depth-1" id = "tab3" style = "padding:20px;width:80%;min-width:800px">
			<div class = "row">
				<div class="input-field col s3">
					Relacion de clientes
				</div>
				<div class="input-field col s1">
				</div>
				<div class="input-field col s3">
					Relacion de mascotas
				</div>
			</div>

			<div class="row">
			    <div class="input-field col s2">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_c" type="text" class="validate">
			        <label for="icon_prefix_c">Buscar Ciente</label>
			    </div >
			    <div class = "input-field col s2">
			    </div>
			    <div class="input-field col s2">
			        <i class="material-icons prefix">search</i>
			        <input id="icon_prefix_m" type="text" class="validate">
			        <label for="icon_prefix_m">Buscar Mascota</label>
			    </div >
			</div>

			<div class="row" >
				<div class="col s4" >
					<table class="bordered highlight centered z-depth-1 blue-grey lighten-4">
						<thead>
						          	<tr>
						              	<th data-field="1">DNI</th>
						              	<th data-field="2">Nombre</th>
						          	</tr>
						</thead>

						 <tbody>
						          	<tr>
						            	<td>47567219</td>
						            	<td>Samir Alarcon</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>56473920</td>
						            	<td>Kelly Pinedo</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>75866426</td>
						            	<td>Wilmer Quispe</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>65749387</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">playlist_add</i>
						            		</a>
						            	</td>
						          	</tr>
				        </tbody>
				    </table>
				</div>
				<div class="col s8">
							<table class="bordered highlight centered z-depth-1 blue-grey lighten-4" style="table-layout:fixed">
						        <thead>
						          	<tr>
						              	<th data-field="1">Cliente</th>
						              	<th data-field="2">Mascota</th>
						              	<th data-field="2">TipoServicio</th>
						              	<th data-field="2">Medico</th>
						          	</tr>
						        </thead>
						        <tbody>
						          	<tr>
						            	<td>Samir Alarcon</td>
						            	<td>Oso</td>
						            	<td>Consulta</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Estiven Gabriel</td>
						            	<td>Max</td>
						            	<td>Consulta</td>
						            	<td>Mayra Davila</td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Carlos Ramires</td>
						            	<td>Meca</td>
						            	<td>Banio/Peluqueria</td>
						            	<td></td>
						            	<td>
						            		<a href="#">
												<i class="material-icons prefix">loyalty</i>
												<i class="material-icons prefix">delete</i>
						            		</a>
						            	</td>
						          	</tr>
						          	<tr>
						            	<td>Kelly Pinedo</td>
						            	<td>Cuto</td>
						            	<td>Consulta</td>
						            	<td>Leonardo Ipchas</td>
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
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">account_circle</i>
			      	<input value="Samir Alarcon" id="cliente" type="text" class="validate">
			      	<label class="active" for="cliente">Cliente</label>
			    </div>
			    <div class="input-field col s3">
				    <select>
				      <option value="1">Si</option>
				      <option value="2">No</option>
				    </select>
				    <label>Castrado</label>
				 </div>
			    <div class="input-field col s3">
			    	<label>Fecha de castracion</label>
					 <input type="date" class="datepicker">
			    </div>
			</div>

			<div class="row">
				<div class="input-field col s3">
					<i class="material-icons prefix">perm_identity</i>
			      	<input value="Samir" id="first_name2" type="text" class="validate">
			      	<label class="active" for="first_name2">Mascota</label>
			    </div>
			    <div class="input-field col s3">
				    <select>
				      <option value="1">Perro</option>
				      <option value="2">Gato</option>
				    </select>
				    <label>Tipo</label>
				 </div>
				 <div class = "input-field col s3">
				 	<INPUT type="button" value="Generar Carnet"class = "btn modal-trigger"  href="#Carnet">
				 </div>
			</div>

			<div class="row">
				 <div class="input-field col s3">
					<i class="material-icons prefix">visibility</i>
			      	<input value="Boxer" id="raza" type="text" class="validate">
			      	<label class="active" for="raza">Raza</label>
			    </div>
			    <div class="input-field col s3">
				    <select>
				      <option value="1">Masculino</option>
				      <option value="2">Femenino</option>
				    </select>
				    <label>Sexo</label>
				 </div>
			    <div class = "input-field col s3">
				 	<INPUT type="button" value="Guardar"class = "btn modal-trigger"  href="<c:url value='#modal1'/>">
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

		<footer class="page-footer #e0e0e0 grey lighten-2">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <p aling="center" class="blue-text"><img src="<c:url value="Imagenes/logo3.png"/>" style="height: 60px; align:center; " >Sistema de Veterinaria ... </p>
                
                <p class="blue-text ">Curso    :  Taller de Proyectos 2 </p>
                <p class="blue-text ">Profesor :  Chavez </p>

              </div>
              <div class="col l4 offset-l2 s12">
                <h5 class="blue-text">Integrantes</h5>
                <ul>
                  <li><a class="blue-text " href="#!">alumno   codigo</a></li>
                  <li><a class="blue-text " href="#!">alumno  codigo</a></li>
                  <li><a class="blue-text " href="#!">alumno   codigo</a></li>
                  <li><a class="blue-text " href="#!">alumno  codigo</a></li>
                  <li><a class="blue-text " href="#!">alumno   codigo</a></li>
                  <li><a class="blue-text " href="#!">alumno  codigo</a></li>
                </ul>
              </div>
            </div>
          </div>
          <div class="footer-copyright blue-text">
            <div class="container">
            © 2015 Copyright Text
            <a class="blue-text right" >Grupo Nro. 4</a>
            </div>
          </div>
        </footer>

	<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
		<script src="<c:url value="/resources/js/materialize.min.js"/>"></script>
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