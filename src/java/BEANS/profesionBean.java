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
public class profesionBean {
    private String nomProfesion;
    private int codigo;

    public profesionBean() {
    }

    public profesionBean(int codigo) {
        this.codigo = codigo;
    }

    public profesionBean(String nomProfesion, int codigo) {
        this.nomProfesion = nomProfesion;
        this.codigo = codigo;
    }

    public String getNomProfesion() {
        return nomProfesion;
    }

    public void setNomProfesion(String nomProfesion) {
        this.nomProfesion = nomProfesion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "profesion{" + "nomProfesion=" + nomProfesion + ", codigo=" + codigo + '}';
    }
    
    
    
}
