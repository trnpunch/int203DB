<%-- 
    Document   : Profile
    Created on : Nov 13, 2016, 2:02:40 AM
    Author     : lambopunchh
--%>

<%@page import="model.Parant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = (String) request.getAttribute("userName");
           
        %>
        <jsp:include page="/HOME.jsp?title=Profile"/>




        <form>
            ID-Student : <input type="text" disabled value="${user.getsId()}" name="id"><br>
            NAME :<input type="text" disabled value="${user.getsFName()}" name="FName"><br>
            SURNAME : <input type="text" disabled value="${user.getsLName()}" name="LName"><br>
            ADDRESS :<input type="text" disabled value="${user.getsAddress()}" name="add"><br>
            DOB : <input type="text" disabled value="${user.getDob()}" name="dob"><br>
            Classroom : <input type="text" disabled value="${user.getRoomId()}" name="classroom"><br>


        </form>
        <p><a href="Logout">LOGOUT</p>
        <p><a href="CheckGrade">Check Grade</p>

        <p><a href="Parant?parantId=${user.getParantId()}">Parant</p>
        
        


    </body>
</html>
