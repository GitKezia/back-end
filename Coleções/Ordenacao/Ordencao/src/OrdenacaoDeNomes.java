import java.util.Arrays;
import java.util.Scanner;

public class OrdenacaoDeNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os nomes separados por vírgula:");
        String entrada = scanner.nextLine();

        // Usar o método split para separar os nomes
        String[] nomes = entrada.split(",");

        // Remover espaços em branco antes e depois de cada nome
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = nomes[i].trim();
        }

        // Ordenar os nomes em ordem alfabética
        Arrays.sort(nomes);

        // Imprimir os nomes ordenados
        System.out.println("Nomes ordenados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}