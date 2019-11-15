/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;

public class ConexionBD {
   
    
    public static ConexionBD ConActual;
    private Connection con;
    
    
    private void conectar(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql = "jdbc:sqlserver://localhost:1434;databaseName=RRHH";
            try{
                con = DriverManager.getConnection(sql,"sa","123");
                
            }catch(SQLException SQL){
                System.out.println("error en la conexion "+SQL.getMessage());
            }
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
   private  ConexionBD() {     
        conectar();
    }   
 
    public static synchronized ConexionBD EstadoCon(){
        if(ConActual==null){
            ConActual= new ConexionBD();
        }
       return ConActual;
    }

    public Connection getConexion() {
        try {
            boolean conexionValida = verificarConexion();
            if(!conexionValida){
                conectar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
      
    public void CerrarConeccion(){
       ConActual = null;        
    }    
    
    public boolean verificarConexion() throws SQLException{
        return con.isValid(30);
    }
    
    
}  