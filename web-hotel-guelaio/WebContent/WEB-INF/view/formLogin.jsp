<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/controllerPrincipalServlet?service=formCadastrarCliente" var="linkServletPrincipal"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tela de Login</title>
</head>
	<body>
		<form action="${linkServletPrincipal}" method="post"> <!-- GET é o padrão do formulario-->
			Login: <input type="text" name="login"/>
			Senha: <input type="password" name="senha"/>
			<input type="submit"/>
		</form>
	</body>
</html>