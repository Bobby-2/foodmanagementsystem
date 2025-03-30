<%@page import="bean.Food"%>
<%@page import="food.DBAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Food Request:</h1>
        <table border='1'>
                <tr><th>Food ID</th><th>Food name</th><th>Food type</th><th>description</th><th>Qty</th><th>fooddate</th><th>Expirydate</th><th>Location</th></tr>
                <%DBAccess dBAccess = new DBAccess(session);
                            for (Food food : dBAccess.ListTodayfood()) {%>
                <tr>
                    <td><%=food.getFoodid()%></td>
                    <td><%=food.getFoodname()%></td>
                    <td><%= food.getfoodtype()%></td>
                    <td><%=food.getdescription()%></td>
                    <td><%=food.getQty()%></td>
                    <td><%= food.getfooddate()%></td>
                    <td><%=food.getexpirydate()%></td>                    
                    <td><%= food.getlocation()%></td>
                    <td>
                        <a href="./AddRequestServlet?fid=<%=food.getFoodid()%>"><button value="RAISE REQUEST">RAISE REQUEST</button></a>                       
                    </td>
                </tr>
                <%}%>
            </table>
    </body>
</html>
