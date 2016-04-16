package com.mensuales.gastos.gastos;

import java.util.Date;

/**
 * Created by Roger on 16/04/2016.
 */
public class Gasto {

    private int fechaGasto=0;
    private float importeGasto=0;
    private String nombre=null;

    public Gasto(){}

    public int getFechaGasto() {
        return fechaGasto;
    }

    public void setFechaGasto(int fechaGasto) {
        this.fechaGasto = fechaGasto;
    }

    public float getImporteGasto() {
        return importeGasto;
    }

    public void setImporteGasto(float importeGasto) {
        this.importeGasto = importeGasto;
    }

    @Override
    public String toString() {
        return "Gasto{" +
                "fechaGasto=" + fechaGasto +
                ", importeGasto=" + importeGasto +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
