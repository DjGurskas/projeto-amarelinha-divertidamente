package org.example.dadosEstaticos;


import java.util.*;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public enum TipoCaminhao { // tipo do caminhão com seu nome e capacidade maxima
    PEQUENO(5.83, 1000),
    MEDIO(13.42, 4000),
    GRANDE(29.21, 10000);
    public double totalCustoViagem = 0;

    private double precoPorQuilometro, capacidadeMaxima;
    TipoCaminhao(double precoQuilometro, double capacidadeMaxima) {
        this.precoPorQuilometro = precoQuilometro;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    static final List<TipoCaminhao> caminhoes = new ArrayList<>(); //Lista com os caminhões utilizados na viagem.

    public static List<TipoCaminhao> listaCaminhao(double pesoTotal){ //função para retornar os caminhões ideais para a viagem.
        caminhaoIdeal(pesoTotal);
        return caminhoes;
    }

    public static void caminhaoIdeal(double pesoTotal) { //Função com condições para descobrir os caminhões ideais.
        caminhoes.removeAll(caminhoes);
        while (pesoTotal > 0) {
            if (pesoTotal <= PEQUENO.capacidadeMaxima) {
                pesoTotal -= PEQUENO.capacidadeMaxima;
                caminhoes.add(TipoCaminhao.PEQUENO);
            }
            else if (pesoTotal <= PEQUENO.capacidadeMaxima * 2) {
                pesoTotal -= PEQUENO.capacidadeMaxima * 2;
                caminhoes.add(TipoCaminhao.PEQUENO);
                caminhoes.add(TipoCaminhao.PEQUENO);
            }
            else if (pesoTotal <= MEDIO.capacidadeMaxima) {
                pesoTotal -= MEDIO.capacidadeMaxima;
                caminhoes.add(TipoCaminhao.MEDIO);
            }
            else if (pesoTotal <= MEDIO.capacidadeMaxima * 2) {
                pesoTotal -= MEDIO.capacidadeMaxima * 2;
                caminhoes.add(TipoCaminhao.MEDIO);
                caminhoes.add(TipoCaminhao.MEDIO);
            }
            else if (pesoTotal <= GRANDE.capacidadeMaxima || pesoTotal > GRANDE.capacidadeMaxima) {
                pesoTotal -= GRANDE.capacidadeMaxima;
                caminhoes.add(TipoCaminhao.GRANDE);
            } else {
                System.out.println("Algo deu errado, verifique se os itens foram cadastrados.");
            }
        }
    }
    public static double custoTotal(int distanciaTotal){ //Função para calcular o valor total da viagem.
        double totalCustoViagem = 0;
        for (int i = 0; i < caminhoes.size(); i++) {
            totalCustoViagem += distanciaTotal * TipoCaminhao.caminhoes.get(i).precoPorQuilometro;
        }
        return totalCustoViagem;
    }


    // int distancia = distanciacidades.calcularDistanciaEntreCidades(cidade1, cidade2);



}
