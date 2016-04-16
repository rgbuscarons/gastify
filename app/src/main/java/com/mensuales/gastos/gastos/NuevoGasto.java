package com.mensuales.gastos.gastos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Date;


public class NuevoGasto extends ActionBarActivity {

    private Controlador controlador=null;
    private Gasto gasto=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controlador = new Controlador();
        EditText txtEdit = (EditText) findViewById(R.id.importe);
        ini();
        setContentView(R.layout.activity_nuevo_gasto);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nuevo_gasto, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void ini(){
        EditText nuevoGasto= (EditText)findViewById(R.id.importe);
        nuevoGasto.setText(new Date().getDate());
        gasto = controlador.NewGasto(new Date().getDate());
    }
}
