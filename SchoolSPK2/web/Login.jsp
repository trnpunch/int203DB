<%-- 
    Document   : Login
    Created on : Nov 12, 2016, 6:13:20 PM
    Author     : lambopunchh
--%>

<%@page import="model.Student"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Student</title>
    </head>
    <body>

        <h1>Login</h1>
        
        <form action="Login" method="post">
            Username <input type="text" name="userName" placeholder="identityStudent(520101)"><br>  
            Password <input type="password" name="password" placeholder="DOB : DDMMYYYY(07011987)"><br>
                  
                        <input type="submit" value="search">

        </form>
        <div><h3 style="color:red">${message}</h3></div>
        
    </body>
</html>
