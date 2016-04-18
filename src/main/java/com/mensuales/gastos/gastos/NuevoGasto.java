package com.mensuales.gastos.gastos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Date;


public class NuevoGasto extends ActionBarActivity {

    private Controlador controlador=null;
    private Gasto gasto;
    private EditText importe;
    private EditText fecha;
    private Spinner limites=null;
    private Button guardar=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_gasto);
        this.controlador = Controlador.getInstance();
        this.importe = (EditText) findViewById(R.id.nuevo_importe);
        this.fecha = (EditText) findViewById(R.id.nueva_fecha);
        this.limites = (Spinner) findViewById(R.id.limites);
        this.guardar = (Button) findViewById(R.id.button_guardar);
        ini();

        this.guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NuevoGasto.this.importe.getText()!=null && NuevoGasto.this.fecha.getText()!=null){
                    String impo=NuevoGasto.this.importe.getText().toString();
                    String fecha=NuevoGasto.this.fecha.getText().toString();
                    String cuenta=NuevoGasto.this.limites.getSelectedItem().toString();
                    controlador.NewGasto(impo,fecha,cuenta);
                    NuevoGasto.this.finish();
                }

            }
        });
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
        this.fecha.setText(new Date().toString());
        ArrayList<String> lista=new ArrayList<>();
        for(Limite limi: controlador.getLimites()){
            lista.add(limi.getNombre().toString());
        }
        ArrayAdapter<String> adp= new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,lista);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.limites.setAdapter(adp);

    }
}
