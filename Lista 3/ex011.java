import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        int a = 0, b = 1;
        System.out.println(a);

        if (n > 1) {
            System.out.println(b);
        }

        for (int i = 2; i < n; i++) {
            int proximo = a + b;
            System.out.println(proximo);
            a = b;
            b = proximo;
        }

        scanner.close();
    }
}
