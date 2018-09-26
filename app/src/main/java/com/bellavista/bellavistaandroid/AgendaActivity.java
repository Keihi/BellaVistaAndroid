package com.bellavista.bellavistaandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class AgendaActivity extends AppCompatActivity {

    private Button btnPaciente, btnNaoPaciente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        btnPaciente = (Button) findViewById(R.id.btnPaciente);
        btnNaoPaciente = (Button) findViewById(R.id.btnNaoPaciente);


        btnNaoPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AgendaActivity.this,FormularioActivity.class);
                startActivity( i );
            }
        });
        btnPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AgendaActivity.this,LoginActivity.class);
                startActivity( i );
            }
        }
        );
    }

    }

