package com.example.galeria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imagen;
    private int orden = 1;
    private Button adelante;
    private Button atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.principal);
        configView();
    }
    private void configView(){
        imagen = findViewById(R.id.foto);
        adelante = findViewById(R.id.btAdelante);
        atras = findViewById(R.id.btAtras);
        adelante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (orden){
                    case 1: {imagen.setImageResource(R.drawable.img2);
                        orden++;
                        break;}
                    case 2: {imagen.setImageResource(R.drawable.img3);
                        orden++;
                        break;}
                    case 3: {imagen.setImageResource(R.drawable.img3);
                        orden = 3;
                        break;}

                }
            }
        });
        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (orden){
                    case 1: {imagen.setImageResource(R.drawable.img1);
                        orden = 1;
                        break;}
                    case 2: {imagen.setImageResource(R.drawable.img1);
                        orden--;
                        break;}
                    case 3: {imagen.setImageResource(R.drawable.img2);
                        orden--;
                        break;}

                }
            }
        });
    }

}
