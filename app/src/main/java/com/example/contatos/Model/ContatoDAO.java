package com.example.contatos.Model;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.example.contatos.Conexao;

public class ContatoDAO {
    public void salvar(Contato contato){
        ContentValues values = new ContentValues();

        values.put("nome", contato.getNome());
        values.put("numero", contato.getNumero());
        values.put("tipo", contato.getTipo());

        SQLiteDatabase conn = Conexao.getConexao();
        conn.insert("contato",null,values);
    }
}
