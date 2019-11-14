
package BEANS;

import java.util.Date;


/**
 *
 * @author jeff
 */
public class personaBean {
 
    private int codigo;
    private String  nombre;
    private String apellidoPat;
    private String apellidoMat;
    private String dni;        
    private String telefono;
    private String nacimiento;
    private String sexo;
    private String email;

    public personaBean() {
    }

    public personaBean(int codigo, String nombre, String apellidoPat, String apellidoMat, String dni, String telefono, String nacimiento, String sexo, String email) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellidoPat = apellidoPat;
        this.apellidoMat = apellidoMat;
        this.dni = dni;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.sexo = sexo;
        this.email = email;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
     
}
