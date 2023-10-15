package org.example.dadosEstaticos;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Criado para conseguir fazer e testar os dados estatisticos, baseado no cenario 1
public class TrechoTransporte {

    List<Item> itens = new ArrayList<>();
    TipoCaminhao tipo;
    int quilometroDoTrajeto;

    public TrechoTransporte(List<Item> itens, TipoCaminhao tipo, int quilometrosDoTrajeto) {
        this.itens = itens;
        this.tipo = tipo;
        this.quilometroDoTrajeto = quilometrosDoTrajeto;
    }

    public double calculaPreco() {
        return this.quilometroDoTrajeto * this.tipo.getPrecoPorQuilometro();

    }

    public Set<TipoItem> getTipoItems() {
        return this.getTipoItems(); //CORRETO?
    }

    public double getTotalItems() {
        return this.getTotalItems(); //CORRETO?
    }
}
