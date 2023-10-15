package org.example.dados;

public class Caminhao {
     String classificacao;
     double preco;
     double capacidadeMax;

     public Caminhao(String classificacao, double preco, double capacidadeMax) {
          this.classificacao = classificacao;
          this.preco = preco;
          this.capacidadeMax = capacidadeMax;
     }

     public String getClassificacao(){
          return classificacao;
     }

     public double getPreco(){
          return preco;
     }

     public double getCapacidadeMax(){
          return capacidadeMax;
     }
}
