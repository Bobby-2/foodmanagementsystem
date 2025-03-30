<%-- 
    Document   : Food
    Created on : 23 May, 2024, 1:50:57 PM
    Author     : USER
--%>

<%@page import="bean.Userlist"%>
<%@page import="food.DBAccess"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>view food list</title>
    </head>
    <body>
        <div id="deff">
            <h1>List of users</h1>
              <table border='1'>
                <tr><th>UserID</th><th>Mobileno</th><th>Fullname</th><th>Email</th><th>Address</th><th>Username</th><th>Usertype</th></tr>
                        <%DBAccess dBAccess = new DBAccess(session);
                    for (Userlist user  : dBAccess.listofuser()) {%>
                <tr>
                <td><%=user.getUserID()%></td>
                <td><%=user.getMobileno()%></td>
                <td><%=user.getFullname()%></td>
                <td><%=user.getEmail()%></td>
                <td><%= user.getAddress()%></td>
                <td><%=user.getUsername()%></td>
                <td><%= user.getUsertype()%></td>
               <td>
                    <a href="./DeleteServlet?uid=<%=user.getUserID()%>">Delete</a>                       
                </td> 
                </tr>
                <%}%>
            </table>
        </div>
    </body>
</html>
