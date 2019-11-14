/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.motivoSuspensionBean;
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
    private final String sqlistado = "SELECT * FROM motivoSuspension where codMotivoSus = ?";
    private final String sqlistadoCompleto = "SELECT * FROM motivoSuspension  ";
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
        return false;
    }

    @Override
    public boolean delet(int id) {
        try {
            Object[] param = new Object[1];
            param[0] = id;
            if (cd.eliminar(sqlDelete, param)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(Object[] obj) {
        try {
            Object[] param = new Object[2];
            param[0] = obj[0];
            param[1] = obj[1];
            if (cd.editar(sqlUpdate, param)) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<Object> listar(int id) {
        ArrayList<Object> lista = new ArrayList();
        try {
             motivoSuspensionBean motS;
            rs = cd.listar(sqlistado,id);

            while (rs.next()) {
                motS = new motivoSuspensionBean();
                motS.setCodMotivoSus(rs.getInt(1));
                motS.setNombreSus(rs.getString(2));
                lista.add(motS);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    @Override
    public ArrayList<Object> listar() {
        ArrayList<Object> lista = new ArrayList();
        try {
            motivoSuspensionBean motS;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                motS = new motivoSuspensionBean();
                motS.setCodMotivoSus(rs.getInt(1));
                motS.setNombreSus(rs.getString(2));
                lista.add(motS);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }  
    
}
