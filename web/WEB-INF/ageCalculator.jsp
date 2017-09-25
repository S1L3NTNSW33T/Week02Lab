<%-- 
    Document   : ageCalculator
    Created on : Sep 19, 2017, 1:18:06 PM
    Author     : 687159
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Next Birthday</h1>
        <div>
            <form method="get">
                Enter your current age: <input type="text" name="ageBox">
                <input type="submit" value="Age Next Birthday">
            </form>
        </div>
        ${errorMessage}
        ${ageMessage}
    </body>
</html>
