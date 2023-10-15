package org.example;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
// Nome e distancia entre as cidades. Lendo arquivo CSV.
public class DistanciaCidades {
    private String[][] linhas = new String[25][24];

    public void exibirCidades() {
        System.out.println(Arrays.toString(this.linhas[0]));
    }

    public void carregaCidades() {
        BufferedReader reader = null;
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            InputStream csv = classLoader.getResourceAsStream("distanciaCidades.csv");

            reader = new BufferedReader(new InputStreamReader(csv));

            String headerRow = reader.readLine();
            String[] headers = headerRow.split(";");
            for (int headerNumber = 0; headerNumber < headers.length; headerNumber++) {
                (this.linhas[0])[headerNumber] = headers[headerNumber];
            }

            int linhaMemoriaAtual = 1;
            String row;
            while ((row = reader.readLine()) != null) {
                String[] linhaCsv = row.split(";");
                String[] linhaMemoria = this.linhas[linhaMemoriaAtual];
                for (int colunaAtual = 0; colunaAtual < linhaCsv.length; colunaAtual++) {
                    String celula = linhaCsv[colunaAtual];
                    linhaMemoria[colunaAtual] = celula;
                }
                linhaMemoriaAtual++;
            }
        } catch (final Exception exception) {
            System.out.println("Erro ao ler o arquivo:" + exception);
        }
    }
    public int calcularDistanciaEntreCidades(String cidadeUm, String cidadeDois) {

            try {
                int indiceDaCidadeUm = this.indexOf(cidadeUm);
                int indiceDaCidadeDois = this.indexOf(cidadeDois);
                return Integer.parseInt(linhas[indiceDaCidadeDois + 1][indiceDaCidadeUm]);
            } catch (NumberFormatException e) {
                // Trate erros de conversão ou outros problemas.
                System.out.println("Erro ao calcular a distância: " + e.getMessage());
                return -1;
            }
    }
    private int indexOf(String cidade) {

        String[] cabecalho = this.linhas[0];
        for (int i = 0; i < cabecalho.length; i++) {
            if (cabecalho[i].equalsIgnoreCase(cidade)) {
                return i; // posicao da cidade
            }
        }

        return -1; // cidade não existe
    }
}
