<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

  <head>
    <title>Calculadora</title>
  </head>

  <body>
  	<h1>Cálculo IMC</h1>
  	<form>
  		<table>
  			<tr>
  				<td><input name="peso" placeholder="Peso (em kg)">kg </td>
  				<td><input name="altura" placeholder="Altura (em metros)">m</td>
  			</tr>
  			<tr>
  				<td></td><td><button>Calcular</button></td>
  			</tr>
  			
  		</table>
		
  	</form><br>
	<b>${resultado}</b>
	<br><br>
	<b>${situacao}</b>
  </body>

</html>