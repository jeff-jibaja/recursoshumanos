/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.retiroBean;
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
public class retiroImp implements crudInterface{
    
    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO retiro(fechaRetiro,codContrato,codMotivoR) values (?,?,?)";
    private final String sqlistado = "SELECT * FROM retiro where codRetiro = ?";
    private final String sqlistadoCompleto = "SELECT * FROM retiro ";
    private final String sqlDelete = "DELETE from retiro WHERE codRetiro = ?";
    private final String sqlUpdate = "UPDATE  retiro SET fechaRetiro = ?,"
                                                    + " codContrato = ? ,"
                                                    + "codMotivoR = ? "
                                                    + "where codRetiro = ?";

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insert(Object[] obj) {
        try {
            Object[] param = new Object[3];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
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
            Object[] param = new Object[4];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
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
            retiroBean retiro;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                retiro = new retiroBean();
                retiro.setCodRetito(rs.getInt(1));
                retiro.setFechaRetiro(rs.getString(2));
                retiro.setFK_codContrato(rs.getInt(3));
                retiro.setFK_codMotivo(rs.getInt(4));
                lista.add(retiro);
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
           retiroBean retiro;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                retiro = new retiroBean();
                retiro.setCodRetito(rs.getInt(1));
                retiro.setFechaRetiro(rs.getString(2));
                retiro.setFK_codContrato(rs.getInt(3));
                retiro.setFK_codMotivo(rs.getInt(4));
                lista.add(retiro);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    
}
