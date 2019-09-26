package com.example.contatos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.contatos.Model.Contato;
import com.example.contatos.Model.ContatoDAO;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Conexao(getApplicationContext(),"contato.db",null,1);
    }

    public void salvar(View view){

        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtNumero = findViewById(R.id.txtNumero);
        Spinner txtTipo = findViewById(R.id.txtTipo);
        EditText txtApelido = findViewById(R.id.txtApelido);
        EditText txtGenero = findViewById(R.id.txtGenero);



        Contato contato = new Contato();

        contato.setNome(txtNome.getText().toString());
        contato.setNumero(txtNumero.getText().toString());
        contato.setTipo(txtTipo.getSelectedItem().toString());
        contato.setApelido(txtApelido.getText().toString());
        contato.setGenero(txtGenero.getText().toString());



        if(new ContatoDAO().contatoExiste(contato)){
            new ContatoDAO().salvar(contato);
            Toast.makeText(getApplicationContext(),"Contato "+txtNome.getText().toString()+" salvo",Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(getApplicationContext(),"Contato "+txtNome.getText().toString()+" já existe",Toast.LENGTH_LONG).show();

        }




        limpar(view);
    }

    public void limpar(View view){
        EditText txtNome = findViewById(R.id.txtNome);
        EditText txtNumero = findViewById(R.id.txtNumero);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtApelido = findViewById(R.id.txtApelido);
        EditText txtGenero = findViewById(R.id.txtGenero);


        txtNome.setText("");
        txtNumero.setText("");
        txtEmail.setText("");
        txtApelido.setText("");
        txtGenero.setText("");

    }
}
