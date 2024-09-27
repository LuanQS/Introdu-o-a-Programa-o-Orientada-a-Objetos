import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();
        int contador = 0;
        int num = 2;

        while (contador < n) {
            if (isPrimo(num)) {
                System.out.println(num);
                contador++;
            }
            num++;
        }
        scanner.close();
    }

    public static boolean isPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
