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

        // Solicita para o usuário que insira os produtos até que ele deseje parar
        while (true) {
            System.out.print("Digite o nome do produto (ou 'sair' para finalizar): ");
            String nomeProduto = scanner.nextLine();

            if (nomeProduto.equalsIgnoreCase("sair")) {
                break; //Vai "sair" com o Break quando o usuário digitar "sair"
            }

            // Procure o produto que o usuário digitou e tenta o add a lista
            Produto produtoSelecionado = procurarProdutoPorNome(nomeProduto, celular, geladeira, airFryer, cadeira, luminaria, lavadoraRoupa, playstation5, nintendoSwitch);
            if (produtoSelecionado != null) {
                produtosSelecionados.add(produtoSelecionado);
                System.out.println("Produto adicionado: " + produtoSelecionado.getNome());
            } else {
                System.out.println("Produto não encontrado. Tente novamente.");
            }
        }

        // Lista os produtos selecionados
        System.out.println("Produtos selecionados para transporte:");
        for (Produto produto : produtosSelecionados) {
            System.out.println("Nome: " + produto.getNome() + ", Peso: " + produto.getPeso() + " kg");
        }

        scanner.close();
    }

    // Método para procurar um produto pelo nome
    public static Produto procurarProdutoPorNome(String nome, Produto... produtos) {
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null; //SE no achar o produtinho
    }
}
