<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!--
Author: WebThemez
Author URL: http://webthemez.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!doctype html>
<!--[if IE 7 ]>    <html lang="en-gb" class="isie ie7 oldie no-js"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en-gb" class="isie ie8 oldie no-js"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en-gb" class="isie ie9 no-js"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en-gb" class="no-js">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<!--[if lt IE 9]> 
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <![endif]-->
<title>Clínica Veterinaria SisCLiv</title>
<meta name="description" content="">
<meta name="author" content="WebThemez">
<!--[if lt IE 9]>
        <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
<!--[if lte IE 8]>
		<script type="text/javascript" src="http://explorercanvas.googlecode.com/svn/trunk/excanvas.js"></script>
	<![endif]-->
<link rel="stylesheet" href="<c:url value='/resources/bower_components/bootstrap/bootstrap.min.css'/>" />
<link rel="stylesheet" type="text/css" href="<c:url value='/resources/css/isotope.css'/>" media="screen" />
<link rel="stylesheet" href="<c:url value='/resources/css/jquery.fancybox.css'/>" type="text/css" media="screen" />
<link href="<c:url value='/resources/css/animate.css'/>" rel="stylesheet" media="screen">
<!-- Owl Carousel Assets -->
<link href="<c:url value='/resources/css/owl.carousel.css'/>" rel="stylesheet">
<link rel="stylesheet" href="<c:url value='/resources/css/style.css'/>" />
<!-- Font Awesome -->
<link href="<c:url value='/resources/css/font-awesome.css'/>" rel="stylesheet">
</head>

<body class="blue-grey darken-1">
<header class="header">
  <div class="container">
    <nav class="navbar navbar-inverse" role="navigation">
      <div class="navbar-header">
        <button type="button" id="nav-toggle" class="navbar-toggle" data-toggle="collapse" data-target="#main-nav"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <a href="#" class="navbar-brand scroll-top logo  animated bounceInLeft"><b><i></i>SISCLIV</b></a> </div>
      <!--/.navbar-header-->
      <div id="main-nav" class="collapse navbar-collapse">
        <ul class="nav navbar-nav" id="mainNav">
          <li class="active" id="firstLink"><a href="<c:url value='#nosotros'/>" class="scroll-link">Nosotros</a></li>
          <li><a href="<c:url value='#servicios'/>" class="scroll-link">Servicios</a></li>
          <li><a href="<c:url value='#promociones'/>" class="scroll-link">Promociones</a></li>
          <li><a href="<c:url value='#soy_trabajador'/>" class="scroll-link">Soy Trabajador</a></li>
          <li><a href="<c:url value='#soy_cliente'/>" class="scroll-link">Soy Cliente</a></li>
        </ul>
      </div>
      <!--/.navbar-collapse--> 
    </nav>
    <!--/.navbar--> 
  </div>
  <!--/.container--> 
</header>
<!--/.header-->
<div id="#top"></div>
<section id="bienvenidos">
  <div class="banner-container"> <img src="<c:url value="/resources/InicioFinal/img_iniciofinal/banner-bg.jpg"/>" alt="banner" />
    <div class="container banner-content">
      <div class="hero-text animated fadeInDownBig">
        <h1 class="responsive-headline" style="font-size: 500px;">Bienvenidos</h1>
        <a href="<c:url value='#basics'/>" class="arrow-link"> <i class="fa fa-arrow-circle-down fa-2x"></i> </a> 
        <!--<p>Awesome theme for your Business or Corporate site to showcase <br/>
          your product and service.</p>--> 
      </div>
    </div>
  </div>
</section>
<section id="nosotros" class="page-section colord">
  <div class="container">
    <div class="heading text-center"> 
      <!-- Heading -->
      <h2>Nosotros</h2>
      <p>Conózcanos más ...</p>
    </div>
    <div class="row"> 
      <!-- item -->
      <div class="col-md-4 text-center c1"> <i class="fa fa-plus-square fa-2x circle"></i>
        <h3><span class="id-color">Misión</span></h3>
        <p style="text-align:justify">Velar por el bienestar de cada mascota y de su familia a través de un servicio con gran calidez humana y calidad técnica. Para ello brindamos bajo un mismo techo, todos los servicios necesarios, prestados por profesionales de excelencia y equipamiento de vanguardia tecnológica.</p>
      </div>
      <!-- end: --> 
      
      <!-- item -->
      <div class="col-md-4 text-center c2"> <i class="fa fa-plus-square fa-2x circle"></i>
        <h3><span class="id-color">Visión</span></h3>
        <p style="text-align:justify">Ser una clínica veterinaria modelo, con capacitación constante y enfocada a la satisfacción del cliente y el bienestar de toda mascota. Seremos referentes para profesionales y la elección segura de nuestro entorno geográfico y incidiremos con nuestras acciones en la problemática veterinaria nacional.</p>
      </div>
      <!-- end: --> 
      
      <!-- item -->
      <div class="col-md-4 text-center c1"> <i class="fa fa-plus-square fa-2x circle"></i>
        <h3><span class="id-color" text-justify>Políticas</span></h3>
        <p style="text-align:justify">- Cada veterinario debe guardar la Ética profesional frente a otro colega y frente a cada mascota, siguiendo los lineamientos dictados por el Consejo Profesional de Médicos Veterinarios.
		- Cuidar el medio ambiente y proteger a los miembros de la comunidad (tanto humanos o mascotas) de los riesgos que presentan animales enfermos.
		- Preservar la vida de las mascotas por sobre el deseo de eutanasia infundado.
      </div>
      <!-- end: --> 
    </div>
  </div>
  <!--/.container-->
</section>
<section id="servicios" class="page-section colord">
  <div class="container">
    <div class="heading text-center"> 
      <!-- Heading -->
      <h2>Servicios</h2>
    </div>
<div class="row">
      <div class="col-md-12">
        <div id="portfolio">
          <ul class="items list-unstyled clearfix animated fadeInRight showing" data-animation="fadeInRight" style="position: relative; height: 438px;">
            <li class="item branding" style="position: absolute; left: 0px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/medicina general.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/medicina general.jpg"/>" alt="">
              <div class="overlay"> <span>Medicina General - Consulta / Precio: 25 soles</span></div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 292px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/neurologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/neurologia.jpg"/>" alt="">
              <div class="overlay"> <span>Neurología / Precio: 40 soles</span> </div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 877px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/ecografia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/ecografia.jpg"/>" alt="">
              <div class="overlay"> <span>Ecografía / Precio: 35 soles</span> </div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 0px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/rayos x.jpg'/>" class="fancybox"> <img src="<c:url value=" /resources/InicioFinal/img_servicios/rayos x.jpg"/>" alt="">
              <div class="overlay"> <span>Rayos X / Precio: 50 soles</span> </div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 0px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/traumatologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/traumatologia.jpg"/>" alt="">
              <div class="overlay"> <span>Traumatología / Precio: 40 soles</span> </div>
              </a> </li>
            <li class="item web" style="position: absolute; left: 292px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/cardiologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/cardiologia.jpg"/>" alt="">
              <div class="overlay"> <span>Cardiología / Precio: 30 soles</span> </div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 585px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/cirugia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/cirugia.jpg"/>" alt="">
              <div class="overlay"> <span>Cirugía / Precio: 80 soles</span> </div>
              </a> </li>
            <li class="item web" style="position: absolute; left: 877px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/oftalmologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/oftalmologia.jpg"/>" alt="">
              <div class="overlay"> <span>Oftalmología / Precio: 20 soles</span> </div>
              </a> </li>
            <li class="item web" style="position: absolute; left: 877px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/anestesiologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/anestesiologia.jpg"/>" alt="">
              <div class="overlay"> <span>Anestesiología / Precio: 15 soles</span> </div>
              </a> </li>
            <li class="item web" style="position: absolute; left: 877px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/gastroenterologia.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/gastroenterologia.jpg"/>" alt="">
              <div class="overlay"> <span>Gastroenterología / Precio: 45 soles</span> </div>
              </a> </li>
            <li class="item photography" style="position: absolute; left: 0px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/emergencias.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/emergencias.jpg"/>" alt="">
              <div class="overlay"> <span>Emergencias</span> </div>
              </a> </li>
            <li class="item branding" style="position: absolute; left: 585px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_servicios/servicio estetico.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_servicios/servicio estetico.jpg"/>" alt="">
              <div class="overlay"> <span>Servicio Estético / Baño -> Precio: 15 soles, Peluquería -> Precio: 15 soles,
              Manicure y Pedicure -> Precio: 15 soles</span> </div>
              </a> </li>
          </ul>
        </div>
      </div>
    </div>

</section>

<section id="promociones" class="page-section colord">
  <div class="container">
    <div class="heading text-center"> 
      <h2>Promociones</h2>
      <p>Conozca nuestras promociones ...</p>
    </div>
    <div class="row">
      <div class="col-md-12">
        <div id="portfolio">
          <ul class="items list-unstyled clearfix animated fadeInRight showing" data-animation="fadeInRight" style="position: relative; height: 438px;">
            <li class="item branding" style="position: absolute; left: 0px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_promociones/1.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_promociones/1.jpg"/>" alt="">
              </a> </li>
            <li class="item photography" style="position: absolute; left: 292px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_promociones/2.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_promociones/2.jpg"/>" alt="">
              </a> </li>
            <li class="item branding" style="position: absolute; left: 585px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_promociones/3.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_promociones/3.jpg"/>" alt="">
              </a> </li>
            <li class="item photography" style="position: absolute; left: 877px; top: 0px;"> <a href="<c:url value='/resources/InicioFinal/img_promociones/4.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_promociones/4.jpg"/>" alt="">
              </a> </li>
            <li class="item photography" style="position: absolute; left: 0px; top: 219px;"> <a href="<c:url value='/resources/InicioFinal/img_promociones/5.jpg'/>" class="fancybox"> <img src="<c:url value="/resources/InicioFinal/img_promociones/5.jpg"/>" alt="">
              </a> </li>
          </ul>
        </div>
      </div>
    </div>
</section>
<section id="soy_trabajador" class="page-section colord">
 <div class="contact-parlex">
  <div class="parlex-back">
    <div class="container">
      <div class="row">
        <div class="heading text-center"> 
          <!-- Heading -->
          <h2>Soy Trabajador</h2>
          <p>Listo para trabajar. Por favor inicie sesión.</p>
        </div>
      <div class="row">
      <div id="portfolio">
      <div class="center-block">
        <form method="post" action="" id="contactfrm" role="form">
          <div class="col-md-4">
            <div class="form-group">
              <label for="dni">DNI</label>
              <input type="text" class="form-control" name="dni" id="dni" placeholder="Ingrese dni" title="Por favor ingrese su número de dni">
            </div>
            <div class="form-group">
              <label for="contraseña">Contraseña</label>
              <input type="text" class="form-control" name="contraseña" id="contraseña" placeholder="Ingrese contaseña" title="Por favor ingrese su contraseña">
              <a  href="Recepcionista" class="btn btn-lg btn-primary" value="Ingresar">Ingresar</a>
            </div>
            </div>
            </div>
            </form>
         </div>
         </div>
         </div>
         </div>
          </div>
</section>
<section id="soy_cliente" class="contact-parlex1">
  <div class="parlex-back">
    <div class="container">
      <div class="row">
        <div class="heading text-center"> 
          <!-- Heading -->
          <h2>Soy Cliente</h2>
          <p>Si ya posee una cuenta de usuario registrada, inicie sesión. De lo contrario, proceda a registrarse.</p>
        </div>
      </div>
      <div class="row mrgn30">
        <form method="post" action="" id="contactfrm" role="form">
          <div class="col-sm-4">
            <div class="form-group">
              <label for="dni">DNI</label>
              <input type="text" class="form-control" name="dni" id="dni" placeholder="Ingrese dni" title="Por favor ingrese su número de dni">
            </div>
            <div class="form-group">
              <label for="contraseña">Contraseña</label>
              <input type="text" class="form-control" name="contraseña" id="contraseña" placeholder="Ingrese contraseña" title="Por favor ingrese su contraseña">
              <button name="submit" type="submit" class="btn btn-lg btn-primary" id="submit"><a href="<c:url value='ReservarCita.html'/>" style="color: #fff;">Ingresar</a></button>
              
              <button name="submit" type="submit" class="btn btn-lg btn-primary" id="submit"><a href="<c:url value='RegistroCliente.html'/>" style="
              color: #fff;">Registrarse</a>
              </button>
              
            </div>
          </div>
         </form>
        <div class="col-sm-8">
          <h4>Dirección:</h4>
          Facultad de Medicina Veterinaria de la UNMSM, Av. Circunvalación Cdra. 28 s/n - San Borja. Lima. <br>
          <h4>Teléfono:</h4>
          (01)619 - 7000<br>
          <h4>Horarios de atención:</h4>
          Lunes a Domingo las 24 horas del día.<br>
        </div>
      </div>
    </div>
    </section>
<!--/.page-section-->
<section class="copyright">
  <div class="container">
    <div class="row">
      <div class="col-sm-12 text-center"> Copyright 2015 SisCliv | Drechos Reservados -- Diseñado por: 6 alumnos de la
      FISI de la UNMSM</div>
    </div>
    <!-- / .row --> 
  </div>
</section>
<a href="#top" class="topHome"><i class="fa fa-chevron-up fa-2x"></i></a> 

<!--[if lte IE 8]><script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script><![endif]--> 
<script src="<c:url value="/resources/InicioFinal/js/modernizr-latest.js"/>"></script> 
<script src="<c:url value="/resources/InicioFinal/js/jquery-1.8.2.min.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/bootstrap.min.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/jquery.isotope.min.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/fancybox/jquery.fancybox.pack.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/jquery.nav.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/jquery.fittext.js"/>"></script> 
<script src="<c:url value="/resources/InicioFinal/js/waypoints.js"/>"></script> 
<script src="<c:url value="/resources/InicioFinal/js/custom.js"/>" type="text/javascript"></script> 
<script src="<c:url value="/resources/InicioFinal/js/owl-carousel/owl.carousel.js"/>"></script>
</body>
</html>
