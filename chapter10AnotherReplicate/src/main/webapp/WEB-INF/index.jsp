<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html>
<head>
    <title>HOME PAGE Validation</title>
</head>
<body>
<h1>please validate this form</h1>
<s:form action="TryToProcess">
    <s:textfield name="username" label="Enter username" required="true"/>
    <s:textfield name="age" label="Enter age" required="true"/>
    <s:textfield name="birthdate" label="Enter birthdate" required="true"/>
    <s:submit/>
</s:form>
</body>
</html>
