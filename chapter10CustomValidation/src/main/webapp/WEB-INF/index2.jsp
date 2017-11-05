<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
    <s:head/>
</head>
<body>
<s:form action="GetValidateProcessUser">
    <s:textfield name="username" label="Enter username"/>
    <s:password name="password" label="Enter your password"/>
    <s:submit/>
</s:form>
</body>
</html>
