/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.accesosBean;
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
public class accesoImp implements crudInterface{
    
    
    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO accesos(nomVista,codRol) values (?,?)";
    private final String sqlistado = "SELECT * FROM accesos where codAcces = ?";
    private final String sqlistadoCompleto = "SELECT * FROM accesos ";
    private final String sqlDelete = "DELETE from accesos WHERE codAcces = ?";
    private final String sqlUpdate = "UPDATE  accesos SET nomVista = ? ,codRol = ? where codAcces = ?";

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
            accesosBean acceso;
            rs = cd.listar(sqlistado,id);

            while (rs.next()) {
                acceso = new accesosBean();
                acceso.setCodAcceso(rs.getInt(1));
                acceso.setNomVista(rs.getString(2));
                acceso.setFK_codRol(rs.getInt(3));
                lista.add(acceso);
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
             accesosBean acceso;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                acceso = new accesosBean();
                acceso.setCodAcceso(rs.getInt(1));
                acceso.setNomVista(rs.getString(2));
                acceso.setFK_codRol(rs.getInt(2));
                lista.add(acceso);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    
}
