<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/removerCliente" var="linkServletRemoverCliente"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Cliente</title>
</head>
	<body>
		<!-- o "nome", que agora está em um bloco chamado de EXPRESSION LANGUAGE,
			 se refere ao atributo passado na requisicao http -->
<%-- 		<c:if test="${not empty nome}"> --%>
			
			Cliente ${nome} com o CPF ${cpf} cadastrado com sucesso!
			
			<c:forEach items="${listaClientes}" var="cliente">
				<li>
					${cliente.nome} - <fmt:formatDate value="${cliente.dataDeNascimento}" pattern="dd/MM/yyyy"/> - 
					<a href="${linkServletRemoverCliente}">remover</a>
				</li>
			</c:forEach>
<%-- 		</c:if> --%>
	</body>
</html>