package org.example.dadosEstaticos;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public enum TipoCaminhao { // tipo do caminhão com seu nome e capacidade maxima

    PEQUENO(5.83, 1000),
    MEDIO(13.42, 4000),
    GRANDE(29.21, 10000);

    private double precoPorQuilometro, capacidadeMaxima;
    TipoCaminhao(double precoQuilometro, double capacidadeMaxima) {
        this.precoPorQuilometro = precoQuilometro;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public double getPrecoPorQuilometro() {
        return precoPorQuilometro;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    @Override
    public String toString() {
        return this.name() + " -- " + this.capacidadeMaxima + " -- " + this.precoPorQuilometro;
    }
}
