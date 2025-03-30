<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0"
            />
        <title>Login Form</title>
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

            input[type="text"],
            input[type="User name"],
            input[type="password"],
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
    </head>

    <body>
        
        <div class="main">
            <h2>Login Form</h2>
            <form action="./LoginServlet" method="post">
                <label for="User name"
                       >User name:</label
                >
                <input
                    type="User name"
                    id="User name"
                    name="username"
                    />
                <label for="password"
                       >Password:</label
                >
                <input
                    type="password"
                    id="password"
                    name="password"
                    />

                
                <button type="submit">
                    Submit
                </button></br></br></br>
                <button  onclick="goback()">Go Back</button>
                
            </form>
        </div>
    </body>
</html>