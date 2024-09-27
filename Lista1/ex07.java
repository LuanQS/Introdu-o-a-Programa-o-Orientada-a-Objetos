import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a sua nota (entre 0 e 10): ");
        double nota = scanner.nextDouble();

        double aumento;
        if (nota <= 2) {
            aumento = 0;
        } else if (nota <= 4) {
            aumento = 0.05; // 5%
        } else if (nota <= 6) {
            aumento = 0.1; // 10%
        } else if (nota <= 8) {
            aumento = 0.15; // 15%
        } else {
            aumento = 0.2; // 20%
        }

        double novoSalario = salario * (1 + aumento);

        System.out.println("Salário inicial: R$ " + salario);
        System.out.println("Aumento: " + (aumento * 100) + "%");
        System.out.println("Novo salário: R$ " + novoSalario);

        scanner.close();
    }
}