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
public class contratoDetalleBean {
    
    
    private int codContratoDet;
    private String estado;
    private int FK_codContrato ;
    private int FK_codestab;

    public contratoDetalleBean() {
    }

    public contratoDetalleBean(int codContratoDet, String estado, int FK_codContrato, int FK_codestab) {
        this.codContratoDet = codContratoDet;
        this.estado = estado;
        this.FK_codContrato = FK_codContrato;
        this.FK_codestab = FK_codestab;
    }

    public int getCodContratoDet() {
        return codContratoDet;
    }

    public void setCodContratoDet(int codContratoDet) {
        this.codContratoDet = codContratoDet;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getFK_codContrato() {
        return FK_codContrato;
    }

    public void setFK_codContrato(int FK_codContrato) {
        this.FK_codContrato = FK_codContrato;
    }

    public int getFK_codestab() {
        return FK_codestab;
    }

    public void setFK_codestab(int FK_codestab) {
        this.FK_codestab = FK_codestab;
    }

    @Override
    public String toString() {
        return "contratoDetalleBean{" + "codContratoDet=" + codContratoDet + ", estado=" + estado + ", FK_codContrato=" + FK_codContrato + ", FK_codestab=" + FK_codestab + '}';
    }
    
    
    
}
