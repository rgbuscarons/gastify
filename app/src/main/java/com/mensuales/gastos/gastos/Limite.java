package com.mensuales.gastos.gastos;

/**
 * Created by Roger on 16/04/2016.
 */
public class Limite {
    private float limite=0;

    public Limite() {
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String toString() {
        return "Limites{" +
                "limite=" + limite +
                '}';
    }
}
