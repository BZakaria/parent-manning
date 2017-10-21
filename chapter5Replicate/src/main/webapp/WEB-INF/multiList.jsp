<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Multi Array</title>
</head>
<body>

<h1>Multi array Form</h1>

<s:form action="MultiListProcessor">

    <s:textfield name="names[0]" label="Name 1"/>
    <s:textfield name="names[1]" label="Name 2"/>
    <s:textfield name="names[2]" label="Name 3"/>

    <s:submit/>
</s:form>

</body>
</html>
