package org.example;

import org.example.dadosEstaticos.DistanciaCidades;
import org.example.dadosEstaticos.TipoCaminhao;

import java.util.Scanner;

// Vai ler o arquivo CSV
// Criar instâncias das classes necessárias
// Calcular a melhor rota para cada produto
// Imprimir os resultados
//Aqui é onde vai ficar a listas de cidades

public class SistemaTransporte {
    private  Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        SistemaTransporte sistema = new SistemaTransporte();
        sistema.iniciar();

    }

    public void iniciar(){
        boolean continuar = true;

        while (continuar) {
            exibirOpcoes();
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    consultarTrechos();
                    break;
                case 2:
                    cadastrarTransporte(scanner);
                    break;
                case 3:
                   // exibirDados();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.");
            }
        }
        scanner.close();
    }

    public void exibirOpcoes(){
        System.out.println(" .:Bem-vindo(a) ao Amarelinha Transportes:. \n");
        System.out.println("1. Consultar Trechos e Modalidades");
        System.out.println("2. Cadastrar Transporte");
        System.out.println("3. Dados Estatísticos");
        System.out.println("4. Finalizar o programa");
        System.out.print("Escolha uma opção: ");

    }

    public void consultarTrechos(){
        DistanciaCidades distanciacidades = new DistanciaCidades(); //distancia entre as cidades
        distanciacidades.exibirCidades();
        System.out.println("Trechos disponíveis para transporte: ");
        //implementação da consulta de trechos aqui
        System.out.print("Selecione a cidade de partida: ");
        String cidade1 = scanner.nextLine();
        System.out.print("Selecione a cidade de destino: ");
        String cidade2 = scanner.nextLine();
        // buscar as cidades e calcular a distância
        // e calcular dps o custo com base no caminhão escolhido

        int distancia = distanciacidades.calcularDistanciaEntreCidades(cidade1, cidade2);
        System.out.println("A distancia entre " + cidade1 + " e " + cidade2 + " é de " + distancia + " KM.");
        //System.out.println("Valor do transporte: " + tipoCaminhao.getPrecoPorQuilometro() * distancia);
        //TipoCaminhao.custoTotal(distancia);
    }

    public void cadastrarTransporte(Scanner scan){
        System.out.print("Digite a cidade de origem: ");
    }
}

//listagem das cidades
//interface
//teste unitário
//você deseja adicionar uma parada(cidade)