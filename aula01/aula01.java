import java.util.Scanner;  // Import the Scanner class

public class aula01 {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Insira seu salário: ");
            double salario = myObj.nextDouble();

            if (salario == 900.00) {
                System.out.println("Isento");
            }
            else if ((salario > 900.00) && (salario <= 1500.00)) {
                System.out.println("Desconto 5%");
            }
            else if ((salario > 1500.00) && (salario <= 2500.00)) {
                System.out.println("Desconto 10%");
            }
            else if (salario > 2500.00) {
                System.out.println("Desconto 20%");
            }
        }

    }

}