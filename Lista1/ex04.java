import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        System.out.print("Digite o quarto número: ");
        int num4 = scanner.nextInt();

        int maior = Math.max(Math.max(num1, num2), Math.max(num3, num4));
        int menor = Math.min(Math.min(num1, num2), Math.min(num3, num4));

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);

        scanner.close();
    }
}

