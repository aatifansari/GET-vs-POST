<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Servlet Page</title>
</head>
<body>
<h2 align="center">Welcome!!</h2>
<p align="center" style="color : red "> Hey!! It's index.jsp your default page.</p> 
<p align="center">Thank's for the honour to put me in welcome-file in deployment descriptor(web.xml) </p>
<p align ="center"><a href ="${pageContext.request.contextPath}/GetLoginForm.jsp">Submit Form using GET method</a></p>
<p align ="center"><a href ="${pageContext.request.contextPath}/PostLoginForm.jsp">Submit Form using POST method</a></p>
</body>
</html>