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
public class usuarioBean {
    private int codUusario;
    private String usuario;
    private String contraseña;
    private int FK_codRol;
    private int FK_codPersona;

    public usuarioBean() {
    }

    public usuarioBean(int codUusario, String usuario, String contraseña, int FK_codRol, int FK_codPersona) {
        this.codUusario = codUusario;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.FK_codRol = FK_codRol;
        this.FK_codPersona = FK_codPersona;
    }

    public int getCodUusario() {
        return codUusario;
    }

    public void setCodUusario(int codUusario) {
        this.codUusario = codUusario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getFK_codRol() {
        return FK_codRol;
    }

    public void setFK_codRol(int FK_codRol) {
        this.FK_codRol = FK_codRol;
    }

    public int getFK_codPersona() {
        return FK_codPersona;
    }

    public void setFK_codPersona(int FK_codPersona) {
        this.FK_codPersona = FK_codPersona;
    }

    @Override
    public String toString() {
        return "usuarioBean{" + "codUusario=" + codUusario + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", FK_codRol=" + FK_codRol + ", FK_codPersona=" + FK_codPersona + '}';
    }
    
    
}
