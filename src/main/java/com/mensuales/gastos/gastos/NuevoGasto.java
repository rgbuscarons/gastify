package com.mensuales.gastos.gastos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;


public class NuevoGasto extends ActionBarActivity {

    private Controlador controlador=null;
    private Gasto gasto=null;
    private EditText importe=null;
    private EditText fecha=null;
    private Spinner limites=null;
    private Button guardar=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        controlador = Controlador.getInstance();
        importe = (EditText) findViewById(R.id.importe);
        fecha = (EditText) findViewById(R.id.fecha);
        limites = (Spinner) findViewById(R.id.limites);
        guardar = (Button) findViewById(R.id.button_guardar);
        ini();

        this.guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NuevoGasto.this.importe.getText().toString()!="" && NuevoGasto.this.fecha.getText().toString()!=""){
                    controlador.NewGasto(NuevoGasto.this.importe.getText().toString(),NuevoGasto.this.fecha.getText().toString(),NuevoGasto.this.limites.getSelectedItem().toString());
                    NuevoGasto.this.finish();
                }

            }
        });

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
        fecha.setText(new Date().getDate());
        ArrayList<Limite> limites=controlador.getLimites();
        limites.addAll(limites);

    }
}
