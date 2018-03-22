<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table style="background-color: azure">
    <tr>
        <td style="width: 10%">
            <!--<a href="StudentView.jsp"><img src="Lambo_full[1].png" width="150px"></a>-->
        </td>      
        <td style="width: 1%"></td>
        <td style="width: 70%;font-size: x-large;color: lightseagreen">${param.title}</td>
        <td>    
            <a href="Profile.jsp" title="${loginOrlogout}">
                <img src="Lambo_full[1].png" width="150px"></a><br>
    <center style="color: green">Hello ${user.getsFName()}</center>
        </td>
        <td style="width:3%"></td>
    </tr>
</table>
