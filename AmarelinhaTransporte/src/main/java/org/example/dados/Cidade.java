package org.example.dados;

public class Cidade {
     String nome;
     int[] distancias;

     public Cidade(String nome, int[] distancias) {
          this.nome = nome;
          this.distancias = distancias;
     }

     public String getNome() {
          return nome;
     }
/*
     public int getDistancias(Cidade outrasCidade) {
          int indice = getIndex(outrasCidade);
          return distancias[indice];
     }

     private int getIndex(Cidade cidade) {
          for (int i = 0; i < distancias.length; i++) {
               if (cidades[i].equals(cidade)) {
                    return i;
               }
          }

          return -1; // retorna -1 caso a cidade não for encontrada
     }*/
}
