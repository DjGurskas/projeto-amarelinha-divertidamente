package listagem;
//Referencia java
public class Produto {
    private String nome;
    private double peso;
    private int quantidade;

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
