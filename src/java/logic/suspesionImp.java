/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


import BEANS.suspensionBean;
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
public class suspesionImp implements crudInterface{
    
    
      CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO suspension(inicioSuspension,finSuspension,codContrato,codMotivoSus) values (?,?,?,?)";
    private final String sqlistado = "SELECT * FROM suspension where codSuspension = ?";
    private final String sqlistadoCompleto = "SELECT * FROM suspension ";
    private final String sqlDelete = "DELETE from suspension WHERE codSuspension = ?";
    private final String sqlUpdate = "UPDATE  suspension  SET inicioSuspension = ?,"
                                                            + "finSuspension = ?,"
                                                            + "codContrato = ?,"
                                                            + "codMotivoSus = ?"
                                                            + " where codSuspension = ?";

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insert(Object[] obj) {
        try {
            Object[] param = new Object[4];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
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
            Object[] param = new Object[5];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
            param[4] = obj[4];
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
            suspensionBean suspen;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                suspen = new suspensionBean();
                suspen.setCodSuspension(rs.getInt(1));
                suspen.setInicioSuspension(rs.getString(2));
                suspen.setFeinSuspension(rs.getString(3));
                suspen.setFK_codContrato(rs.getInt(4));
                suspen.setFK_codMotivo(rs.getInt(5));
                lista.add(suspen);
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
            suspensionBean suspen;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                suspen = new suspensionBean();
                suspen.setCodSuspension(rs.getInt(1));
                suspen.setInicioSuspension(rs.getString(2));
                suspen.setFeinSuspension(rs.getString(3));
                suspen.setFK_codContrato(rs.getInt(4));
                suspen.setFK_codMotivo(rs.getInt(5));
                lista.add(suspen);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    
}
