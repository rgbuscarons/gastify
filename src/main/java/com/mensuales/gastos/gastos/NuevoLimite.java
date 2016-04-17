package com.mensuales.gastos.gastos;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class NuevoLimite extends ActionBarActivity {

    private EditText nombre;
    private EditText limit;
    private Button guardar;
    private Controlador controlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuevo_limite);

        this.nombre=(EditText) findViewById(R.id.nombre);
        this.limit=(EditText) findViewById(R.id.limit);
        this.guardar=(Button) findViewById(R.id.button_guardar);
        this.controlador=Controlador.getInstance();

        this.guardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(NuevoLimite.this.nombre.getText().toString()!="" && NuevoLimite.this.limit.getText().toString()!=""){
                    controlador.NewLimite(NuevoLimite.this.nombre.getText().toString(),NuevoLimite.this.limit.getText().toString());
                    NuevoLimite.this.finish();
                }

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nuevo_limite, menu);
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
}
