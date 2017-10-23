<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>

<head>
    <title>Default value on property tag Tag</title>
</head>

<body>


<s:set name="u" value="user.username"/>



<p>
   username :   If we retrieve it from our own reference <s:property value="u"/>
</p>

<s:push value="user">
    Our newly created user is <s:property value="username"/>
</s:push>
</body>

</html>
