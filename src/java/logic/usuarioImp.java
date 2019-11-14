/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.suspensionBean;
import BEANS.usuarioBean;
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
public class usuarioImp implements crudInterface{
    
     
      CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO usuario(usuario,contrase,codRol,codPersona) values (?,?,?,?)";
    private final String sqlistado = "SELECT * FROM usuario where codUsuario = ?";
    private final String sqlistadoCompleto = "SELECT * FROM usuario ";
    private final String sqlDelete = "DELETE from usuario WHERE codUsuario = ?";
    private final String sqlUpdate = "UPDATE  usuario  SET usuario = ?,"
                                                            + "contrase = ?,"
                                                            + "codRol = ?,"
                                                            + "codPersona = ?"
                                                            + " where codUsuario = ?";

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
           usuarioBean usu;
            rs = cd.listar(sqlistado, id);        
            while (rs.next()) {
                usu = new usuarioBean();
                usu.setCodUusario(rs.getInt(1));
                usu.setUsuario(rs.getString(2));
                usu.setContraseña(rs.getString(3));
                usu.setFK_codRol(rs.getInt(4));
                usu.setFK_codPersona(rs.getInt(5));
                lista.add(usu);
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
            usuarioBean usu;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                usu = new usuarioBean();
                usu.setCodUusario(rs.getInt(1));
                usu.setUsuario(rs.getString(2));
                usu.setContraseña(rs.getString(3));
                usu.setFK_codRol(rs.getInt(4));
                usu.setFK_codPersona(rs.getInt(5));
                lista.add(usu);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    
    
}
