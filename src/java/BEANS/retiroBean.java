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
public class retiroBean {
    private int codRetito;
    private String fechaRetiro;
    private int FK_codContrato;
    private int FK_codMotivo;

    public retiroBean() {
    }

    public retiroBean(int codRetito, String fechaRetiro, int FK_codContrato, int FK_codMotivo) {
        this.codRetito = codRetito;
        this.fechaRetiro = fechaRetiro;
        this.FK_codContrato = FK_codContrato;
        this.FK_codMotivo = FK_codMotivo;
    }

    public int getCodRetito() {
        return codRetito;
    }

    public void setCodRetito(int codRetito) {
        this.codRetito = codRetito;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public int getFK_codContrato() {
        return FK_codContrato;
    }

    public void setFK_codContrato(int FK_codContrato) {
        this.FK_codContrato = FK_codContrato;
    }

    public int getFK_codMotivo() {
        return FK_codMotivo;
    }

    public void setFK_codMotivo(int FK_codMotivo) {
        this.FK_codMotivo = FK_codMotivo;
    }

    @Override
    public String toString() {
        return "retiroBean{" + "codRetito=" + codRetito + ", fechaRetiro=" + fechaRetiro + ", FK_codContrato=" + FK_codContrato + ", FK_codMotivo=" + FK_codMotivo + '}';
    }
    
    
}
