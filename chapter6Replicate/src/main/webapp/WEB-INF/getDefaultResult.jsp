<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Default value on property tag Tag</title>
</head>

<body>

<h3>Default value for Property</h3>


First value :
<s:property value="propertyNotFound" default="It doesnt exist"/>
<br/>
Second value retrieved from the stack:
<s:property value="propertyNotFound" default="%{testValueInStack}"/>



</body>

</html>
