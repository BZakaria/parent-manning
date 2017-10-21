<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Multi Array</title>
</head>
<body>

<h1>Multi array Form</h1>

<s:form action="MultiMapProcessor">

    <s:textfield name="users.chad.username" label="Chad username"/>
    <s:textfield name="users.amine.username" label="Amine username"/>
    <s:textfield name="users['zak'].username" label="Zak username"/>

    <s:submit/>
</s:form>

</body>
</html>
