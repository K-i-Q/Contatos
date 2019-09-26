package com.example.contatos.Model;

public class Contato {
    private Integer id;
    private String nome;
    private String numero;
    private String tipo;
    private String apelido;
    private String genero;
    private String email;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getGenero() { return genero; }

    public void setGenero(String genero) { this.genero= genero; }

    public String getEmail() { return email; }

    public void setEmail(String email) { this.email= email; }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append("Nome: ");
        sb.append(nome);
        sb.append("\n");
        sb.append("Telefone: ");
        sb.append(numero);
        sb.append("\n");
        sb.append("Tipo: ");
        sb.append(tipo);
        sb.append("\n");
        sb.append("Genero: ");
        sb.append(genero);
        sb.append("\n");
        sb.append("Apelido: ");
        sb.append(apelido);

        return sb.toString();
    }
}
