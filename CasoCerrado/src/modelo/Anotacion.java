package modelo;

import java.util.Date;

public class Anotacion {
    //Atributos de la clase Anotación
    private Date fechaRegistro;
    private String observacion;
    
    //Constructor
    public Anotacion(Date fechaRegistro, String observacion) {
        this.fechaRegistro = fechaRegistro;
        this.observacion = observacion;
    }
    
    //Getters - Anotacion
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public String getObservacion() {
        return this.observacion;
    }
    
    //Setters - Anotacion
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "| Fecha de registro:     " + fechaRegistro + "\n| Observacion:           " + observacion;
    }
}
