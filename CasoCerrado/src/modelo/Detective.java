package modelo;

public class Detective {

    //Atributos de la clase Detective
    private String noIdentificacion;
    private String nombre;
    private String apellido;
    private int añosExperiencia;
    private String tipoCaso;

    public Detective(String noIdentificacion, String nombre, String apellido, int añosExperiencia, String tipoCaso) {
        this.noIdentificacion = noIdentificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.añosExperiencia = añosExperiencia;
        this.tipoCaso = tipoCaso;
    }

    //Setters - Detective
    public void setNoIdentificacion(String noIdentificacion) {
        this.noIdentificacion = noIdentificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public void setTipoCaso(String tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    //Getters - Detective
    public String getNoIdentificacion() {
        return this.noIdentificacion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public int getAñosExperiencia() {
        return this.añosExperiencia;
    }

    public String getTipoCaso() {
        return this.tipoCaso;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "|\n| [Detective: " + nombre + " " + apellido + "]\n"
                + "| Identificacion:        " + noIdentificacion
                + "\n| A\u00f1os de experiencia:   " + añosExperiencia + " Años"
                + "\n| Tipo de caso:          " + tipoCaso;
    }
}
