package com.example.practica6_imagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //metodo para la funcion del boton 1
    public void MensajeGoldenDream (View view){
        Toast.makeText(this, "The golden Dream", Toast.LENGTH_SHORT).show();
    }
    //metodo para la funcion del boton 2
    public void MensajeMano (View view){
        Toast.makeText(this, "Heeeeee Profeeeee...", Toast.LENGTH_SHORT).show();
    }


}
