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
public class contratoCabeceraBean {

    private int codContratoCab;
    private String nivel;
    private String fechaInicio;
    private String fechaFin;
    private String memoGeresa;
    private int FK_codPersona;
    private int FK_codEstadoCont;
    private int FK_codProf;
    private int FK_codCargo;
    private int FK_codTipoCont;

    public contratoCabeceraBean() {
    }

    public contratoCabeceraBean(int codContratoCab, String nivel, String fechaInicio, String fechaFin, String memoGeresa, int FK_codPersona, int FK_codEstadoCont, int FK_codProf, int FK_codCargo, int FK_codTipoCont) {
        this.codContratoCab = codContratoCab;
        this.nivel = nivel;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.memoGeresa = memoGeresa;
        this.FK_codPersona = FK_codPersona;
        this.FK_codEstadoCont = FK_codEstadoCont;
        this.FK_codProf = FK_codProf;
        this.FK_codCargo = FK_codCargo;
        this.FK_codTipoCont = FK_codTipoCont;
    }

    public int getCodContratoCab() {
        return codContratoCab;
    }

    public void setCodContratoCab(int codContratoCab) {
        this.codContratoCab = codContratoCab;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getMemoGeresa() {
        return memoGeresa;
    }

    public void setMemoGeresa(String memoGeresa) {
        this.memoGeresa = memoGeresa;
    }

    public int getFK_codPersona() {
        return FK_codPersona;
    }

    public void setFK_codPersona(int FK_codPersona) {
        this.FK_codPersona = FK_codPersona;
    }

    public int getFK_codEstadoCont() {
        return FK_codEstadoCont;
    }

    public void setFK_codEstadoCont(int FK_codEstadoCont) {
        this.FK_codEstadoCont = FK_codEstadoCont;
    }

    public int getFK_codProf() {
        return FK_codProf;
    }

    public void setFK_codProf(int FK_codProf) {
        this.FK_codProf = FK_codProf;
    }

    public int getFK_codCargo() {
        return FK_codCargo;
    }

    public void setFK_codCargo(int FK_codCargo) {
        this.FK_codCargo = FK_codCargo;
    }

    public int getFK_codTipoCont() {
        return FK_codTipoCont;
    }

    public void setFK_codTipoCont(int FK_codTipoCont) {
        this.FK_codTipoCont = FK_codTipoCont;
    }

    @Override
    public String toString() {
        return "contratoCabeceraBean{" + "codContratoCab=" + codContratoCab + ", nivel=" + nivel + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", memoGeresa=" + memoGeresa + ", FK_codPersona=" + FK_codPersona + ", FK_codEstadoCont=" + FK_codEstadoCont + ", FK_codProf=" + FK_codProf + ", FK_codCargo=" + FK_codCargo + ", FK_codTipoCont=" + FK_codTipoCont + '}';
    }

    
}
