package model;

public class Requerimiento_5 {
    private String constructora;
    private Integer salarioLider;


    public Requerimiento_5(){

    }

    public Requerimiento_5(String constructora, Integer salarioLider) {
        this.constructora = constructora;
        this.salarioLider = salarioLider;
    }

    public String getConstructora() {
        return constructora;
    }

    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public Integer getSalarioLider() {
        return salarioLider;
    }

    public void setSalarioLider(Integer salarioLider) {
        this.salarioLider = salarioLider;
    }
}
