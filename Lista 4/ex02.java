import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valorSaida = 999; // Defina o valor de saída
        int valor;

        do {
            System.out.print("Digite um valor (Digite " + valorSaida + " para sair): ");
            valor = scanner.nextInt();
        } while (valor != valorSaida);

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
