<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE hml>
<html>
<head>
<title>Person information Page</title>
</head>
<body>
The information of the person is below
<br><br>

Person Name :${person.firstName} ${person.lastName} 
<br><br>
Person age:${person.age} 
<br><br>
Relationship: ${person.relation} 
<br><br>
Country: ${person.country }
<br><br>
Language Preferred: ${person.favouriteLang }
<br><br>
Operating Systems :

<ul>
   <c:forEach var="temp" items="${person.operatingSystem }">
   <li>${ temp}</li>
   </c:forEach>
</ul>

</body>

</html>