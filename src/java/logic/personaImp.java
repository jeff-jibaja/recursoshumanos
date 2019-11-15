/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.personaBean;
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
public class personaImp implements crudInterface {

    CADO cd = new CADO();

    private final String sqlinsert = "insert into persona (nombres,apellidoPaterno,apellidoMaterno,dni,telefono,nacimiento,sexo,email) "
            + "values (?,?,?,?,?,?,?,?);";
    private final String sqlistado = "SELECT * FROM persona where codPersona = ?";
    private final String sqlistadoCompleto = "SELECT * FROM persona";
    private final String sqlDelete = "DELETE from persona WHERE codPersona = ?";
    private final String sqlUpdate = "UPDATE  persona SET nombres = ? ,"
                                                   + " apellidoPaterno = ? , "
                                                   + " apellidoMaterno = ?, "
                                                   + " dni = ? ,"
                                                   + " telefono = ? ,"
                                                   + " nacimiento = ?, "
                                                   + " sexo = ?, "
                                                   + " email = ? "
                                                   + "where codPersona = ?";

    PreparedStatement ps;
    ResultSet rs;
    

    @Override
    public boolean insert(Object[] per) {
        try {
            Object[] param = new Object[8];
            param[0] = per[0];
            param[1] = per[1];
            param[2] = per[2];
            param[3] = per[3];
            param[4] = per[4];
            param[5] = per[5];
            param[6] = per[6];
            param[7] = per[7];

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
    public boolean update(Object[] per) {
         try {
            Object[] param = new Object[9];
            param[0] = per[0];
            param[1] = per[1];
            param[2] = per[2];
            param[3] = per[3];
            param[4] = per[4];
            param[5] = per[5];
            param[6] = per[6];
            param[7] = per[7];
            param[8] = per[8];

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
            personaBean per  = new personaBean();
            rs = cd.listar(sqlistado,id);

            while (rs.next()) {              
                per.setCodigo(rs.getInt(1));
                per.setNombre(rs.getString(2));
                per.setApellidoPat(rs.getString(3));
                per.setApellidoMat(rs.getString(4));
                per.setDni(rs.getString(5));
                per.setTelefono(rs.getString(6));
                per.setNacimiento(rs.getString(7));
                per.setSexo(rs.getString(8));
                per.setEmail(rs.getString(9));
                lista.add(per);
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
            personaBean per;
            rs = cd.listar(sqlistadoCompleto);
            while (rs.next()) {      
                per  = new personaBean();
                per.setCodigo(rs.getInt(1));
                per.setNombre(rs.getString(2));
                per.setApellidoPat(rs.getString(3));
                per.setApellidoMat(rs.getString(4));
                per.setDni(rs.getString(5));
                per.setTelefono(rs.getString(6));
                per.setNacimiento(rs.getString(7));
                per.setSexo(rs.getString(8));
                per.setEmail(rs.getString(9));
                lista.add(per);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
