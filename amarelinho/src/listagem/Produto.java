package listagem;
public class Produto {
    private String nome;
    private double peso;

    public Produto(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }


}
