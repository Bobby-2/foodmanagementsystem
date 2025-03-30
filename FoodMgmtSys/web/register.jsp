
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8" />
        <meta
            name="viewport"
            content="width=device-width, initial-scale=1.0"
            />
        <title>Registration Form</title>
       
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #ddd;
                margin-top: 10px;
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
            input[type="email"],
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
            <h2>Registration Form</h2>
            <form action="./RegisterServlet" method="post">
                <label>Full name:</label>
                <input
                    type="text"
                    name="Fullname"
                    />

                <label>Email:</label>
                <input
                    type="email"
                    
                    name="Email"
                    required
                    />
                <label 
                       >User_Name:</label
                >
                <input
                    type="text"
                    name="User_name"
                    />
                <label 
                       >Password:</label
                >
                <input
                    type="password"
                   
                    name="password"
                    />

                <label 
                       >Mobile_no:</label
                >
                <input
                    type="text"
                    
                    name="mobile"
                    maxlength="10"
                    required
                    />
                 <label 
                       >Address:</label
                >
                <input
                    type="text"
                    
                    name="Address"
                    maxlength="10"
                    required
                    />
                <button type="submit">
                    Submit
                </button> </br> 
                <br> <button  onclick="goback()">Go Back</button>
                <button style="float:right">Clear</button>
            </form>
        </div>
    </body>
</html>