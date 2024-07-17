<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CRUD de Clientes</title>
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
</style>
</head>
<body>
	<div class="container text-center">
		<div class="card">
			<h1 class="mb-4">CRUD de Clientes</h1>
			<div class="mb-3">
				<s:url action="ShowClient" var="linkCriar"></s:url>
				<s:a href="%{linkCriar}" class="btn btn-primary mr-2">Criar</s:a>
				<s:url action="ListClients" var="linkListar"></s:url>
				<s:a href="%{linkListar}" class="btn btn-success">Listar</s:a>
			</div>
		</div>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>
