<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Home</title>
    <s:head/>
</head>
<body>

<h2>Please fill in the form</h2>
<s:form action="ValidateProcess">
    <s:textfield label="Username" name="username"/>
    <s:textfield label="password" name="password"/>
    <s:textfield label="email" name="email"/>
    <s:submit value="GO"/>
</s:form>

</body>
</html>
