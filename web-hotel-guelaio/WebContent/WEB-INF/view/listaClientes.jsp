<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/removerCliente" var="linkServletRemoverCliente"/>
<c:url value="/controllerPrincipalServlet?service=Logout" var="linkLogout"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Cliente</title>
</head>
	<body>
		<c:import url="logout-parcial.jsp"></c:import>
		<!-- o "nome", que agora está em um bloco chamado de EXPRESSION LANGUAGE,
			 se refere ao atributo passado na requisicao http -->
	
		Cliente ${nome} com o CPF ${cpf} cadastrado com sucesso!
		<br>
		<br>
		<c:forEach items="${listaClientes}" var="cliente">
			<li>
				${cliente.nome} - <fmt:formatDate value="${cliente.dataDeNascimento}" pattern="dd/MM/yyyy"/> - 
				<a href="${linkServletRemoverCliente}">remover</a>
			</li>
		</c:forEach>
	</body>
</html>