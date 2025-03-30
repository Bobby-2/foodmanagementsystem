
<%--
    Document   : Contactus
    Created on : 21 May, 2024, 6:31:13 PM
    Author     : Home
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CONTACT US</title>
    </head>
    <body>
 
        <section>
            <style>
                body {
                    font-family: Arial, sans-serif;
                    background-color: #ddd;
                    margin: 0;
                    padding: 0;
                    display: flex;
                    justify-content: center;
                    align-items: center;
                    height: 100vh;
                    background-image:url("image/fms.jpeg");

                }
                .main {
                    background-color:lightgoldenrodyellow;
                    border-radius: 15px;
                    box-shadow: 0 0 20px
                        rgba(0, 0, 0, 0.2);
                    padding: 20px;
                    width: 300px;
                }

                .main h2 {
                    color: #4caf50;
                    margin-bottom: 20px;
                }

                label {
                    display: block;
                    margin-bottom: 5px;
                    color: #555;
                    font-weight: bold;
                }
                
                select {
                    width: 100%;
                    margin-bottom: 15px;
                    padding: 10px;
                    box-sizing: border-box;
                    border: 1px solid #ddd;
                    border-radius: 5px;
                }

                button[type="submit"] {
                    padding: 15px;
                    border-radius: 10px;
                    border: none;
                    background-color: rosybrown;
                    color: white;
                    cursor: pointer;
                    width: 100%;
                    font-size: 16px;
                }
            </style>
            <div class="sub-menu-4">
                <form action="./RegisterServlet" method="post">
                    <h3 align="left"><p> CONTACT US</p></br>
                        <p>Food management team </p>  </br>
                        <p>Contact no.:1234567890</p>
                   </h3>
                    
                </form>
            </div>
        </section>
    </body>
</html>

