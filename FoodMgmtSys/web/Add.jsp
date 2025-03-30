<%-- 
    Document   : Add.jsp
    Created on : 22 May, 2024, 6:28:51 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Food</title>
    </head>
    <body>
        <form action = "./AddFoodServlet" method="post">
            <table border="0">
                <tbody>
                    <tr>
                        <td>Enter Food Item :  </td>
                        <td><input type="text" name="name" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter Food Type :  </td>
                        <td><input type="text" name="type" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter Food Description :  </td>
                        <td><input type="text" name="description" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter Food Quantity :  </td>
                        <td><input type="text" name="qty" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter date  :  </td>
                        <td><input type="text" name="date" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter Expiry date :  </td>
                        <td><input type="text" name="expiry" value=""required></td>
                    </tr>
                    <tr>
                        <td>Enter Location :  </td>
                        <td><input type="text" name="location" value=""required></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="save"/></td>
                    </tr>
                    <tr>
                        <td><input type="reset" value="clear"/></td>
                    </tr>
                </tbody>
            </table>
            
        </form>
        
        
    </body>
</html>
