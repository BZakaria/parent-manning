<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<s:head />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>


<script type="text/javascript">
	$.when($.ready).then(function() {
		alert('js');
		$.get("ajax/BoxGrabberExtended", function(data) {
			console.log(data);
			$(".box").html(data);
			alert("Load was performed.");
		});

	});
</script>
<s:head />

</head>
<body>
	<h2>Ajax style example</h2>

	<div class='box'></div>

</body>
</html>
