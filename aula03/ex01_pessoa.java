import java.util.Scanner;

public class ex01_pessoa {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        Pessoa p = new Pessoa();
        
        System.out.println("Insira sua idade: ");
        
        p.idade = sc.nextInt();

        p.niver();
        
        System.out.println("Atual: "+ p.idade);
    }
    }
}