<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Registratin Object Backed</title>
</head>
<body>


<h2>Bienvenue dans cette petite démonstration</h2>

<s:form action="RegisterOBProcessor">
    <s:textfield name="user.username" label="Enter your username"/>
    <s:textfield name="user.firstName" label="Enter your first name"/>
    <s:textfield name="user.email" label="Enter your email"/>
    <s:submit label="Try me!"/>
</s:form>

</body>
</html>
