package org.example.sistema;

public class Produto {
    public String nome;
    public double peso;
    public int quantidade;

    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
