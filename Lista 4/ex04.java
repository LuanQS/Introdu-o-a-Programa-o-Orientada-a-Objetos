import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subtracao = 0;

        while (subtracao >= -1000) {
            System.out.print("Digite um número para subtração: ");
            int valor = scanner.nextInt();
            subtracao -= valor;
            System.out.println("Subtração atual: " + subtracao);
        }

        System.out.println("A subtração acumulada foi menor que -1000. Valor final: " + subtracao);
        scanner.close();
    }
}

