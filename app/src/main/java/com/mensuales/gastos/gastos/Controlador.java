package com.mensuales.gastos.gastos;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Roger on 16/04/2016.
 */
public class Controlador {

    private ArrayList<Gasto> Gastos=null;
    private ArrayList<Limite> Limites=null;


    public Controlador(){
        ini();
    }

    private void ini(){
        Gastos=new ArrayList<Gasto>();
        Limites=new ArrayList<Limite>();
    }


    public Gasto NewGasto(int fecha){
        Gasto gasto = new Gasto();
        gasto.setFechaGasto(fecha);
        gasto.setImporteGasto(0);
        Gastos.add(gasto);
        return gasto;
    }

    public void NewLimite(){
        Limite limite = new Limite();
        limite.setLimite(0);
    }
}
