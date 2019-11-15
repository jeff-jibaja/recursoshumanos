/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CADO;

import datos.ConexionBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author garci
 */
public class CADO {

    PreparedStatement ps;
    ResultSet rs;
    private static final  ConexionBD con = ConexionBD.EstadoCon();
   
    public boolean insert(String sql, Object param[]) throws SQLException {

        boolean exito = false;
        try {
            ps = con.getConexion().prepareStatement(sql);
            for (int i = 0; i < param.length; i++) {

                switch (param[i].getClass().toString()) {

                    case "class java.lang.String":
                        ps.setString(i + 1, (String) param[i]);
                        break;
                    case "class java.lang.Integer":
                        ps.setInt(i + 1, (int) param[i]);
                        break;
                    case "class java.lang.Float":
                        ps.setFloat(i + 1, (Float) param[i]);
                        break;
                    default:
                        System.out.println("no se encontro el tipo de dato");
                        break;
                }

            }

            int res = ps.executeUpdate();

            if (res > 0) {
                exito = true;
            }

        } catch (SQLException ex) {
            System.out.println("error " + ex.getLocalizedMessage());

        }
        
        return exito;
    }

   
    public boolean eliminar(String sql, Object param[]) throws SQLException {
        try {
            ps = con.getConexion().prepareStatement(sql);
            for (int i = 0; i < param.length; i++) {
                ps.setInt(i + 1, (int) param[i]);
            }
            int res = ps.executeUpdate();
            if (res > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("error " + ex.getLocalizedMessage());
        }

        return false;
    }

    public boolean editar(String sql, Object param[]) throws SQLException {

        boolean exito = false;
        try {
            ps = con.getConexion().prepareStatement(sql);

            for (int i = 0; i < param.length; i++) {

                switch (param[i].getClass().toString()) {
                    case "class java.lang.String":
                        ps.setString(i + 1, (String) param[i]);

                        break;
                    case "class java.lang.Integer":
                        ps.setInt(i + 1, (int) param[i]);
                        break;
                    case " class java.lang.Float":
                        ps.setFloat(i + 1, (Float) param[i]);
                        break;
                    default:
                        System.out.println("no se encontro el tipo de dato");
                        break;
                }

            }
            int res = ps.executeUpdate();
            if (res > 0) {
                exito = true;
            }

        } catch (SQLException ex) {
            System.out.println("error " + ex.getMessage());
        }

        return exito;
    }

    public ResultSet listar(String sql) throws SQLException {
        try {
            ps = con.getConexion().prepareStatement(sql);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CADO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    public ResultSet listar(String sql,int id) throws SQLException {
        try {
            ps = con.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CADO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

   
}
