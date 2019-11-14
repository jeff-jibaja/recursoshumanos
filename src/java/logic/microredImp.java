/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


import BEANS.microredBean;
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
public class microredImp implements crudInterface{

     CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO microred(microred,red) values (?,?)";
    private final String sqlistado = "SELECT * FROM microred where codMicro = ?";
    private final String sqlistadoCompleto = "SELECT * FROM microred ";
    private final String sqlDelete = "DELETE from microred WHERE codMicro = ?";
    private final String sqlUpdate = "UPDATE  microred SET microred = ?, red = ?  where codMicro = ?";

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
            microredBean micro;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                micro = new microredBean();
                micro.setCodMicro(rs.getInt(1));
                micro.setNomMicro(rs.getString(2));
                micro.setFK_codRed(rs.getInt(3));
                lista.add(micro);
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
            microredBean micro;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                micro = new microredBean();
                micro.setCodMicro(rs.getInt(1));
                micro.setNomMicro(rs.getString(2));
                micro.setFK_codRed(rs.getInt(3));
                lista.add(micro);
           }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }   
}