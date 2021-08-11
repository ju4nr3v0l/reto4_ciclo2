package model;

public class Requerimiento_2 {
    private String fechaInicio;
    private String nombreCiudad;
    private String constructora;
    private String lider;
    private Integer tipo;
    private Integer estrato;

    public Requerimiento_2(){

    }

    public Requerimiento_2(String fechaInicio, String nombreCiudad, String constructora, String lider, Integer tipo, Integer estrato) {
        this.fechaInicio = fechaInicio;
        this.nombreCiudad = nombreCiudad;
        this.constructora = constructora;
        this.lider = lider;
        this.tipo = tipo;
        this.estrato = estrato;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Integer getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }
}
