package modelo;

public class Caso {

    //Contador de casos
    private static int contCaso;

    public static int getContCaso() {
        return contCaso;
    }

    public static void setContCaso(int aContCaso) {
        contCaso = aContCaso;
    }

    //Atributos de la clase Caso
    private final int idCaso;
    private String nomClave;
    private String descripcionCaso;
    private String prioridad;
    private Detective detective;
    private Bitacora bitacora;
    private Sospechoso sospechoso;

    //Contador (El id del caso empieza desde el #10000 y se va incrementando)
    public Caso() {
        int id = this.idCaso = 10000 + ++Caso.contCaso;
    }

    public Caso(String nomClave, String descripcionCaso, String prioridad, Detective detective, Bitacora bitacora, Sospechoso sospechoso) {
        this();
        this.nomClave = nomClave;
        this.descripcionCaso = descripcionCaso;
        this.prioridad = prioridad;
        this.detective = detective;
        this.bitacora = bitacora;
        this.sospechoso = sospechoso;
    }

    //Getters
    public int getIdCaso() {
        return this.idCaso;
    }

    public String getNomClave() {
        return this.nomClave;
    }

    public String getDescripcionCaso() {
        return this.descripcionCaso;
    }

    public String getPrioridad() {
        return this.prioridad;
    }

    public Detective getDetective() {
        return this.detective;
    }

    public Bitacora getBitacora() {
        return bitacora;
    }

    public Sospechoso getSospechoso() {
        return sospechoso;
    }

    //Setters
    public void setNomClave(String nomClave) {
        this.nomClave = nomClave;
    }

    public void setDescripcionCaso(String descripcionCaso) {
        this.descripcionCaso = descripcionCaso;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public void setBitacora(Bitacora bitacora) {
        this.bitacora = bitacora;
    }

    public void setSospechoso(Sospechoso sospechoso) {
        this.sospechoso = sospechoso;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "|------------------------------------------------------------------|"
                + "\n| [Caso " + "Id: " + idCaso
                + "]\n| Nombre clave:          " + nomClave
                + "\n| Descripcion del caso:  " + descripcionCaso
                + "\n| Prioridad:             " + prioridad
                + "\n" + detective + bitacora + sospechoso + "\n"
                + "|------------------------------------------------------------------|\n";
    }

}
