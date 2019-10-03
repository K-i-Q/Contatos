package com.example.contatos.model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private static SQLiteDatabase conn;

    public static SQLiteDatabase getConexao(){
        return conn;
    }

    public Conexao(Context context, String nome, SQLiteDatabase.CursorFactory factory, int version){
        super(context, nome, factory, version);
        conn = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE CONTATO("+
                "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NOME VARCHAR(80) NOT NULL," +
                "NUMERO VARCHAR(20),"+
                 "EMAIL VARCHAR(20),"+
                 "APELIDO VARCHAR(20),"+
                 "GENERO VARCHAR(20),"+
                "TIPO VARCHAR(50));"
                );
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
