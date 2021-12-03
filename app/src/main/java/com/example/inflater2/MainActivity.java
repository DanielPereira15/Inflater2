package com.example.inflater2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btAnadir;
    LayoutInflater liFila;
    LinearLayout llFilas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btAnadir=findViewById(R.id.btAnadir);
        liFila=(LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        llFilas=findViewById(R.id.llFilas);

        btAnadir.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            LinearLayout rlElemento= (LinearLayout) liFila.inflate(R.layout.item_fila,null);
            Button bt0=rlElemento.findViewById(R.id.bt0);
            Button bt1=rlElemento.findViewById(R.id.bt1);
            Button bt2=rlElemento.findViewById(R.id.bt2);
            Button bt3=rlElemento.findViewById(R.id.bt3);
            Button bt4=rlElemento.findViewById(R.id.bt4);

            Random r= new Random();
            bt0.setText(""+r.nextInt(5));
            bt1.setText(""+r.nextInt(5));
            bt2.setText(""+r.nextInt(5));
            bt3.setText(""+r.nextInt(5));
            bt4.setText(""+r.nextInt(5));


            llFilas.addView(rlElemento,0);
        }

    });
    }



}