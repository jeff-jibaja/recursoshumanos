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
public class suspensionBean {
    private int codSuspension;
    private String inicioSuspension;
    private String feinSuspension;
    private int FK_codContrato;
    private int FK_codMotivo;

    public suspensionBean() {
    }

    public suspensionBean(int codSuspension, String inicioSuspension, String feinSuspension, int FK_codContrato, int FK_codMotivo) {
        this.codSuspension = codSuspension;
        this.inicioSuspension = inicioSuspension;
        this.feinSuspension = feinSuspension;
        this.FK_codContrato = FK_codContrato;
        this.FK_codMotivo = FK_codMotivo;
    }

    public int getCodSuspension() {
        return codSuspension;
    }

    public void setCodSuspension(int codSuspension) {
        this.codSuspension = codSuspension;
    }

    public String getInicioSuspension() {
        return inicioSuspension;
    }

    public void setInicioSuspension(String inicioSuspension) {
        this.inicioSuspension = inicioSuspension;
    }

    public String getFeinSuspension() {
        return feinSuspension;
    }

    public void setFeinSuspension(String feinSuspension) {
        this.feinSuspension = feinSuspension;
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
        return "suspensionBean{" + "codSuspension=" + codSuspension + ", inicioSuspension=" + inicioSuspension + ", feinSuspension=" + feinSuspension + ", FK_codContrato=" + FK_codContrato + ", FK_codMotivo=" + FK_codMotivo + '}';
    }
    
    
}
