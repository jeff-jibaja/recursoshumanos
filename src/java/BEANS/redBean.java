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
public class redBean {
    private int codRed;
    private String nomRed;

    public redBean() {
    }

    public redBean(int codRed) {
        this.codRed = codRed;
    }

    public redBean(int codRed, String nomRed) {
        this.codRed = codRed;
        this.nomRed = nomRed;
    }

    public int getCodRed() {
        return codRed;
    }

    public void setCodRed(int codRed) {
        this.codRed = codRed;
    }

    public String getNomRed() {
        return nomRed;
    }

    public void setNomRed(String nomRed) {
        this.nomRed = nomRed;
    }

    @Override
    public String toString() {
        return "redBean{" + "codRed=" + codRed + ", nomRed=" + nomRed + '}';
    }
    
    
}
