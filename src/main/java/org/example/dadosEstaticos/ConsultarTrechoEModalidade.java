//package org.example.dadosEstaticos;
//import java.util.Scanner;
//
//
//
//// consultar trechos e modalidades. Funcionalidade 1
//public class ConsultarTrechoEModalidade {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Trechos disponíveis para transporte: ");
//
//        DistanciaCidades distanciacidades = new DistanciaCidades(); //distancia entre as cidades
//        distanciacidades.exibirCidades();
//
//        System.out.println("Selecione a cidade de partida: ");
//        String cidade1 = scanner.nextLine();
//
//        System.out.println("Selecione a cidade de destino: ");
//        String cidade2 = scanner.nextLine();
//
//        // calculo da distancia entre as cidades
//        int distancia = distanciacidades.calcularDistanciaEntreCidades(cidade1, cidade2);
//        System.out.println("A distancia entre " + cidade1 + " e " + cidade2 + " é de " + distancia + " KM.");
//        //System.out.println("Valor do transporte: " + tipoCaminhao.getPrecoPorQuilometro() * distancia);
//        TipoCaminhao.custoTotal(distancia);
//
//
//    }
//}
//
//
