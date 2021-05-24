<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Registration Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<h1>Enter your details below</h1>

	<br>
	<br>

	<form:form action="processform" modelAttribute="customer">
  First Name(*) :<form:input path="firstName" />
		<form:errors path="firstName" cssClass="error" />
		<br>
		<br>
  Last Name :<form:input path="lastName" />
		<form:errors path="lastName" cssClass="error" />
		<br>
		<br>
  Free Passes :<form:input path="freePasses" />
		<form:errors path="freePasses" cssClass="error" />
		<br>
		<br>
  PostalCode :<form:input path="postalCode" />
		<form:errors path="postalCode" cssClass="error" />
		<br>
		<br>
Course Code: <form:input path="courseCode" />
		<form:errors path="courseCode" value="error" />
		<br>
		<br>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>