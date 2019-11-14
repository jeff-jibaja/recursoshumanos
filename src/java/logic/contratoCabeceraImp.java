/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import BEANS.contratoCabeceraBean;
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
public class contratoCabeceraImp implements crudInterface{
    
     
    CADO cd = new CADO();

    private final String sqlinsert = "INSERT INTO contratoCabecera(nivel,fechaInicio,fechaFin,memoGeresa,persona,estadoCont,profesion,cargo,tipoCont) values (?,?,?,?,?,?,?,?,?)";
    private final String sqlistado = "SELECT * FROM contratoCabecera where codContrato = ?";
    private final String sqlistadoCompleto = "SELECT * FROM contratoCabecera ";
    private final String sqlDelete = "DELETE from contratoCabecera WHERE codContrato = ?";
    private final String sqlUpdate = "UPDATE  contratoCabecera SET nivel = ? ,"
                                                            + "fechaInicio = ? ,"
                                                            + "fechaFin = ?,"
                                                            + "memoGeresa = ?,"
                                                            + "persona = ?,"
                                                            + "estadoCont = ?,"
                                                            + "profesion = ?,"
                                                            + "cargo = ?,"
                                                            + "tipoCont = ?,"
                                                            + " where codContrato = ?";

    PreparedStatement ps;
    ResultSet rs;

  


    @Override
    public boolean insert(Object[] obj) {
        try {
            Object[] param = new Object[9];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
            param[4] = obj[4];
            param[5] = obj[5];
            param[6] = obj[6];
            param[7] = obj[7];
            param[8] = obj[8];
            
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
             Object[] param = new Object[10];
            param[0] = obj[0];
            param[1] = obj[1];
            param[2] = obj[2];
            param[3] = obj[3];
            param[4] = obj[4];
            param[5] = obj[5];
            param[6] = obj[6];
            param[7] = obj[7];
            param[8] = obj[8];
            param[9] = obj[9];
            
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
            contratoCabeceraBean contCab;
            rs = cd.listar(sqlistado,id);

            while (rs.next()) {
                contCab = new contratoCabeceraBean();
                contCab.setCodContratoCab(rs.getInt(1));
                contCab.setNivel(rs.getString(2));
                contCab.setFechaInicio(rs.getString(3));
                contCab.setFechaFin(rs.getString(4));
                contCab.setMemoGeresa(rs.getString(5));
                contCab.setFK_codPersona(rs.getInt(6));
                contCab.setFK_codEstadoCont(rs.getInt(7));
                contCab.setFK_codProf(rs.getInt(8));
                contCab.setFK_codCargo(rs.getInt(9));
                contCab.setFK_codTipoCont(rs.getInt(10));
                lista.add(contCab);
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
             contratoCabeceraBean contCab;
            rs = cd.listar(sqlistadoCompleto);

            while (rs.next()) {
                contCab = new contratoCabeceraBean();
                contCab.setCodContratoCab(rs.getInt(1));
                contCab.setNivel(rs.getString(2));
                contCab.setFechaInicio(rs.getString(3));
                contCab.setFechaFin(rs.getString(4));
                contCab.setMemoGeresa(rs.getString(5));
                contCab.setFK_codPersona(rs.getInt(6));
                contCab.setFK_codEstadoCont(rs.getInt(7));
                contCab.setFK_codProf(rs.getInt(8));
                contCab.setFK_codCargo(rs.getInt(9));
                contCab.setFK_codTipoCont(rs.getInt(10));
                lista.add(contCab);
            }

        } catch (SQLException ex) {
            Logger.getLogger(profesionImp.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lista;
    }

    
}
