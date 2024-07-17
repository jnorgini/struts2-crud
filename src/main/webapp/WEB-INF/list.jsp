<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Clientes</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.container {
	margin-top: 50px;
}

.card {
	border-radius: 15px;
	padding: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="card">
			<h1 class="mb-4">Lista de Clientes</h1>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Nome</th>
						<th>Email</th>
						<th>Ações</th>
					</tr>
				</thead>
				<tbody>
					<s:iterator value="clients" var="c">
						<tr>
							<td><s:property value="#c.id" /></td>
							<td><s:property value="#c.name" /></td>
							<td><s:property value="#c.email" /></td>
							<td><s:url action="GetClient" var="linkAtualizar">
									<s:param name="clientId">
										<s:property value="#c.id" />
									</s:param>
								</s:url> <s:a href="%{linkAtualizar}"
									class="btn btn-sm btn-primary mr-2">Atualizar</s:a> <s:url
									action="DeleteClient" var="linkDeletar">
									<s:param name="clientId">
										<s:property value="#c.id" />
									</s:param>
								</s:url> <s:a href="%{linkDeletar}" class="btn btn-sm btn-danger">Deletar</s:a>
							</td>
						</tr>
					</s:iterator>
				</tbody>
			</table>
			<a href="index.jsp" class="btn btn-secondary">Voltar</a>
		</div>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>
