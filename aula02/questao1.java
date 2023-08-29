import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try (Scanner sc2 = new Scanner(System.in)) {
                System.out.println("Insira sua matrícula, nome e salário bruto:");

                int matricula = sc.nextInt();
                String nome = sc2.nextLine();
                double salario = sc.nextDouble();
                double descontoinss = salario * 0.15;
                double salarioliq = salario - descontoinss;

                System.out.println("Matrícula: " + matricula);
                System.out.println("Nome: " + nome);
                System.out.println("Salário bruto: " + salario);
                System.out.printf("Dedução INSS: %.2f %n", descontoinss);
                System.out.printf("Salário líquido: %.2f %n", salarioliq);
            }
        }
    }
}