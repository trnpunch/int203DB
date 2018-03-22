<%-- 
    Document   : Parant
    Created on : Nov 13, 2016, 5:14:15 PM
    Author     : lambopunchh
--%>

<%@page import="java.util.List"%>
<%@page import="model.Parant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
                <jsp:include page="/HOME.jsp?title=PARANT ${user.sFName}"/>

              <%--<jsp:useBean id="parant" scope="session" type="model.Parant"/>--%>
              <%
                  String parants = request.getParameter("parantId");
              %>
              
              PARANT ของ  :  ${user.sFName} &nbsp;&nbsp;${user.sLName} <br>
              PARANT NAME : ${parants.pFName}&nbsp;&nbsp; ${parants.pLName}<br>
              PARANT PHONE: ${parants.pPhone}<br>
              PARANT ADDRESS : ${parants.pAddress}

              

        
        
    </body>
</html>
