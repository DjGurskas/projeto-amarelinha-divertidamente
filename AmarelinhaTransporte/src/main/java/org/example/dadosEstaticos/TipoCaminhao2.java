package org.example.dadosEstaticos;

import java.util.ArrayList;
import java.util.List;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public enum TipoCaminhao2 { // tipo do caminhão com seu nome e capacidade maxima

    PEQUENO(5.83, 1000),
    MEDIO(13.42, 4000),
    GRANDE(29.21, 10000);

    private double precoPorQuilometro, capacidadeMaxima;
    TipoCaminhao2(double precoQuilometro, double capacidadeMaxima) {
        this.precoPorQuilometro = precoQuilometro;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    static List<TipoCaminhao2> caminhoes = new ArrayList<>(); //Lista com os caminhões utilizados na viagem.
    public static double pesoTotal = 2000; //Variavel de peso total dos itens. Deve ser substituido futuramente.

    public static List<TipoCaminhao2> listaCaminhao(){ //função para retornar os caminhões ideais para a viagem.
        caminhaoIdeal();
        return caminhoes;
    }

    public static TipoCaminhao2 caminhaoIdeal() { //Função com condições para descobrir os caminhões ideais.
        while (pesoTotal > 0) {
            if (pesoTotal <= PEQUENO.capacidadeMaxima) {
                pesoTotal -= PEQUENO.capacidadeMaxima;
                caminhoes.add(TipoCaminhao2.PEQUENO);
            }
            else if (pesoTotal <= PEQUENO.capacidadeMaxima * 2) {
                pesoTotal -= PEQUENO.capacidadeMaxima * 2;
                caminhoes.add(TipoCaminhao2.PEQUENO);
                caminhoes.add(TipoCaminhao2.PEQUENO);
            }
            else if (pesoTotal <= MEDIO.capacidadeMaxima) {
                pesoTotal -= MEDIO.capacidadeMaxima;
                caminhoes.add(TipoCaminhao2.MEDIO);
            }
            else if (pesoTotal <= MEDIO.capacidadeMaxima * 2) {
                pesoTotal -= MEDIO.capacidadeMaxima * 2;
                caminhoes.add(TipoCaminhao2.MEDIO);
                caminhoes.add(TipoCaminhao2.MEDIO);
            }
            else if (pesoTotal <= GRANDE.capacidadeMaxima || pesoTotal > GRANDE.capacidadeMaxima) {
                pesoTotal -= GRANDE.capacidadeMaxima;
                caminhoes.add(TipoCaminhao2.GRANDE);
            }
        }
        return null;
    }


    public static double custoTotal(int distanciaTotal){ //Função para calcular o valor total da viagem.
        double totalCustoViagem = 0;
        for (int i = 0; i < caminhoes.size(); i++) {
            totalCustoViagem += distanciaTotal * TipoCaminhao2.caminhoes.get(i).precoPorQuilometro;
        }
        return totalCustoViagem;
    }

   /* public int calculoDistanciaTotal() { //Função para calcular distância total
        for (int i = 1; i < cidades.size(); i++) {
            distanciaTotal += DistanciaCidades.calcularDistanciaEntreCidades(cidades[0], cidades[i]);
        }
        return distanciaTotal;
    }*/
}
