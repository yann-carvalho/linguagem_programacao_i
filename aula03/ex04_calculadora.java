import java.util.Scanner;

public class ex04_calculadora {
    public static void main(String[] args) {
        int n1, n2;
        Calculadora a = new Calculadora();
        Calculadora b = new Calculadora();
        Calculadora c = new Calculadora();
        Calculadora d = new Calculadora();
        try (Scanner sc = new Scanner(System.in)) {
            {
                do {
                    System.out.println("Opção 1 para Somar\nOpção 2 para Subtrair\nOpção 3 para Multiplicar\nOpção 4 para Dividir");
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            System.out.println("Insira o primeiro número: ");
                            n1 = sc.nextInt();
                            System.out.println("Insira o segundo número: ");
                            n2 = sc.nextInt();
                            System.out.println("A soma dos números é: " + a.somar(n1, n2));
                            break;
                        case 2:
                            System.out.println("Insira o primeiro número: ");
                            n1 = sc.nextInt();
                            System.out.println("Insira o segundo número: ");
                            n2 = sc.nextInt();
                            System.out.println("A subtração dos números é: " + b.subtrair(n1, n2));
                            break;
                        case 3:
                            System.out.println("Insira o primeiro número: ");
                            n1 = sc.nextInt();
                            System.out.println("Insira o segundo número: ");
                            n2 = sc.nextInt();
                            System.out.println("A multiplicação dos números é: " + c.multiplicar(n1, n2));
                            break;
                        case 4:
                            System.out.println("Insira o primeiro número ");
                            n1 = sc.nextInt();
                            System.out.println("Insira o segundo número: ");
                            n2 = sc.nextInt();
                            System.out.println("A divisão dos números informados é " + d.dividir(n1, n2));
                    }
                    System.out.println("Para escolher uma nova opção, digite 0");
                    n1 = sc.nextInt();
                } while (n1 == 0);
            }
        }
    }
}