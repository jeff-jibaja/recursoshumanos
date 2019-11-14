/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CADO;

import datos.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeff
 */
public class cado_call {
    
    
 
    private static final  ConexionBD con = ConexionBD.EstadoCon();
    
    public boolean insert(String name){
        try {
            con.getConexion().prepareCall(name);
        } catch (SQLException ex) {
            Logger.getLogger(cado_call.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.CerrarConeccion();
        }
        
        return false;
    }
    
}
