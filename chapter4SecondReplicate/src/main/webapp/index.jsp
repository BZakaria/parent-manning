<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Welcome - $$</title>
</head>
<body>
<h1>Dashboard</h1>

Hello there! Are you here? => <s:property value="#session.user.username"/>

</body>
</html>
