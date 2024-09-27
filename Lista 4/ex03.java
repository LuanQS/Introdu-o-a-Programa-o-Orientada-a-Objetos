import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        while (soma <= 1000) {
            System.out.print("Digite um número para somar: ");
            int valor = scanner.nextInt();
            soma += valor;
            System.out.println("Soma atual: " + soma);
        }

        System.out.println("A soma ultrapassou 1000. Valor final: " + soma);
        scanner.close();
    }
}
