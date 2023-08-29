import java.util.Scanner;

public class aula02 {
    public static void main(String[] args) {
        int x;
        try (Scanner sc = new Scanner(System.in)) {
            {
                do {
                    System.out.println(
                            "Opção 1 para compra de item;\nOpção 2 para solicitar valor produto ou serviço;\nOpção 3 para falar com atendente;\nOpção 0 para retornar ao menu principal.");
                    int i = sc.nextInt();
                    switch (i) {
                        case 1:
                            System.out.println("Opção 1: Compra item");
                            break;
                        case 2:
                            System.out.println("Opção 2: Solicitar valor do produto ou serviço");
                            break;
                        case 3:
                            System.out.println("Opção 3: Falar com atendente");
                            break;
                    }
                    System.out.println("Para ver novamente, digite 0");
                    x = sc.nextInt();
                } while (x == 0);
            }
        }
    }
}