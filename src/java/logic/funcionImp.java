/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;


import BEANS.funcionesBean;
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
public class funcionImp implements crudInterface{

   CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO funcionesCargo(nomFuncion,cargo) values (?,?)";
    private final String sqlistado = "SELECT * FROM funcionesCargo where codFuncion = ?";
    private final String sqlistadoCompleto = "SELECT * FROM funcionesCargo ";
    private final String sqlDelete = "DELETE from funcionesCargo WHERE codFuncion = ?";
    private final String sqlUpdate = "UPDATE  funcionesCargo SET nomFuncion = ?, cargo = ?  where codFuncion = ?";

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
            funcionesBean fun;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                fun = new funcionesBean();
                fun.setCodFuncion(rs.getInt(1));
                fun.setNomFuncion(rs.getString(2));
                fun.setFK_codCargo(rs.getInt(3));
                lista.add(fun);
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
            funcionesBean fun;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                fun = new funcionesBean();
                fun.setCodFuncion(rs.getInt(1));
                fun.setNomFuncion(rs.getString(2));
                fun.setFK_codCargo(rs.getInt(3));
                lista.add(fun);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }
    
}
