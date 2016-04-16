package com.mensuales.gastos.gastos;

/**
 * Created by Roger on 16/04/2016.
 */
public class Limite {
    private float limite=0;
    private String nombre="";

    public Limite() {
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Limite{" +
                "limite=" + limite +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
