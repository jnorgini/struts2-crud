<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CRUD Cliente</title>
    </head>
    <body>
        <h1>Criar Cliente</h1>
        <s:form action="CreateClient" method="POST">
            <s:textfield name="name" label="Name"></s:textfield>
            <s:textfield name="email" label="Email"></s:textfield>
            <s:submit value="Salvar"></s:submit>
        </s:form>
        <a href="index.jsp">Voltar</a><br>
    </body>
</html>