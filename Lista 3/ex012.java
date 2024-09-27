import java.util.Scanner;

public class ex012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a altura do losango (número ímpar): ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println("Por favor, insira um número ímpar.");
        } else {
            int meio = n / 2;

            // Parte superior do losango
            for (int i = 0; i <= meio; i++) {
                for (int j = meio - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Parte inferior do losango
            for (int i = meio - 1; i >= 0; i--) {
                for (int j = meio - i; j > 0; j--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
