package org.example.listagem;

import org.example.dadosEstaticos.TipoItem;

import java.util.*;
import java.text.DecimalFormat;

public class CriarProduto {
    public static void main(String[] args) {
        // Produtos e suas instâncias
        Produto celular = new Produto("Celular", 0.7);
        Produto geladeira = new Produto("Geladeira", 50);
        Produto airFryer = new Produto("Air Fryer", 3.5);
        Produto cadeira = new Produto("Cadeira", 5.0);
        Produto luminaria = new Produto("Luminária", 0.8);
        Produto lavadoraRoupa = new Produto("Lavadora de Roupa", 15);
        Produto playstation5 = new Produto("PlayStation 5", 3.9);
        Produto nintendoSwitch = new Produto("Nintendo Switch", 0.3);

        // Cria uma lista para armazenar os produtos selecionados pelo usuário
        List<Produto> produtosSelecionados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Variável para acumular o peso total
        double pesoTotalSaida = 0.0;

        // Loop principal para adicionar, remover, ver a lista ou sair
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Ver lista de produtos selecionados");
            System.out.println("4. Sair do programa");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar a linha após ler o número

            if (opcao == 1) {
                // Adicionar produto
                System.out.println("Digite o nome do produto a ser adicionado: ");
                System.out.println("Celular,");
                System.out.println("Geladeira,");
                System.out.println("Air Fryer,");
                System.out.println("Luminária,");
                System.out.println("Lavadora de Roupa,");
                System.out.println("PlayStation 5 ou");
                System.out.println("Nintendo Switch");
                System.out.println("\n");
                System.out.println("Você vai querer qual? ");
                String nomeAdicionar = scanner.nextLine();
                Produto produtoAdicionar = procurarProdutoPorNome(nomeAdicionar, celular, geladeira, airFryer, cadeira, luminaria, lavadoraRoupa, playstation5, nintendoSwitch);
                if (produtoAdicionar != null) {
                    System.out.print("Digite a quantidade desejada: ");
                    int quantidade = scanner.nextInt();
                    produtoAdicionar.setQuantidade(quantidade);
                    produtosSelecionados.add(produtoAdicionar);
                    System.out.println("Produto adicionado: " + produtoAdicionar.getNome() + " (Quantidade: " + quantidade + ")");
                    System.out.println("\n");
                } else {
                    System.out.println("Produto não encontrado. Tente novamente.");
                }
            } else if (opcao == 2) {
                // Remover produto
                System.out.print("Digite o nome do produto a ser removido: ");
                String nomeRemover = scanner.nextLine();
                Produto produtoRemover = procurarProdutoPorNome(nomeRemover, produtosSelecionados.toArray(new Produto[0]));
                if (produtoRemover != null) {
                    produtosSelecionados.remove(produtoRemover);
                    System.out.println("Produto removido: " + produtoRemover.getNome());
                } else {
                    System.out.println("Produto não encontrado na lista.");
                }
            } else if (opcao == 3) {
                // Ver lista dos produtos selecionados
                System.out.println("Produtos selecionados para transporte:");
                DecimalFormat df = new DecimalFormat("#,##0.00");
                double pesoTotal = 0.0;
                for (Produto produto : produtosSelecionados) {
                    double pesoProduto = produto.getPeso() * produto.getQuantidade();
                    pesoTotal += pesoProduto;
                    System.out.println("Nome: " + produto.getNome() + " (Quantidade: " + produto.getQuantidade() + "), Peso Total: " + df.format(pesoProduto) + " kg");
                }
                System.out.println("Peso total dos produtos: " + df.format(pesoTotal) + " kg");
            } else if (opcao == 4) {
                // Sair do programa
                // Calcular e exibir o peso total dos produtos
                DecimalFormat df = new DecimalFormat("#,##0.00");
                for (Produto produto : produtosSelecionados) {
                    double pesoProduto = produto.getPeso() * produto.getQuantidade();
                    pesoTotalSaida += pesoProduto;
                }
                System.out.println("Peso total dos produtos ao sair do programa: " + df.format(pesoTotalSaida) + " kg");
                System.out.println("Obrigado por usar a Amarelinha. Volte sempre!");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    // Método pra procurar o produto pelo nome
    public static Produto procurarProdutoPorNome(String nome, Produto... produtos) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return new Produto(produto.getNome(), produto.getPeso());
            }
        }
        return null; // SE não achar o produto
    }
}
/*

        ──────▄▀▄─────▄▀▄
        ─────▄█░░▀▀▀▀▀░░█▄
        ─▄▄──█░░░░░░░░░░░█──▄▄ Marco Marchi passou por aqui.
        █▄▄█─█░░▀░░┬░░▀░░█─█▄▄█

 */

