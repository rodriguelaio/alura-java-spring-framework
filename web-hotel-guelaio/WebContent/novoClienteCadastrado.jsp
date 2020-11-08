<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<!-- o "nome", que agora está em um bloco chamado de EXPRESSION LANGUAGE,
			 se refere ao atributo passado na requisicao http -->
		<c:if test="${not empty nome}">
			Cliente ${nome} criado com sucesso na data <fmt:formatDate value="${dataDeNascimento}" pattern="dd/MM/yyyy"/>!
		</c:if>
	</body>
</html>