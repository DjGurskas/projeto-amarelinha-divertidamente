package listagem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CriarProduto {
    public static void main(String[] args) {
        // Produtos e suas instancias
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

        // Loop principal para adicionar, remover ou sair
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Sair do programa");
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
                System.out.println("Você vai querer qual? ");
                String nomeAdicionar = scanner.nextLine();
                Produto produtoAdicionar = procurarProdutoPorNome(nomeAdicionar, celular, geladeira, airFryer, cadeira, luminaria, lavadoraRoupa, playstation5, nintendoSwitch);
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
                // Sair do programa
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        // Lista os produtos selecionados
        System.out.println("Produtos selecionados para transporte:");
        for (Produto produto : produtosSelecionados) {
            System.out.println("Nome: " + produto.getNome() + " (Quantidade: " + produto.getQuantidade() + "), Peso: " + produto.getPeso() + " kg");
        }

        scanner.close();
    }

    // Método pra procurar um produto pelo seu nome
    public static Produto procurarProdutoPorNome(String nome, Produto... produtos) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return new Produto(produto.getNome(), produto.getPeso());
            }
        }
        return null; // Se não achar o produto
    }
}

