package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Vai ler o arquivo CSV
// Criar instâncias das classes necessárias
// Calcular a melhor rota para cada produto
// Imprimir os resultados
//Aqui é onde vai ficar a listas de cidades

public class SistemaTransporte {
   // public List<Transporte> transportes;
    public SistemaTransporte() {
    //transportes = new ArrayList<>();
    }
    public static void main(String[] args) {
        SistemaTransporte sistema = new SistemaTransporte();
        sistema.iniciar();

    }

    public void iniciar(){
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            exibirOpcoes();
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    consultarTrechos();
                    break;
                case 2:
                    cadastrarTransporte(scan);
                    break;
                case 3:
                    exibirDados();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção incorreta! Tente novamente.");
            }
        }
        scan.close();
    }

    public void exibirOpcoes(){
        System.out.println(" .:Bem-vindo(a) ao Amarelinha Transportes:. \n");
        System.out.println("1. Consultar Trechos e Modalidades");
        System.out.println("2. Cadastrar Transporte");
        System.out.println("3. Dados Estatísticos");
        System.out.println("4. Finalizar o programa");
        System.out.print("Escolha uma opção: ");

    }

    public void consultarTrechos(Scanner scan){
        //implementação da consulta de trechos aqui
        System.out.print("Digite a cidade de origem: ");
        String origem = scan.nextLine();
        System.out.print("Digite a cidade de destino: ");
        String destino = scan.nextLine();
        // buscar as cidades e calcular a distância
        // e calcular dps o custo com base no caminhão escolhido
    }

    public void cadastrarTransporte(Scanner scan){
        System.out.print("Digite a cidade de origem: ");
    }
}