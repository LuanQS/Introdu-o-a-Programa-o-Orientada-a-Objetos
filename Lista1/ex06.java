import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu salário: R$ ");
        double salario = scanner.nextDouble();

        double aliquota;
        double imposto;

        if (salario < 1000) {
            aliquota = 0;
        } else if (salario < 2000) {
            aliquota = 0.07;
        } else if (salario < 3000) {
            aliquota = 0.15;
        } else if (salario < 4000) {
            aliquota = 0.22;
        } else {
            aliquota = 0.29;
        }

        imposto = salario * aliquota;
        double salarioLiquido = salario - imposto;

        System.out.println("Imposto a pagar: R$ " + imposto);
        System.out.println("Salário líquido: R$ " + salarioLiquido);

        scanner.close();
    }
}