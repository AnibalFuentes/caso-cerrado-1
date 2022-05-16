package modelo;

public class UltimaDireccion {

    //Atributos de la clase UltimaDireccion 
    private String noVivienda;
    private String localidad;
    private String ciudad;
    private String departamento;
    private String pais;
    private boolean fotografia;
    private String descripcion;

    //Contructor
    public UltimaDireccion(String noVivienda, String localidad, String ciudad, String departamento, String pais, boolean fotografia, String descripcion) {
        this.noVivienda = noVivienda;
        this.localidad = localidad;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
        this.fotografia = fotografia;
        this.descripcion = descripcion;
    }

    //Getters - UltimaDireccion 
    public String getNoVivienda() {
        return this.noVivienda;
    }

    public String getLocalidad() {
        return this.localidad;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public String getPais() {
        return this.pais;
    }

    public boolean isFotografia() {
        return this.fotografia;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    //Setters - UltimaDireccion 
    public void setNoVivienda(String noVivienda) {
        this.noVivienda = noVivienda;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setFotografia(boolean fotografia) {
        this.fotografia = fotografia;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "|\n|\n| [Ultima direccion]"
                + "\n| N° vivienda:           " + noVivienda
                + "\n| Localidad:             " + localidad
                + "\n| Ciudad:                " + ciudad
                + "\n| Departamento:          " + departamento
                + "\n| Pais:                  " + pais
                + "\n| Fotografia:            " + fotografia
                + "\n| Descripcion:           " + descripcion;
    }

}
