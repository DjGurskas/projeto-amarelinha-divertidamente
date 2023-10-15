package listagem;
import java.util.ArrayList;
import java.util.List;
//Nosso Array
public class ListaProdutosSelecionados {
    private List<Produto> produtosSelecionados = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosSelecionados.add(produto);
    }

    public List<Produto> getProdutosSelecionados() {
        return produtosSelecionados;
    }
}