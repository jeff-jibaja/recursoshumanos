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
public class rolBean {
    private int codRol;
    private String nomRol;

    public rolBean() {
    }

    public rolBean(int codRol, String nomRol) {
        this.codRol = codRol;
        this.nomRol = nomRol;
    }

    public int getCodRol() {
        return codRol;
    }

    public void setCodRol(int codRol) {
        this.codRol = codRol;
    }

    public String getNomRol() {
        return nomRol;
    }

    public void setNomRol(String nomRol) {
        this.nomRol = nomRol;
    }

    @Override
    public String toString() {
        return "rolBean{" + "codRol=" + codRol + ", nomRol=" + nomRol + '}';
    }
    
    
}
