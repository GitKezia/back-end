import java.util.Scanner;

public class SeparacaoPorGenero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o seu sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

        if (sexo == 'M' || sexo == 'm') {
            System.out.println(nome + " pertence ao grupo masculino.");
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println(nome + " pertence ao grupo feminino.");
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        scanner.close();
    }
}
