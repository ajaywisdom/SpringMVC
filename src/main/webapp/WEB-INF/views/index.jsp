<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored = "false" %>
<html>
<body>

	<% 
		//String name = (String)request.getAttribute("name");
	%>
	<h1>
	Name is :
	${name }
	</h1>
	
	
</body>
</html>
