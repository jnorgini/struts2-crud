<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CRUD Cliente</title>
<!-- Bootstrap CSS -->
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
.container {
	margin-top: 50px;
	max-width: 600px;
}

.card {
	border-radius: 15px;
	padding: 20px;
}

.form-group {
	margin-bottom: 15px;
}
</style>
</head>
<body>
	<div class="container">
		<div class="card">
			<h1>Atualizar Cliente</h1>
			<s:form action="UpdateClient" method="POST">
				<s:hidden name="id" value="%{client.id}" />
				<s:textfield name="name" value="%{client.name}" class="form-control"
					label="Nome" />
				<s:textfield name="email" value="%{client.email}"
					class="form-control" label="Email" />
				<s:submit value="Salvar" class="btn btn-primary mt-3" />
			</s:form>
			<a href="index.jsp" class="btn btn-secondary mt-3">Voltar</a>
		</div>
	</div>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>