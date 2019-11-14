/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.establecimientoBean;
import BEANS.licenciaBean;
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
public class licenciaImp implements crudInterface{

    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO licencia(fechaInicio,fechaFin,documento,codTipoLic,codContrato,observacion) values (?,?,?,?,?,?)";
    private final String sqlistado = "SELECT * FROM licencia where codLicencia = ?";
    private final String sqlistadoCompleto = "SELECT * FROM licencia ";
    private final String sqlDelete = "DELETE from licencia WHERE codLicencia = ?";
    private final String sqlUpdate = "UPDATE  licencia SET fechaInicio = ?,"
                                                    + " fechaFin = ?"
                                                    + ",documento = ?,"
                                                    + "codTipoLic = ?,"
                                                    + "codContrato = ?,"
                                                    + "observacion = ?"
                                                    + "where codLicencia = ?";

    PreparedStatement ps;
    ResultSet rs;

    @Override
    public boolean insert(Object[] obj) {
        try {
            Object[] param = new Object[6];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
            param[4] = obj[4];
            param[5] = obj[5];
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
            Object[] param = new Object[7];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[6] = obj[3];
            param[4] = obj[4];
            param[5] = obj[5];
            param[6] = obj[6];
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
            licenciaBean lic;
            rs = cd.listar(sqlistado, id);

            while (rs.next()) {
                lic = new licenciaBean();
                lic.setCodLicencia(rs.getInt(1));
                lic.setFechaInicio(rs.getString(2));
                lic.setFechaFin(rs.getString(3));
                lic.setDocumento(rs.getString(4));
                lic.setFK_codTipoLic(rs.getInt(5));
                lic.setFK_codContrato(rs.getInt(6));
                lic.setObservacion(rs.getString(7));
                lista.add(lic);
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
            licenciaBean lic;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                lic = new licenciaBean();
                lic.setCodLicencia(rs.getInt(1));
                lic.setFechaInicio(rs.getString(2));
                lic.setFechaFin(rs.getString(3));
                lic.setDocumento(rs.getString(4));
                lic.setFK_codTipoLic(rs.getInt(5));
                lic.setFK_codContrato(rs.getInt(6));
                lic.setObservacion(rs.getString(7));
                lista.add(lic);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

}
