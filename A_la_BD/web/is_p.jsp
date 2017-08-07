<%-- 
    Document   : is_p
    Created on : 6/08/2017, 04:23:32 PM
    Author     : MonserratAdriana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Insertando datos</h1>
        <fieldset style="border:2px solid red; width:200px;height:200px;">
            <legend>Ingresar datos</legend>
            <br>
            <form name="form1" method="POST" action="alta">
            
            <table>
                <tr>
                    <td> Producto </td>
                    <td> 
                        <input type="text" name="producto" required="true" title="Campo requerido">
                    </td>
                </tr>
                <tr>
                    <td> Marca </td>
                    <td> 
                        <input type="text" name="marca" required="true" title="Campo requerido">
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
       </fieldset>
        
    </body>
</html>
