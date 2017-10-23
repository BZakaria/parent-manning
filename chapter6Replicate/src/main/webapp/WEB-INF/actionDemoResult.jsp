<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Default value on property tag Tag</title>
</head>

<body>


<p>This is from the main action</p>

<s:action name="ActionTargetDemo" /> <!--executeResult="true" -->

<p>After Target Action was fired, the value that was added is :</p>

<p><s:property value="#request['anotherRequest']"/> </p>
</body>

</html>
