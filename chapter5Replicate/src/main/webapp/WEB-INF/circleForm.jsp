<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Circles Radius</title>
</head>
<body>

<h1>Circles Form</h1>

<s:form action="CircleFormProcessor">
    <s:textfield name="circle" label="Radius (C:Rxx)"/>
    <s:submit/>
</s:form>

</body>
</html>
