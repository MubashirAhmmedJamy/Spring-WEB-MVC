<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee</title>
    </head>
    
    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>
    
    
    <body>
        <h1>Employee</h1>

        <form method="post" action="/Spring-WEB-MVC/employee">
            <label>Name</label>
            <input type="text" name="ename"/>

            <label>Address</label>
            <input type="text" name="eaddress"/>

            <input type="submit"/>
        </form>


        <br><br><br>

        <div style="display: block" align="center">
            <form method="post" action="/Spring-WEB-MVC/emp" >

                <table>
                    <tr>
                        <td><label>Name</label></td>
                        <td><input type="text" name="ename"/></td>
                    </tr>

                    <tr>
                        <td><label>Address</label></td>
                        <td><input type="text" name="eaddress"/></td>
                    </tr>

                    <tr>
                        <td><label>Mobile</label></td>
                        <td><input type="text" name="empMobile"/></td>
                    </tr>

                    <tr>
                        <td><label>Date of Birth</label></td>
                        <td><input type="date" name="DOB"/></td>
                    </tr>

                    <tr>
                        <td><label>Skills</label></td>
                        <td>
                            <select name="skills" multiple>
                                <option value="Java">Java</option>
                                <option value="C">C</option>
                                <option value="C++">C++</option>
                                <option value="PHP">PHP</option>
                            </select>
                        </td>
                    </tr>

                    <tr><td colspan="2" align="center"><input type="submit"/></td></tr>

                </table>
            </form>            
        </div>
        
        <form:errors path="b.*"/>


    </body>
</html>
