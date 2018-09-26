package com.bellavista.bellavistaandroid;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;

public class CalendarioActivity extends AppCompatActivity {

    private Button btnData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        btnData=(Button)findViewById(R.id.btnbotao);

        btnData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selecionarData();
            }
        });

    }

    private void selecionarData(){
        AlertDialog.Builder alerta = new AlertDialog.Builder(this);
        DatePicker calendario = new DatePicker(this);
        alerta.setView(calendario);
        alerta.setPositiveButton("OK", null);
        alerta.show();
    }
}
