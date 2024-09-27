import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextDouble();

        System.out.print("Digite a sua nota (entre 1 e 5): ");
        int nota = scanner.nextInt();

        double aumento;
        if (nota < 1 || nota > 5) {
            System.out.println("Nota inválida.");
        } else {
            switch (nota) {
                case 1:
                    aumento = 0;
                    break;
                case 2:
                    aumento = 0.05; // 5%
                    break;
                case 3:
                    aumento = 0.1; // 10%
                    break;
                case 4:
                    aumento = 0.15; // 15%
                    break;
                case 5:
                    aumento = 0.2; // 20%
                    break;
                default:
                    aumento = 0;
            }

            double novoSalario = salario * (1 + aumento);

            System.out.println("Salário inicial: R$ " + salario);
            System.out.println("Aumento: " + (aumento * 100) + "%");
            System.out.println("Novo salário: R$ " + novoSalario);
        }

        scanner.close();
    }
}