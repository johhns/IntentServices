package com.developer.johhns.intentservices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText   entrada ;
    public  static TextView   salida  ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrada = findViewById( R.id.entrada ) ;
        salida  = findViewById( R.id.salida )  ;

        Button btnCalcular = findViewById( R.id.btnCalcular ) ;
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double numero   = Double.parseDouble( entrada.getText().toString() ) ;
                salida.setText( numero + " ^ 2 = " );
                Intent servicio = new Intent( view.getContext() , ServicioOperacion.class ) ;
                servicio.putExtra("numero", numero ) ;
                startService( servicio ) ;
            }
        });

    }
}