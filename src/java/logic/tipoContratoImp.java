/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.tipoContratoBean;
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
public class tipoContratoImp implements crudInterface {

    CADO cd = new CADO();

    private final String sqlinsert = "insert into tipoContrato(nomTipoCont) values (?)";
    private final String sqlistado = "SELECT * FROM tipoContrato";
    private final String sqlistadoCompleto = "SELECT * FROM tipoContrato WHERE codTipoCont = ?";
    private final String sqlDelete = "DELETE from tipoContrato WHERE codTipoCont = ?";
    private final String sqlUpdate = "UPDATE  tipoContrato SET nomTipoCont = '?' where codTipoCont = ?";

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
            Logger.getLogger(tipoContratoImp.class.getName()).log(Level.SEVERE, null, ex);
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
            tipoContratoBean cont;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                cont = new tipoContratoBean();
                cont.setCodTipoCont(rs.getInt(1));
                cont.setTipoContrato(rs.getString(2));
                lista.add(cont);
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
            tipoContratoBean cont;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                cont = new tipoContratoBean();
                cont.setCodTipoCont(rs.getInt(1));
                cont.setTipoContrato(rs.getString(2));
                lista.add(cont);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
