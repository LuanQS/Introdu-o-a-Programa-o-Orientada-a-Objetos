import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner aluno = new Scanner(System.in);

        System.out.println("Digite a nota do Aluno: ");
        double nota = aluno.nextDouble();

        if (nota >= 5.0) {

            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
        
        aluno.close();
    }
    
}
