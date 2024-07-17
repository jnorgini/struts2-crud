<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Criar Cliente</title>
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
			<h1 class="mb-4">Criar Cliente</h1>
			<s:form action="CreateClient" method="POST">
				<div class="form-group">
					<s:textfield name="name" id="name" class="form-control"
						placeholder="Digite o nome" label="Nome" />
					<s:textfield name="email" id="email" class="form-control"
						placeholder="Digite o email" label="Email" />
				</div>
				<s:submit value="Salvar" class="btn btn-primary mt-3" />
			</s:form>
			<a href="index.jsp" class="btn btn-secondary mt-3">Voltar</a>
		</div>
	</div>

	<!-- Bootstrap JS and dependencies -->
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
</body>
</html>
