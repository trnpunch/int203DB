<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="loginOrlogout" value="${sessionScope.user==null?'Login':'Logout'}"/>
<table style="background-color: lightgray">
            <tr>
                <td style="width: 10%">
                    <!--<a href="index.jsp"><img src="Lambo_full[1].png" width="150px"></a>-->
                </td>      
                <td style="width: 1%"></td>
                <td style="width: 70%;font-size: x-large;color: bisque">${param.title}</td>
                <td style="width: 10%">
                </td>
                <td>    
                    <a href="${loginOrlogout}" title="${loginOrlogout}">
                      <img src="Lambo_full[1].png" width="150px"></a><br>
                        Hello<c:out value="${user.sFName}" default="Guest"/>
                </td>
                <td style="width:3%"></td>
            </tr>
        </table>
