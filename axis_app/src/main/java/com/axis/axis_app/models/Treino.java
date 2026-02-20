package com.axis.axis_app.models;

public abstract class Treino {
    private String nome;
    private String tipo;

    public void Treino() {
        this.nome = nome;
        this.tipo = tipo;
    }

    //setters
    public void  setNome(String nome)   {this.nome = nome;}
    public void setObj(String tipo) {this.tipo = tipo;}

    //gettes
    public String getNome() {return nome;}
    public String getObj()  {return tipo;}

    public abstract void detalhes();

}




