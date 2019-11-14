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
public class tipoLicenciaBean {
    private int codTipoLic;
    private String nomTipoLic;

    public tipoLicenciaBean() {
    }

    public tipoLicenciaBean(int codTipoLic, String nomTipoLic) {
        this.codTipoLic = codTipoLic;
        this.nomTipoLic = nomTipoLic;
    }

    public tipoLicenciaBean(int codTipoLic) {
        this.codTipoLic = codTipoLic;
    }

    public int getCodTipoLic() {
        return codTipoLic;
    }

    public void setCodTipoLic(int codTipoLic) {
        this.codTipoLic = codTipoLic;
    }

    public String getNomTipoLic() {
        return nomTipoLic;
    }

    public void setNomTipoLic(String nomTipoLic) {
        this.nomTipoLic = nomTipoLic;
    }

    @Override
    public String toString() {
        return "tipoLicenciaBean{" + "codTipoLic=" + codTipoLic + ", nomTipoLic=" + nomTipoLic + '}';
    }
    
    
}
