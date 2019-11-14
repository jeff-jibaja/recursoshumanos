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
public class licenciaBean {

    private int codLicencia;
    private String fechaInicio;
    private String fechaFin;
    private String Documento;
    private int FK_codTipoLic;
    private int FK_codContrato;
    private String observacion;

    public licenciaBean() {
    }

    public licenciaBean(int codLicencia, String fechaInicio, String fechaFin, String Documento, int FK_codTipoLic, int FK_codContrato, String observacion) {
        this.codLicencia = codLicencia;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.Documento = Documento;
        this.FK_codTipoLic = FK_codTipoLic;
        this.FK_codContrato = FK_codContrato;
        this.observacion = observacion;
    }

    public int getCodLicencia() {
        return codLicencia;
    }

    public void setCodLicencia(int codLicencia) {
        this.codLicencia = codLicencia;
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

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public int getFK_codTipoLic() {
        return FK_codTipoLic;
    }

    public void setFK_codTipoLic(int FK_codTipoLic) {
        this.FK_codTipoLic = FK_codTipoLic;
    }

    public int getFK_codContrato() {
        return FK_codContrato;
    }

    public void setFK_codContrato(int FK_codContrato) {
        this.FK_codContrato = FK_codContrato;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return "licenciaBean{" + "codLicencia=" + codLicencia + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", Documento=" + Documento + ", FK_codTipoLic=" + FK_codTipoLic + ", FK_codContrato=" + FK_codContrato + ", observacion=" + observacion + '}';
    }

}
