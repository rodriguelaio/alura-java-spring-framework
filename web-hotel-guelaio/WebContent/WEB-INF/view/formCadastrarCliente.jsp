<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/controllerPrincipalServlet?service=cadastrarCliente" var="linkServletPrincipal"/>
<c:url value="/controllerPrincipalServlet?service=Logout" var="linkLogout"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Cliente do Hotel Guelaio</title>
</head>
	<body>
		<c:import url="logout-parcial.jsp"></c:import>
		<!-- o "nome", que agora está em um bloco chamado de EXPRESSION LANGUAGE,
			 se refere ao atributo passado na requisicao http -->
		<form action="${linkServletPrincipal}" method="post"> <!-- GET é o padrão do formulario-->
			Nome: <input type="text" name="nome"/>
			CPF: <input type="text" name="cpf"/>
			Nascimento: <input type="text" name="dataDeNascimento"/>
			<input type="submit"/>
		</form>
	</body>
</html>