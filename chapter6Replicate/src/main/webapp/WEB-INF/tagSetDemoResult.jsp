<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Default value on property tag Tag</title>
</head>

<body>

<s:set name="username" value="user.username"/>

The value set is  : <s:property value="username"/>

</body>

</html>
