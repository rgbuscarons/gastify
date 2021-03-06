package com.mensuales.gastos.gastos;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Roger on 16/04/2016.
 */
public class Controlador {

    private ArrayList<Gasto> Gastos=null;
    private ArrayList<Limite> Limites=null;
    private static Controlador controlador=null;

    private Controlador() {
        // Exists only to defeat instantiation.
        ini();
    }

    public static Controlador getInstance(){
        if(controlador == null) {
            controlador = new Controlador();
        }
        return controlador;
    }

    private void ini(){
        Gastos=new ArrayList<Gasto>();
        Limites=new ArrayList<Limite>();
    }


    public void NewGasto(String numero,String fecha, String nombre){
        Gasto gasto = new Gasto();
        gasto.setFechaGasto(fecha);
        gasto.setImporteGasto(Float.valueOf(numero));
        gasto.setNombre(nombre);
        Gastos.add(gasto);
    }

    public void NewLimite(String nombre, String limit){
        Limite limite = new Limite();
        limite.setNombre(nombre);
        limite.setLimite(Float.valueOf(limit));
        Limites.add(limite);
    }

    public ArrayList<Gasto> getGastos() {
        return Gastos;
    }

    public void setGastos(ArrayList<Gasto> gastos) {
        Gastos = gastos;
    }

    public ArrayList<Limite> getLimites() {
        return Limites;
    }

    public void setLimites(ArrayList<Limite> limites) {
        Limites = limites;
    }
}
