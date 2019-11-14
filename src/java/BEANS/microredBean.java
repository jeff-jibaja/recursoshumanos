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
public class microredBean {
    private int codMicro;
    private String nomMicro;
    private int FK_codRed;

    public microredBean() {
    }

    public microredBean(int codMicro, String nomMicro, int FK_codRed) {
        this.codMicro = codMicro;
        this.nomMicro = nomMicro;
        this.FK_codRed = FK_codRed;
    }

    public microredBean(int codMicro) {
        this.codMicro = codMicro;
    }

    public int getCodMicro() {
        return codMicro;
    }

    public void setCodMicro(int codMicro) {
        this.codMicro = codMicro;
    }

    public String getNomMicro() {
        return nomMicro;
    }

    public void setNomMicro(String nomMicro) {
        this.nomMicro = nomMicro;
    }

    public int getFK_codRed() {
        return FK_codRed;
    }

    public void setFK_codRed(int FK_codRed) {
        this.FK_codRed = FK_codRed;
    }

    @Override
    public String toString() {
        return "microredBean{" + "codMicro=" + codMicro + ", nomMicro=" + nomMicro + ", FK_codRed=" + FK_codRed + '}';
    }
    
    
}
