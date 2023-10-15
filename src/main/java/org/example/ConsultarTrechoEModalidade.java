package org.example;
import java.util.Scanner;

// consultar trechos e modalidades. Funcionalidade 1
public class ConsultarTrechoEModalidade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Trechos disponíveis para transporte: ");

        DistanciaCidades distanciacidades = new DistanciaCidades(); //distancia entre as cidades
        distanciacidades.carregaCidades();
        distanciacidades.exibirCidades();

        System.out.println("Selecione a cidade de partida: ");
        String cidade1 = scanner.nextLine();

        System.out.println("Selecione a cidade de destino: ");
        String cidade2 = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Certo! Agora selecione o tipo de caminhão desejado.");

        for (TipoCaminhao tipoCaminhao : TipoCaminhao.values()) { //tipos de caminhão
            System.out.println(tipoCaminhao);
        }
        String escolha = scanner.next();

        TipoCaminhao tipoCaminhao = null;

        try {
            tipoCaminhao = TipoCaminhao.valueOf(escolha.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Inválido.");
            throw e;
        }
        // calculo da distancia entre as cidades
        int distancia = distanciacidades.calcularDistanciaEntreCidades(cidade1, cidade2);
        System.out.println("A distancia entre " + cidade1 + " e " + cidade2 + " é de " + distancia + " KM.");
        System.out.println("Valor do transporte: " + tipoCaminhao.getPrecoPorQuilometro() * distancia);
    }
}
