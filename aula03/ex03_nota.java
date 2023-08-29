import java.util.Scanner;

public class ex03_nota {
    public static void main(String[] args) {
        Nota n = new Nota();
        try (Scanner sc = new Scanner(System.in)) {
            double n1, n2;
            System.out.println("Nota 1: ");
            n1 = sc.nextDouble();
            System.out.println("Nota 2: ");
            n2 = sc.nextDouble();
            System.out.printf("Sua média é: %.1f %n", n.calculo(n1, n2));

            if (n.calculo(n1, n2) >= 70){
                System.out.println("Você foi aprovado!");
            } else {
                System.out.println("Você está na final!");
            }
        }
    }
}
