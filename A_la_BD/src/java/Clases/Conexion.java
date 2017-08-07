/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;// import 1
import java.sql.DriverManager; // import 2


/**
 *
 * @author USUARIO
 */
public class Conexion {
public Connection conn;
public String cadenaConexion = "jdbc:mysql://localhost/ejemplo";
public String nomuser="root";
public String pass="";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion obj= new Conexion();
        System.out.println(obj.conectar());
        
        
    }
    
    boolean conectar()
    {boolean salida=false;
    try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(cadenaConexion,nomuser,pass);
            if(conn != null){
                System.out.println("Exito");  
                salida=true;
            }else{
                System.out.println("Error de Conexion");  
                salida=false;
            }
        
        }catch(Exception ex){
            System.out.println("Error: "+ex);
            salida=false;
        }
    return salida;
    }

  
    public Connection getConn() {
        return conn;
    }

  
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    /**
     * @return the cadenaConexion
     */
    public String getCadenaConexion() {
        return cadenaConexion;
    }

    /**
     * @param cadenaConexion the cadenaConexion to set
     */
    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }

    /**
     * @return the nomuser
     */
    public String getNomuser() {
        return nomuser;
    }

    /**
     * @param nomuser the nomuser to set
     */
    public void setNomuser(String nomuser) {
        this.nomuser = nomuser;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
 
   
}
