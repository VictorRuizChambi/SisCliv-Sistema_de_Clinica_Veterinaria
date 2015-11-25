<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
	<!--CABECERA************************************************************************-->
	<head>
		<title>Login</title>
		<!--Materialize*******************************-->
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link type="text/css" rel="stylesheet" href="<c:url value='/resources/css/materialize.min.css'/>" media="screen,projection"/>  
		<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

		<!--Fin Materialize**************************+-->
	</head>
	<!--********************************************************************************-->
	<!--CUERPO**************************************************************************-->
	<body class = "blue-grey lighten-3">

		<div class="navbar-fixed">
			<nav class= "blue-grey darken-1 " style="height:130px;">
				<div class = "nav-wrapper">
					<div class="row">
						<div class="col s1 "  >
							<img src="Imagenes/logo3.png" class = "responsive-img " style= "margin: auto;"s>
						</div>
						<div class="col s11">
							<h2>VETERINARIA SISCLIV - Login</h2>
						</div>
					</div>	
				</div>
			</nav>
		</div>
		<br><br><br>
		<div class="row">
			<div class="col s7">
				<div class="slider ">
					<ul class="slides">
						<li>
							<img src="<c:url value='/resources/Imagenes/slide1.jpg' />">
						</li>
						<li>
							<img src="<c:url value='/resources/Imagenes/slide2.jpg' />">
						</li>
						<li>
							<img src="<c:url value='/resources/Imagenes/slide5.jpg' />">
							<div class="caption left-align">
								<h3>Los mejores </h3>
								<h3>Productos</h3>
								<h3>Precios 
								<h3>Atención</h3>
							</div>
						</li>
						<li>
							<img src="<c:url value='/resources/Imagenes/slide4.jpg' />">
						</li>

					</ul>
				</div>
			</div>
			<br>
			<div class="col s5 ">
				<div class="card-panel grey lighten-2 z-depth-3">
					<br>
					
			        <div class="row valign-wrapper">
			            <div class="col s5">
							<img src="<c:url value='/resources/Imagenes/mascota.jpg' />" class="responsive-img circle">		        
						</div>
			            <div class="col s7">
			              	<div class="row">
									<div class="input-field col s10">
										<h4>Login</h4>
									</div>
									<div class="input-field col s10">
										<input id="Usuario" type="text" class="validate">
			          					<label for="Usuario">Usuario</label>
<!-- 			          					<i class="material-icons small ">perm_identity</i> -->
									</div>
									<br>
									<br>
									<div class="input-field col s10">

										<input id="Contrasena" type="password" class="validate">
			          					<label for="Contrasena"> Contrasena</label>
<!-- 			          					 <i class="material-icons">lock</i> -->
									</div>
									
							</div>
			            </div>
			           
			        </div>
		           <div class="row">
		            	<div class=" input-field col s6" align="center">
							<a  href="Recepcionista.html">Ingresar</a>

						</div>
						<div class=" input-field col s6">
							<a  href="Recepcionista.html">Cancelar</a>
						</div>
		            </div>
		        </div>
				<!--
				<div style = "padding:10px" class="container grey lighten-2 z-depth-3">

					
					<div class="col s4">
						<div class="col s4">
							<img src="Imagenes/mascota.jpg" class="responsive-img circle">
						</div>
						<div class="col s8">
							<div class="row">
							</div>
							<div class="row">
								<div class="input-field col s10">
									<h4>Loguin</h4>
								</div>
								<div class="input-field col s10">
									<input id="Usuario" type="text" class="validate">
		          					<label for="Usuario">Usuario</label>
								</div>
								<div class="input-field col s10">
									<input id="Contrasena" type="password" class="validate">
		          					<label for="Contrasena">Contrasena</label>
								</div>
								<div class=" input-field col s3">
									<input type="submit" data-target="Ingresar" class="btn modal-trigger" value="Ingresar" />
								</div>
								<div class=" input-field col s3">
									<input type="submit" data-target="Cancelar" class="btn modal-trigger" value="Cancelar" />
								</div>
							</div>
						</div>
					</div> 		
				</div>-->
				<br><br>
			</div>
			
		

		</div>

			

		<div class="fixed-action-btn" style="bottom: 45px; right: 24px;">
		    <a class="btn-floating btn-large red">
		      <i class="large material-icons">mode_edit</i>
		    </a>
		    <ul>
		      <li><a class="btn-floating red"><i class="material-icons">insert_chart</i></i></a></li>
		      <li><a class="btn-floating yellow darken-1"><i class="material-icons">format_quote</i></a></li>
		      <li><a class="btn-floating green"><i class="material-icons">publish</i></a></li>
		      <li><a class="btn-floating blue"><i class="material-icons">attach_file</i></a></li>
		    </ul>
		 </div>

	  	
		 <footer class="page-footer #e0e0e0 grey lighten-2">
          <div class="container">
            <div class="row">
              <div class="col l6 s12">
                <p aling="center" class="blue-text"><img src="Imagenes/logo3.png" style="height: 60px; align:center; " >Sistema de Veterinaria ... </p>
                
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


		<script src="<c:url value="/resources/js/jquery.min.js" />"></script>
		<script src="<c:url value="/resources/js/materialize.min.js" />"></script>
		
		<script>
			 
			$(document).ready(function(){
	    		$('select').material_select();
	    		$('.slider').slider({height: 500,indicators: false,interval : 2000});
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
	<!--*********************************************************************************-->
</html>