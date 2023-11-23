
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SeparacaoPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Listas para armazenar homens e mulheres
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        // Loop para receber dados de várias pessoas
        while (true) {
            System.out.println("Digite o nome da pessoa (ou digite 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            // Verificar se o usuário quer sair do programa
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine();  // Consumir a quebra de linha pendente

            // Verificar o sexo e adicionar à lista apropriada
            if (sexo == 'M' || sexo == 'm') {
                homens.add(nome);
            } else if (sexo == 'F' || sexo == 'f') {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
            }
        }

        // Imprimir os grupos
        System.out.println("\nGrupo de Homens:");
        for (String homem : homens) {
            System.out.println(homem);
        }

        System.out.println("\nGrupo de Mulheres:");
        for (String mulher : mulheres) {
            System.out.println(mulher);
        }

        scanner.close();
    }
}