package org.example;

import org.example.dadosEstaticos.Item;
import org.example.dadosEstaticos.TipoCaminhao;
import org.example.dadosEstaticos.TipoItem;
import org.example.dadosEstaticos.TrechoTransporte;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

class TrechoTransporteTest {

    @Test
    void calculaPreco() {
        // arrange
        List<Item> itens = new LinkedList<>();

        itens.add(new Item(TipoItem.CELULAR, 300));
        itens.add(new Item(TipoItem.GELADEIRA, 50));
        itens.add(new Item(TipoItem.PLAYSTATION5, 70));
        itens.add(new Item(TipoItem.LUMINARIA, 2000));

        TrechoTransporte trecho = new TrechoTransporte(itens, TipoCaminhao.GRANDE, 711);

        // act
        double resultado = trecho.calculaPreco();

        // assert
        Assertions.assertEquals(20768.31, resultado);
    }

}