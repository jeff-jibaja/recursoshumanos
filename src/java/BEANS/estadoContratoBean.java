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
public class estadoContratoBean {
 
    private int codEstCont;
    private String estadoContrato;

    public estadoContratoBean() {
    }

    public estadoContratoBean(int codEstCont) {
        this.codEstCont = codEstCont;
    }

    public estadoContratoBean(int codEstCont, String estadoContrato) {
        this.codEstCont = codEstCont;
        this.estadoContrato = estadoContrato;
    }

    
    public int getCodEstCont() {
        return codEstCont;
    }

    public void setCodEstCont(int codEstCont) {
        this.codEstCont = codEstCont;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }
    
    
}
