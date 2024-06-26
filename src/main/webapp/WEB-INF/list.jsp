<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CRUD de Clientes</title>
</head>
<body>
	<h1>Lista de Clientes</h1>
	<table cellspacing="10">
		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>Email</th>
		</tr>
		<s:iterator value="clients" var="c">
			<tr>
				<td><s:property value="#c.id" /></td>
				<td><s:property value="#c.name" /></td>
				<td><s:property value="#c.email" /></td>
				<td><s:url action="GetClient" var="linkAtualizar">
						<s:param name="clientId">
							<s:property value="#c.id" />
						</s:param>
					</s:url> <s:a href="%{linkAtualizar}">Atualizar</s:a></td>
				<td><s:url action="DeleteClient" var="linkDeletar">
						<s:param name="clientId">
							<s:property value="#c.id" />
						</s:param>
					</s:url> <s:a href="%{linkDeletar}">Deletar</s:a></td>
			</tr>
		</s:iterator>
	</table>
	<a href="index.jsp">Voltar</a>
	<br>
</body>
</html>