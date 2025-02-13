package com.example.aula7;

public class User {
    private int id;
    private String nome;
    private String sobrenome;

    public User(int id, String nome, String sobrenome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    }




