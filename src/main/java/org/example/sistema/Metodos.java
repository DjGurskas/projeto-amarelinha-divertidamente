package org.example.sistema;

import java.util.List;

public class Metodos {

    public static void removerProduto(String nome, int quantidade, List<Produto> produtos) {
        for (Produto produto : produtos) {
            if (produto != null && produto.getNome().equalsIgnoreCase(nome)) {
                if (quantidade <= produto.getQuantidade()) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println("Removido " + quantidade + " unidade do produto: " + nome);
                    if (produto.getQuantidade() == 0) {
                        System.out.println("O produto " + nome + " foi totalmente removido da lista.");
                        produtos.remove(produto);
                    }
                } else {
                    System.out.println("Quantidade solicitada maior do que a disponível. " +
                            "Removendo todas as unidades do " + nome);
                    produto.setQuantidade(0);
                    produtos.remove(produto);
                }
                return;
            }
        }
        // Se o produto não foi encontrado na lista.
        System.out.println("Produto não encontrado: " + nome);
    }

    // Método pra procurar o produto pelo nome
    public static Produto procurarProdutoPorNome(String nome, Produto... produtos) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return new Produto(produto.getNome(), produto.getPeso());
            }
        } return null; // SE não achar o produto

    }
}
