import java.util.Scanner;

public class ex02_somar {
    public static void main(String[] args) {
        
        Somar c = new Somar();
        try (Scanner sc = new Scanner(System.in)) {
            int n1, n2;
            System.out.println("Número 1: ");
            n1 = sc.nextInt();
            System.out.println("Número 2: ");
            n2 = sc.nextInt();
            System.out.println ("A soma dos números é: " + c.somar(n1, n2));
        }
    }
}