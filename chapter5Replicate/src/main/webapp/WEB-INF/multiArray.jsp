<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Multi Array</title>
</head>
<body>

<h1>Multi array Form</h1>

<s:form action="MultiArrayProcessor">

    <s:textfield name="ages" label="Age 1"/>
    <s:textfield name="ages" label="Age 2"/>
    <s:textfield name="ages" label="Age 3"/>

    <s:textfield name="names[0]" label="Name 1"/>
    <s:textfield name="names[1]" label="Name 2"/>
    <s:textfield name="names[2]" label="Name 3"/>

    <s:submit/>
</s:form>

</body>
</html>
