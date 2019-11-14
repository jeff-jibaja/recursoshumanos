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
public class accesosBean {
    private int codAcceso;
    private String nomVista;
    private int FK_codRol;

    public accesosBean() {
    }

    public accesosBean(int codAcceso, String nomVista, int FK_codRol) {
        this.codAcceso = codAcceso;
        this.nomVista = nomVista;
        this.FK_codRol = FK_codRol;
    }

    public int getCodAcceso() {
        return codAcceso;
    }

    public void setCodAcceso(int codAcceso) {
        this.codAcceso = codAcceso;
    }

    public String getNomVista() {
        return nomVista;
    }

    public void setNomVista(String nomVista) {
        this.nomVista = nomVista;
    }

    public int getFK_codRol() {
        return FK_codRol;
    }

    public void setFK_codRol(int FK_codRol) {
        this.FK_codRol = FK_codRol;
    }

    @Override
    public String toString() {
        return "accesosBean{" + "codAcceso=" + codAcceso + ", nomVista=" + nomVista + ", FK_codRol=" + FK_codRol + '}';
    }
    
    
}
