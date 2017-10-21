<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Registration Process</title>
</head>
<body>


<h1>Registration information</h1>
<s:form action="Register">
    <s:textfield  name="username" label="Enter the username"/>
    <s:textfield  name="firstName" label="Enter the first name"/>
    <s:textfield  name="mail" label="Enter the mail"/>
    <s:hidden value="inspecting my code? For what reason?"/>
    <s:submit label="Join us"/>
</s:form>
</body>
</html>
