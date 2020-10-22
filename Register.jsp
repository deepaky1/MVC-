<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
  <form action="Register_response.jsp" method="post">
      <table  style="background-color: aqua;" align="center">
         <thead>
         <tr>
         <th colspan="2" style="font-size: 60px;color: green;">Register Here</th>
         </tr>
         </thead>
      <tbody>
         <tr>
         <td style="font-size: 20px;">First Name</td>
         <td><input type="text" name="userFirstName" placeholder="Enter First name"></td>
         </tr>
          
         <tr>
         <td style="font-size: 20px;">Last Name</td>
         <td><input type="text" name="userLastName" placeholder="Enter Last name"></td>
         </tr>
            
         <tr>
         <td style="font-size: 20px;">User Name</td>
         <td><input type="email" name="userEmail" placeholder="abcd123@xyz.com"></td>
         </tr>
      
         <tr>
         <td style="font-size: 20px;">Password</td>
         <td><input type="password" name="userPass" placeholder="Enter your Password"></td>
         </tr>
      
         
         <tr>
         <td><input type="submit" value="Register"></td>
         <td style="font-size: 20px;"><a href="Login.jsp">Already Member</a></td>
         </tr>
       
      </tbody>
      
      </table>
 
  </form>

</body>
</html>