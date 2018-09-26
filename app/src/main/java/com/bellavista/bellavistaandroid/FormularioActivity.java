package com.bellavista.bellavistaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.RadioButton;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNomeCadastro,etIdadeCadastro, etTelefoneCadastro, etCPFCadastro;
    private RadioButton rbConvenio, rbNaoConvenio;
    private Button btnSalvar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

     etNomeCadastro = (EditText) findViewById(R.id.etNomeCadastro);
     etIdadeCadastro= (EditText) findViewById(R.id.etIdadeCadastro);
     etTelefoneCadastro= (EditText) findViewById(R.id.etIdadeCadastro);
     etCPFCadastro = (EditText) findViewById(R.id.etCPFCadastro);




    }
}
