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
public class Fecha {
    private int idFecha;
    public String fechaAnalisis;
    public String fehcaImpres;

    public int getIdFecha() {
        return idFecha;
    }

    public void setIdFecha(int idFecha) {
        this.idFecha = idFecha;
    }

    public String getFechaAnalisis() {
        return fechaAnalisis;
    }

    public void setFechaAnalisis(String fechaAnalisis) {
        this.fechaAnalisis = fechaAnalisis;
    }

    public String getFehcaImpres() {
        return fehcaImpres;
    }

    public void setFehcaImpres(String fehcaImpres) {
        this.fehcaImpres = fehcaImpres;
    }

    @Override
    public String toString() {
        return "Fecha{" + "idFecha=" + idFecha + ", fechaAnalisis=" + fechaAnalisis + ", fehcaImpres=" + fehcaImpres + '}';
    }
    
}
