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
public class motivoRetiroBean {
    private int codigoMotivo;
    private String nomMotivo;

    public motivoRetiroBean() {
    }

    public motivoRetiroBean(int codigoMotivo) {
        this.codigoMotivo = codigoMotivo;
    }

    
    public motivoRetiroBean(int codigoMotivo, String nomMotivo) {
        this.codigoMotivo = codigoMotivo;
        this.nomMotivo = nomMotivo;
    }

    public int getCodigoMotivo() {
        return codigoMotivo;
    }

    public void setCodigoMotivo(int codigoMotivo) {
        this.codigoMotivo = codigoMotivo;
    }

    public String getNomMotivo() {
        return nomMotivo;
    }

    public void setNomMotivo(String nomMotivo) {
        this.nomMotivo = nomMotivo;
    }

    @Override
    public String toString() {
        return "motivoRetiroBean{" + "codigoMotivo=" + codigoMotivo + ", nomMotivo=" + nomMotivo + '}';
    }
    
    
    
}
