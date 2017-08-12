<%-- 
    Document   : login
    Created on : 12/08/2017, 12:31:10 AM
    Author     : MonserratAdriana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LogIn ADRI</title>
    </head>
    <body background="imag/fondo_2.jpg">
        
        <br><br><br><br><br><br><br>
         <center><fieldset style="border:2px solid blueviolet; width:300px;height:300px;">
            <legend>LogIn</legend>
            <br>
            <form name="form1" method="POST" action="alta">
                <img src="imag/logo.png" width="120px"  >
            <table>
                <tr>
                    <td> Usuario </td>
                    <td> 
                        <input type="text" name="user" required="true" title="Campo requerido">
                    </td>
                </tr>
                <tr>
                    <td> Password </td>
                    <td> 
                        <input type="password" name="pass" required="true" title="Campo requerido">
                    </td>
                </tr>
                
                  <tr>
                     <td align="center"> 
                        <input type="submit" name="btn2" value="Ingresar">
                    </td>
                    <td align="center"> 
                        <input type="reset" name="btn2" value="Limpiar">
                        <!--<input type='button' onclick='history.back()' name='volver' value='Cancelar'>
                        <input type='image' src='barca.jpg' width='100' height='20' onclick='history.back()'>
                        -->
                    </td>
                </tr>
            </table>
            </form>
        </fieldset></center>
    </body>
</html>
