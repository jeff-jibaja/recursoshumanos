/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.establecimientoBean;
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
public class estabImp implements crudInterface {

    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO establecimiento(establecimiento,microred) values (?,?)";
    private final String sqlistado = "SELECT * FROM establecimiento where codEstab = ?";
    private final String sqlistadoCompleto = "SELECT * FROM establecimiento ";
    private final String sqlDelete = "DELETE from cargo WHERE codEstab = ?";
    private final String sqlUpdate = "UPDATE  cargo SET nomCargo = ? where codCargo = ?";

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insert(Object[] obj) {
        try {
            Object[] param = new Object[2];
            param[0] = obj[0];
            param[1] = obj[1];
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
            Object[] param = new Object[3];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
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
            establecimientoBean estab;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                estab = new establecimientoBean();
                estab.setCodEst(rs.getInt(1));
                estab.setNomEst(rs.getString(2));
                estab.setFK_codMicro(rs.getInt(3));
                lista.add(estab);
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
            establecimientoBean estab;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                estab = new establecimientoBean();
                estab.setCodEst(rs.getInt(1));
                estab.setNomEst(rs.getString(2));
                estab.setFK_codMicro(rs.getInt(3));
                lista.add(estab);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
