<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CRUD Cliente</title>
</head>
<body>
	<h1>Atualizar Cliente</h1>
	<s:form action="UpdateClient" method="POST">
		<s:hidden name="id" value="%{client.id}" />
		<s:textfield name="name" value="%{client.name}" label="Nome" />
		<s:textfield name="email" value="%{client.email}" label="Email" />
		<s:submit value="Update" />
	</s:form>
	<a href="index.jsp">Voltar</a>
	<br>
</body>
</html>
