<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
 <head>
   <title>FormExercise</title>
 </head>
 <body>
  <h2>User Data</h2>
   <form:form action="addUser" modelAttribute="user" method="POST">
     <form:label path="name">Name</form:label>
     <form:input path="name" /> <br><br>
     <form:label path="password">Password</form:label>
     <form:input path="password" />
    
     <input type="submit" value="Submit"/>
    </form:form>
 </body>
</html>