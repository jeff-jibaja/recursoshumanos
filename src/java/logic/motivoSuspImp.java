/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import CADO.CADO;
import interfaces.crudInterface;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jeff
 */
public class motivoSuspImp implements crudInterface {

    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO motivoSuspension(motivoSuspension) values (?)";
    private final String sqlistado = "SELECT * FROM motivoSuspension";
    private final String sqlDelete = "DELETE from motivoSuspension WHERE codMotivoSus = ?";
    private final String sqlUpdate = "UPDATE  motivoSuspension SET motivoSuspension = ? where codCargo = ?";

    PreparedStatement ps;
    ResultSet rs;
    
    
    @Override
    public boolean insert(Object[] obj) {
  try {
            Object[] param = new Object[1];
            param[0] = obj[0];
            if (cd.insert(sqlinsert, param)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;    }

    @Override
    public boolean delet(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(Object[] obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
