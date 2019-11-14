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
public class cargoBean {
    private int codCargo;
    private String cargo;

    public cargoBean() {
    }

    
    public cargoBean(byte codCargo) {
        this.codCargo = codCargo;
    }

    public cargoBean(byte codCargo, String cargo) {
        this.codCargo = codCargo;
        this.cargo = cargo;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "cargo{" + "codCargo=" + codCargo + ", cargo=" + cargo + '}';
    }
    
    
    
}
