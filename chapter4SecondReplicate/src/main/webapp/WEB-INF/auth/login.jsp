<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Authentication</title>
</head>
<body>
<h1>Login</h1>
<s:actionerror name="Errors"/>
<s:form action="LoggingProcess">
    <s:textfield name="username" label="Username info"/>
    <s:password name="password" label="password"/>
    <s:submit/>
</s:form>

</body>
</html>
