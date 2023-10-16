package org.example.sistema;

import org.example.dadosEstaticos.DistanciaCidades;
import static org.example.sistema.Metodos.procurarProdutoPorNome;
import static org.example.sistema.Metodos.removerProduto;

import java.util.*;
import java.text.DecimalFormat;



public class Sistema {
    public static void main(String[] args) {
        List<Produto> produtosSelecionados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        double pesoTotalSaida = 0.0;

        Produto celular = new Produto("Celular", 0.7);
        Produto geladeira = new Produto("Geladeira", 50);
        Produto airFryer = new Produto("Air Fryer", 3.5);
        Produto cadeira = new Produto("Cadeira", 5.0);
        Produto luminaria = new Produto("Luminária", 0.8);
        Produto lavadoraRoupa = new Produto("Lavadora de Roupa", 15);
        Produto playstation5 = new Produto("PlayStation 5", 3.9);
        Produto nintendoSwitch = new Produto("Nintendo Switch", 0.3);


        while (true) {
            System.out.println(" .:Bem-vindo(a) ao Amarelinha Transportes:.\n" +
                    "1. Adicionar Produto \n" +
                    "2. Remover Produto \n" +
                    "3. Listar Produtos \n" +
                    "4. Consultar Trecho e Modalidade \n" +
                    "5. Cadastrar Transporte \n" +
                    "6. Dados Estatísticos \n" +
                    "7. Sair do programa \n");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                // Adicionar produto
                System.out.println(".:Lista de Produtos:.\n" +
                        "Celular \n" +
                        "Geladeira \n" +
                        "Air Fryer \n" +
                        "Luminária \n" +
                        "Lavadora de Roupa \n" +
                        "Nintendo Switch \n");
                System.out.print("Digite o nome do produto para ser adicionado: ");
                String nomeAdicionar = scanner.nextLine();
                Produto produtoAdicionar = procurarProdutoPorNome(nomeAdicionar, celular, geladeira, airFryer,
                        cadeira, luminaria, lavadoraRoupa, playstation5, nintendoSwitch);
                if (produtoAdicionar != null) {
                    System.out.print("Digite a quantidade desejada: ");
                    int quantidade = scanner.nextInt();
                    produtoAdicionar.setQuantidade(quantidade);
                    produtosSelecionados.add(produtoAdicionar);
                    System.out.println("Produto adicionado: " + produtoAdicionar.getNome() + " (Quantidade: " + quantidade + ")");
                } else {
                    System.out.println("Produto não encontrado. Tente novamente.");
                }
            } else if (opcao == 2) {
                // Remover produto
                System.out.print("Digite o nome do produto que deseja remover: ");
                String nomeRemover = scanner.nextLine();
                System.out.print("Digite a quantidade desejada: ");
                int quantidadeRemover = scanner.nextInt();
                removerProduto(nomeRemover, quantidadeRemover, produtosSelecionados);
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
                // Consultar Trechos
                //System.out.println("Valor do transporte: " + tipoCaminhao.getPrecoPorQuilometro() * distancia);
                //TipoCaminhao.custoTotal(distancia);
                DistanciaCidades distanciacidades = new DistanciaCidades();
                distanciacidades.exibirCidades();
                System.out.println("Trechos disponíveis para transporte: ");
                System.out.print("Selecione a cidade de partida: ");
                String cidade1 = scanner.nextLine();
                System.out.print("Selecione a cidade de destino: ");
                String cidade2 = scanner.nextLine();
                // e calcular dps o custo com base no caminhão escolhido
                int distancia = distanciacidades.calcularDistanciaEntreCidades(cidade1, cidade2);
                System.out.println("A distancia entre " + cidade1 + " e " + cidade2 + " é de " + distancia + " KM.");
            } else if (opcao == 7) {
                // Sair do programa
                // Calcular e exibir o peso total dos produtos
                DecimalFormat df = new DecimalFormat("#,##0.00");
                for (Produto produto : produtosSelecionados) {
                    double pesoProduto = produto.getPeso() * produto.getQuantidade();
                    pesoTotalSaida += pesoProduto;
                }
                System.out.println("Peso total dos produtos: " + df.format(pesoTotalSaida) + " kg");
            } else {
                System.out.println("Opção inválida! Tente novamente.");
            }

        }
    }

}