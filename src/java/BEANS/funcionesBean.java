/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BEANS;

/**
 *
 * @author jeff
 */
public class funcionesBean {
    private int codFuncion;
    private String nomFuncion;
    private int FK_codCargo;

    public funcionesBean() {
    }

    public funcionesBean(int codFuncion) {
        this.codFuncion = codFuncion;
    }

    public funcionesBean(int codFuncion, String nomFuncion, int FK_codCargo) {
        this.codFuncion = codFuncion;
        this.nomFuncion = nomFuncion;
        this.FK_codCargo = FK_codCargo;
    }

    public int getCodFuncion() {
        return codFuncion;
    }

    public void setCodFuncion(int codFuncion) {
        this.codFuncion = codFuncion;
    }

    public String getNomFuncion() {
        return nomFuncion;
    }

    public void setNomFuncion(String nomFuncion) {
        this.nomFuncion = nomFuncion;
    }

    public int getFK_codCargo() {
        return FK_codCargo;
    }

    public void setFK_codCargo(int FK_codCargo) {
        this.FK_codCargo = FK_codCargo;
    }

    @Override
    public String toString() {
        return "funcionesBean{" + "codFuncion=" + codFuncion + ", nomFuncion=" + nomFuncion + ", FK_codCargo=" + FK_codCargo + '}';
    }
    
}
