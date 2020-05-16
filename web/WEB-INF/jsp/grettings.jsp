<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grettings</title>
    </head>

    <style>
        table, th, td {
            border: 1px solid black;
            border-collapse: collapse;
        }
    </style>

    <body style="background-color: #ccff66">
        <p style="text-align: center; font-size: 50px">${msg}</p>
        <p style="text-align: center; font-size: 50px">${InitMessage}</p>
<!--        <p style="text-align: center; font-size: 50px">Hello ${b.ename} you are from ${b.eaddress}</p>
        <p style="text-align: center; font-size: 50px">${b.empMobile}</p>
        <p style="text-align: center; font-size: 50px">${b.DOB}</p>
        <p style="text-align: center; font-size: 50px">${b.skills}</p>-->
        <div align="center">
            <table>
                <tr>
                    <td><label>Name</label></td>
                    <td>${b.ename}</td>
                </tr>

                <tr>
                    <td><label>Address</label></td>
                    <td>${b.eaddress}</td>
                </tr>

                <tr>
                    <td><label>Mobile</label></td>
                    <td>${b.empMobile}</td>
                </tr>

                <tr>
                    <td><label>Date of Birth</label></td>
                    <td>${b.DOB}</td>
                </tr>

                <tr>
                    <td><label>Skills</label></td>
                    <td>${b.skills}</td>
                </tr>
            </table>
        </div>
    </body>
</html>
