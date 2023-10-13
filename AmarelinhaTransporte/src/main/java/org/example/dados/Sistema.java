package org.example.dados;

import java.util.List;

public class Sistema {
     List<Cidade> cidades;
     List<Caminhao> caminhoes;
     List<Produto> produtos;

     public Sistema(List<Cidade> cidades, List<Caminhao> caminhoes, List<Produto> produtos){
          this.cidades = cidades;
          this.caminhoes = caminhoes;
          this.produtos = produtos;
     }

     public double custosTransporte(Cidade origem, Cidade destino, Caminhao caminhao,
                                    List<Produto> listaProdutos) {
          //aqui é a lógica pra calcular o custo da viagem
          //usa a distância, o tipo de caminhão e os a lista dos produtos fornecidos
          return 0.0;
     }

     //aqui pode botar outros métodos se precisar
}
