<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Selection</title>
    <s:head/>
</head>
<body>

<h2>Please fill in the form</h2>
<s:form action="Process">

    <s:select name="user.username" label="Choose the name, Schyzo" list="{'Zak','Amine'}"/>
    <s:checkbox name="user.canReceiveJunkMail" label="Can Receive junk mail?" value="true"/>
    <s:submit value="GO!"/>
</s:form>
</body>
</html>
