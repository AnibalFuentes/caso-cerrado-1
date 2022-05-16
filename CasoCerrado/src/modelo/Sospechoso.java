package modelo;

public class Sospechoso {

    //Atributos de la clase Sospechoso
    private String noIdentificacion;
    private String nombre;
    private String alias;
    private UltimaDireccion ultimaDireccion;

    //Contructor
    public Sospechoso(String noIdentificacion, String nombre, String alias, UltimaDireccion ultimaDireccion) {
        this.noIdentificacion = noIdentificacion;
        this.nombre = nombre;
        this.alias = alias;
        this.ultimaDireccion = ultimaDireccion;
    }

    //Getters - Sospechoso
    public String getNoIdentificacion() {
        return this.noIdentificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public UltimaDireccion getUltimaDireccion() {
        return this.ultimaDireccion;
    }

    //Setters - Sospechoso
    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setUltimaDireccion(UltimaDireccion ultimaDireccion) {
        this.ultimaDireccion = ultimaDireccion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "|\n|\n| [Sospechoso: " + nombre + "]"
                + "\n| N° identificacion:     " + noIdentificacion
                + "\n| Alias:                 " + alias
                + ultimaDireccion;
    }

}
