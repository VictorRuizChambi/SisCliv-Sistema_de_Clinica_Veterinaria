<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Gestor de Comercios</title>
<!-- <link rel="stylesheet" type="text/css" href="../jsp/estilos.css"> -->
  <style type="text/css">
* {
	margin:0;
	padding:0;
	font-family: Verdana;
	font-size: 14px;
}

body {
	background:#e6e6e6;
}

header, .main, footer {
	/*background: #fff;*/
	width:90%;
	max-width: 1000px;
	margin: 20px auto;
}

header nav {
	background: #528fD5;
	overflow: hidden;
}

header nav ul {
	list-style: none;
}

header nav ul li{
	float:left;
}

header nav ul li a {
	padding: 10px 20px;
	display: block;
	color:#fff;
	text-decoration: none;
}

header nav ul li a:hover{
	background: #75ACEC;
}

.main .articles {
	width:68.5%;
	margin-right: 1.5%;
	float:left;


}

.main .articles article {
		padding: 20px;
		background: #fff;
		margin-bottom:20px; 
}

aside {
	width:30%;
	background:#ff8000;
	float:left;
	padding: 20px;
	box-sizing: border-box; 
}

footer{
	background: #000;
	color:#fff;
	clear:both;
	text-align: center;
	padding: 10px 0px;
}
/*
body {
	font-family: sans-serif;
}
*/
.data, .data td {
	border-collapse: collapse;
	border: 1px solid #aaa;
	margin: 2px;
	padding: 2px;
}

.data th {
	font-weight: bold;
	background-color: #5C82FF;
	color: white;
}

.data	tbody td {
	background-color: #eee; thead th, tfoot th, tfoot td { background-color
	: #cc9;
	font-size: 1.1em;
}
}
</style>  
</head>
<body>
	
		<header>
		<div class="logotipo">
<!-- 			<img src="Imagenes/wolf.jpg" width="100" alt=""> -->
		</div>
		<nav>
			<ul>
				<li><a href="Inicio.html">Inicio</a></li>
				<li><a href="comercio.do">Consultas</a></li>
			</ul>
		</nav>
	</header>
	<section class="main">
		<section class="articles">
			<article>
			<form:form method="post" action="comercio.do" modelAttribute="comercio">
		<table>
			<tr>
				<td><SELECT NAME="accion" onchange="this.form['Busqueda'].value=this.value" SIZE="1">
						<OPTION VALUE="1">Búsqueda por Codigo</OPTION>
						<OPTION VALUE="2">Búsqueda por Giro o Rubro</OPTION>
				</SELECT></td>
				<td></td>

			</tr>
			
			<tr>
				<td><form:input path="nombre" /></td>
				<td><input type="submit" name="acto"  value="Realizar Busqueda"/></td>
			</tr>
		</table>

	</form:form>

	<h3>Comercios</h3>

	<c:if test="${!empty listacomercios}">
		<table class="data" border="1">
			<tr>
				<th>codigo</th>
				<th>nombre Comercial</th>
				<th>nombre</th>
				<th>nombre de Via</th>
				<th>numero</th>
				<th>letra</th>
				<th>interior</th>
				<th>giro</th>
				<th>geoX</th>
				<th>geoY</th>
			</tr>
			<c:forEach items="${listacomercios}" var="comercio">
				<tr>
					<td>${comercio.codigo}</td>
					<td>${comercio.nombreComercial}</td>
					<td>${comercio.nombre}</td>
					<td>${comercio.nombreDeVia}</td>
					<td>${comercio.numero}</td>
					<td>${comercio.letra}</td>
					<td>${comercio.interior}</td>
					<td>${comercio.giro}</td>
					<td>${comercio.geoX}</td>
					<td>${comercio.geoY}</td>
					<%-- 		<td><a href="delete/${contact.id}">delete</a></td> --%>
				</tr>
			</c:forEach>

		</table>
	</c:if>
	<c:if test="${mensaje == 'ComercioNoregistrado'}">
		<c:out value="Comercio No Registrado, o No se ha ingresado un dato correcto"></c:out>
	</c:if>
				</article>

	<footer>
		<p>
			Sistemas Distribuidos 2015-I
			 
		</p>
	</footer>
	


</body>
</html>