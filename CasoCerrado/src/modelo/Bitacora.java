package modelo;

public class Bitacora {

    //Atributos de la clase Bitacora
    private Anotacion anotacion;

    public Bitacora(Anotacion anotacion) {
        this.anotacion = anotacion;
    }

    //Getters - Bitacora
    public Anotacion getAnotacion() {
        return anotacion;
    }

    //Setters - Bitacora
    public void setAnotacion(Anotacion anotacion) {
        this.anotacion = anotacion;
    }

    //Metodo toString 
    @Override
    public String toString() {
        return "\n|\n| [Bitacora]\n" + anotacion;
    }

}
