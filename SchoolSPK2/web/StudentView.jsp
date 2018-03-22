<%-- 
    Document   : StudentView
    Created on : Nov 11, 2016, 1:55:45 AM
    Author     : lambopunchh
--%>

<%@page import="java.util.List"%>

<%@page import="model.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <h1></h1>
        <%--<jsp:include page="/HOME.jsp?title=G2 : Customer Listing"/>--%>
        
        <form action="StudentSearch" method="post">
            name   <input type="text" name="searchName">
            <input type="submit" value="[ SEARCH ]">
        </form>

        <%
            List<Student> std = (List) session.getAttribute("students");
            if (std != null) {

        %>
        <table>
            <tr>
                <td>Id</td>

                <td>NAME</td>
                <td>SURNAME</td>
                <td>DOB</td>
                <td>CLASSROOM</td>

            </tr>

            <%for (Student s : std) {%>
            <tr><td><%= s.getsId()%></td>
                <td><%=s.getsFName()%></td>  <td><%=s.getsLName()%></td>

                <td><%=s.getDob()%></td>  <td><%=s.getClassroom()%></td> 


            </tr>
            <%}%>
        </table>


        <%} else {%>
        <%=request.getAttribute("message")%>
        <%}%>
        <hr>
        <h3 style="color:red;margin-left:50px">${message}</h3>
        <hr>
    </body>
</html>
