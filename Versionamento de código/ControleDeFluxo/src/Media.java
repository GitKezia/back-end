import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Média Aluno");

        System.out.println("Digite o nome do aluno: ");
        String nome = scan.nextLine();

        System.out.println("Digite a primeira nota: ");
        int n1 = scan.nextInt();

        System.out.println("Digite a segunda nota: ");
        int n2 = scan.nextInt();


        System.out.println("Digite a terceira a nota: ");
        int n3 = scan.nextInt();


        System.out.println("Digite a quarta nota: ");
        int n4 = scan.nextInt();

        double result = (n1 + n2 + n3 + n4)/4;

        if(result >= 7) {

            System.out.println("O aluno(a) "+nome+" teve a média de "+result+ " e foi aprovado");
        } else if ( result >= 5) {
             System.out.println("O aluno(a) "+nome+" teve a média de "+result+ " e está de recuperação");
            
        } else {
            System.out.println("O aluno(a) "+nome+" teve a média de "+result+ " e foi reprovado");


        }

        

      

    }
}
