<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulario Cookies</title>
</head>
<body>

	<h1>hola mundo</h1>
	<p>loremmmmm</p>

	<form action="idioma-Cookie" method="post">

		<label for="idioma">Elige el Idioma</label>
	    <select id="idioma" name="idioma">

			<option value="portugues"
				${cookie.lenguaje_cookie.value == 'portugues' ? 'selected' : ''}>Portugues</option>
			<option value="castellano"
				${cookie.lenguaje_cookie.value == 'castellano' ? 'selected' : ''}>castellano</option>
			<option value="Euskera"
				${cookie.lenguaje_cookie.value == 'Euskera' ? 'selected' : ''}>Euskera</option>
			<option value="Ingles"
				${cookie.lenguaje_cookie.value == 'Ingles' ? 'selected' : ''}>Ingles</option>
			<option value="Italiano"
				${cookie.lenguaje_cookie.value == 'Italiano' ? 'selected' : ''}>Italiano</option>


		</select>

		<button>Guardar</button>
	</form>

</body>
</html>

