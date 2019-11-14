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
public class tipoContratoBean {
    private int codTipoCont;
    private String tipoContrato;

    public tipoContratoBean() {
    }

    public tipoContratoBean(int codTipoCont) {
        this.codTipoCont = codTipoCont;
    }

    public tipoContratoBean(int codTipoCont, String tipoContrato) {
        this.codTipoCont = codTipoCont;
        this.tipoContrato = tipoContrato;
    }

    public int getCodTipoCont() {
        return codTipoCont;
    }

    public void setCodTipoCont(int codTipoCont) {
        this.codTipoCont = codTipoCont;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }
    
    
}
