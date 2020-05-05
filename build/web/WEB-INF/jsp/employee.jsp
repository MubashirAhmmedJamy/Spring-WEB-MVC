<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    <body>
        <h1>Employee</h1>
        
        <form method="post" action="/Spring-WEB-MVC/employee">
            <label>Name</label>
            <input type="text" name="ename"/>
            
            <label>Address</label>
            <input type="text" name="eaddress"/>

            <input type="submit"/>
        </form>
    </body>
</html>
