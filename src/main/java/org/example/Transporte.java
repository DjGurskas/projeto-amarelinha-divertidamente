package org.example;
import java.util.ArrayList;
import java.util.List;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public class Transporte {

    List<TrechoTransporte> trechos =  new ArrayList<>();

    public Transporte(List<TrechoTransporte> trechos) {
        this.trechos = trechos;
    }

    public double calculaCustoTotalDaViagem() {
        double total = 0;
        for (TrechoTransporte trecho: trechos) {
            total = total + trecho.calculaPreco();
        }
        return total;
    }
}
