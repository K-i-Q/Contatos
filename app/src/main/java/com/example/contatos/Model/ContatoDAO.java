package com.example.contatos.Model;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.contatos.Conexao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ContatoDAO {
    public void salvar(Contato contato){
        ContentValues values = new ContentValues();

        values.put("nome", contato.getNome());
        values.put("numero", contato.getNumero());
        values.put("tipo", contato.getTipo());

        SQLiteDatabase conn = Conexao.getConexao();
        conn.insert("contato",null,values);
    }


    public List<Contato> listar(){
        SQLiteDatabase conn = Conexao.getConexao();
        Cursor c = conn.query("contato", new String[] {"id", "nome", "numero", "tipo"}, null, null,null,null, "nome asc");
        List<Contato> contatos = new ArrayList<>();

        if(c.moveToFirst()){
            do{
                Contato contato = new Contato();
                contato.setId(c.getInt(0));
                contato.setNome(c.getString(1));
                contato.setNumero((c.getString(2)));
                contato.setTipo(c.getString(3));
                contatos.add(contato);
            }while(c.moveToNext());
        }
        return contatos;
    }
}
