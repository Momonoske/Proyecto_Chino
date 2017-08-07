<%-- 
    Document   : insertar
    Created on : 3/11/2016, 12:17:57 PM
    Author     : USUARIO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Papelería ADRI</title>
    </head>
    <body background="imag/fondo_4.jpg">
    <center><h1>Alta de usuarios</h1></center>
    <center><fieldset style="border:2px solid red; width:200px;height:200px;">
            <legend>Ingresar datos</legend>
            <br>
            <form name="form1" method="POST" action="alta">
            
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
                    <td> Nombre </td>
                    <td> 
                        <input type="text" name="name" required="true" title="Campo requerido">
                    </td>
                </tr>
                <tr>
                    <td> Perfil </td>
                    <td> 
                        <input type="text" name="perfil" required="true" title="Campo requerido">
                    </td>
                </tr>
                
                  <tr>
                    <td align="center"> 
                        <input type="submit" name="btn2" value="Registrar">
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
