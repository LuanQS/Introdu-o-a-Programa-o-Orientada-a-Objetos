import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 5) {
            System.out.println("Aprovado!");
        } else {
            System.out.print("Reprovado. Digite a nota da recuperação: ");
            double notaRecuperacao = scanner.nextDouble();

            double novaMedia = (Math.max(nota1, nota2) + notaRecuperacao) / 2;

            if (novaMedia >= 5) {
                System.out.println("Aprovado na recuperação!");
            } else {
                System.out.println("Reprovado.");
            }
        }

        scanner.close();
    }
}