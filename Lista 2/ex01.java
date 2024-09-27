import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();

        String[] extenso = {"", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", "dez"};

        if (numero >= 1 && numero <= 10) {
            System.out.println("O número por extenso é: " + extenso[numero]);
        } else {
            System.out.println("Número inválido. Digite um número entre 1 e 10.");
        }

        scanner.close();
    }
}