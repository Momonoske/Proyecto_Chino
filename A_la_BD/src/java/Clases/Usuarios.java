/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;// import 3
import java.sql.ResultSet; // import 4

/**
 *
 * @author USUARIO
 */
public class Usuarios extends Conexion{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuarios ing= new Usuarios();
        //System.out.println(ing.insertar_usuario_proceso_1());
        //System.out.println(ing.insertar_usuario_proceso_2("axeaaa","6789","ejem",1));
        System.out.println(ing.consulta_todo_2());
    }
    
        String insertar_usuario_proceso_1()
        {String salida="";
        try {
            setConn(DriverManager.getConnection(getCadenaConexion(), getNomuser(), getPass()));
            String query = "insert into usuario values ('juana','1234','Alejandro',1)";
            PreparedStatement stm = (PreparedStatement) getConn().prepareStatement(query);
            stm.executeUpdate();
            getConn().close();
            salida="Se inserto correctamente el usuario";
            } catch (Exception e) {
                    System.out.println("Fallo la insercciòn");
                    e.printStackTrace();
                    salida="No se pudo insertar el usuario";
            } 
        return salida;
        }
    
    String insertar_usuario_proceso_2(String p1,String p2,String p3, int p4)
    {String salida="";
    try {
        setConn(DriverManager.getConnection(getCadenaConexion(), getNomuser(), getPass()));
        String query = "insert into usuario values (?,?,?,?)";
        PreparedStatement stm = (PreparedStatement) getConn().prepareStatement(query);
        stm.setString(1, p1);
        stm.setString(2, p2);
        stm.setString(3, p3);
        stm.setInt(4, p4);
        stm.executeUpdate();
        getConn().close();
        salida="Se inserto correctamente el usuario";
        } catch (Exception e) {
                System.out.println("Fallo la insercciòn");
                e.printStackTrace();
                salida="No se pudo insertar el usuario";
        } 
    return salida;
    }
    
    
    String consulta_todo()
    {String salida="";
    try {
        setConn(DriverManager.getConnection(getCadenaConexion(), getNomuser(), getPass()));
        String query = "select * from usuario";
        PreparedStatement stm = (PreparedStatement) getConn().prepareStatement(query);
        
        ResultSet rs = stm.executeQuery();
            while (rs.next()) {
            String camp1 = rs.getString("usuario");
            String camp2 = rs.getString("password");
            String camp3 = rs.getString("nombre");
            int camp4= rs.getInt("idperfil");
            salida=salida+"Usuario: "+camp1+"\n"+"Password: "+camp2+
                    "\n Nombre: "+camp3+"\n Perfil: "+camp4+"\n------\n";
        }
        getConn().close();
        } catch (Exception e) {
                System.out.println("Fallo la insercciòn");
                e.printStackTrace();
                salida="No existen registros";
        } 
    return salida;
    }
    
    String consulta_todo_2()
    {String salida="";
    try {
        setConn(DriverManager.getConnection(getCadenaConexion(), getNomuser(), getPass()));
        String query = "select * from usuario";
        PreparedStatement stm = (PreparedStatement) getConn().prepareStatement(query);
        salida="<table cellpadding='10' align='center' style='border:2px solid red; width:80%; height:100%;'>"+
                "<tr> <td> Usuario </td>"
                + "<td> Password </td>"
                + "<td> Nombre </td>"
                + "<td> Perfil </td>"
                + "<td>Acciones</td></tr>";
        ResultSet rs = stm.executeQuery();
            while (rs.next()) {
            String camp1 = rs.getString("usuario");
            String camp2 = rs.getString("pass");
            String camp3 = rs.getString("nombre");
            int camp4= rs.getInt("idperfil");
            salida=salida+"<tr>"
                    +"<td>"+camp1+"</td>"
                    +"<td>"+camp2+"</td>"
                    +"<td>"+camp3+"</td>"
                    +"<td>"+camp4+"</td>"
                    +"<td>"
                    + "<a href='insertar.jsp'> Alta de usuario </a>"
                    +"<br>"
                    +"<a href='eliminar?variable="+camp1+"'> Eliminar </a>"
                    
                    + "</td>"
                    +"</tr>";
        }
            salida=salida+"</table>";
                    
        getConn().close();
        } catch (Exception e) {
                System.out.println("Fallo la insercciòn");
                e.printStackTrace();
                salida="No existen registros";
        } 
    return salida;
    }
    
     String eliminar (String p1)
    {String salida="";
    try {
        setConn(DriverManager.getConnection(getCadenaConexion(), getNomuser(), getPass()));
        String query = "delete from usuario where usuario=?";
        PreparedStatement stm = (PreparedStatement) getConn().prepareStatement(query);
        stm.setString(1, p1);
        stm.executeUpdate();
        getConn().close();
        salida="Se elimino correctamente al usuario";
        } catch (Exception e) {
                System.out.println("Fallo la insercciòn");
                e.printStackTrace();
                salida="No se pudo eliminar al usuario";
        } 
    return salida;
    }
    
    
}
