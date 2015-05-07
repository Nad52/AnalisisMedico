/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.ug.analisis;

/**
 *
 * @author bruja1
 */
public class Dieta {
    private int idDieta;
    public int numeroDieta;
    public String fechaInicio;
    public String fechaFin;

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }

    public int getNumeroDieta() {
        return numeroDieta;
    }

    public void setNumeroDieta(int numeroDieta) {
        this.numeroDieta = numeroDieta;
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

    @Override
    public String toString() {
        return "Dieta{" + "idDieta=" + idDieta + ", numeroDieta=" + numeroDieta + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + '}';
    }

}
