package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView imageResultado;
    private Button buttonVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        //Retornando Cara ou Coroa
        if( numero == 0){
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }
        else{
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        //Voltando Para o Activity anterior:

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });


    }
}
