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
public class motivoSuspensionBean {
    private int codMotivoSus;
    private String nombreSus;

    public motivoSuspensionBean() {
    }

    public motivoSuspensionBean(int codMotivoSus) {
        this.codMotivoSus = codMotivoSus;
    }

    public motivoSuspensionBean(int codMotivoSus, String nombreSus) {
        this.codMotivoSus = codMotivoSus;
        this.nombreSus = nombreSus;
    }

    public int getCodMotivoSus() {
        return codMotivoSus;
    }

    public void setCodMotivoSus(int codMotivoSus) {
        this.codMotivoSus = codMotivoSus;
    }

    public String getNombreSus() {
        return nombreSus;
    }

    public void setNombreSus(String nombreSus) {
        this.nombreSus = nombreSus;
    }

    @Override
    public String toString() {
        return "motivoSuspensionBean{" + "codMotivoSus=" + codMotivoSus + ", nombreSus=" + nombreSus + '}';
    }
    
    
}
