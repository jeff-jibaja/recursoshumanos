/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.profesionBean;
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
public class profesionImp implements crudInterface {

    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO profesion_oficio(profesion) values (?)";
    private final String sqlistado = "SELECT * FROM profesion_oficio WHERE codProfesion = ?";
    private final String sqlistadoCompleto = "SELECT * FROM profesion_oficio";
    private final String sqlDelete = "DELETE from profesion_oficio WHERE codProfesion = ?";
    private final String sqlUpdate = "UPDATE  profesion_oficio SET profesion = ? where codProfesion = ?";

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
            profesionBean prof;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                prof = new profesionBean();
                prof.setCodigo(rs.getInt(1));
                prof.setNomProfesion(rs.getString(2));
                lista.add(prof);
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
            profesionBean prof;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                prof = new profesionBean();
                prof.setCodigo(rs.getInt(1));
                prof.setNomProfesion(rs.getString(2));
                lista.add(prof);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
