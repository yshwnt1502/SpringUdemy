<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Family Details Input Page</title>
</head>
<body>
	<h1 style="border: 2px solid Tomato;">Family Input Page</h1>
	<p style="font-weight: Italics;">Enter the details below</p>
	<form:form action="processform" modelAttribute="person">
		<br>
		<br>
First Name : <form:input path="firstName" />
<form:errors path="firstName" cssClass="error"/>
		<br>
		<br>
Last Name :  <form:input path="lastName" />
<form:errors path="lastName" cssClass="error"/>
		<br>
		<br>
Age :        <form:input path="age" />
		<br>
		<br>
Relation :   <form:input path="relation" />
		<br>
		<br>
Country : <form:select path="country">
			<form:options items="${person.countryOptions}" />
			<!--<form:option value="China" label="China"/>
               <form:option value="Denmark" label="Denmark"/>
                <form:option value="England" label="England"/>
                 <form:option value="India" label="India"/>
                 -->
		</form:select>
		<br>
		<br>
		<!--  Favorite Language : Java<form:radiobutton path="favouriteLang" value="Java" />C++<form:radiobutton path="favouriteLang" value="C++" />	
Ruby<form:radiobutton path="favouriteLang" value="Ruby" />	
Python<form:radiobutton path="favouriteLang" value="Python" />-->

Favourite Language : <form:radiobuttons path="favouriteLang"
			items="${person.favLang}" />
		<br>
		<br>
Operating System you are proficient with :
Windows 10<form:checkbox path="operatingSystem" value="Windows 10" />
Linux<form:checkbox path="operatingSystem" value="Linux" />
Mac<form:checkbox path="operatingSystem" value="Mac" />
Android<form:checkbox path="operatingSystem" value="Android" />
		<br>
		<br>
		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>