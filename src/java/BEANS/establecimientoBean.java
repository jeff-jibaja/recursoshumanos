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
public class establecimientoBean {
 
    private int codEst;
    private String nomEst;
    private int FK_codMicro;

    public establecimientoBean() {
    }

    public establecimientoBean(int codEst) {
        this.codEst = codEst;
    }

    public establecimientoBean(int codEst, String nomEst, int FK_codMicro) {
        this.codEst = codEst;
        this.nomEst = nomEst;
        this.FK_codMicro = FK_codMicro;
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public String getNomEst() {
        return nomEst;
    }

    public void setNomEst(String nomEst) {
        this.nomEst = nomEst;
    }

    public int getFK_codMicro() {
        return FK_codMicro;
    }

    public void setFK_codMicro(int FK_codMicro) {
        this.FK_codMicro = FK_codMicro;
    }

    @Override
    public String toString() {
        return "establecimientoBean{" + "codEst=" + codEst + ", nomEst=" + nomEst + ", FK_codMicro=" + FK_codMicro + '}';
    }
    
    
}
