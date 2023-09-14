import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.printf("Selecione:\nOpção 1 para Gerente\nOpção 2 para Diretor\n");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Gerente g = new Gerente();

                System.out.println("Insira seu nome:");
                g.setNome(sc.next());

                System.out.println("Informe seu departamento:");
                g.setDepartamento(sc.next());

                System.out.println("Informe seu salário:");
                g.setSalario(sc.nextDouble());

                System.out.println(g.toString());
            break;

            case 2:
                Diretor d = new Diretor();

                System.out.println("Insira seu nome:");
                d.setNome(sc.next());

                System.out.println("Informe a quantidade de ações que possui:");
                d.setAcoes(sc.nextInt());

                System.out.println("Informe seu salário:");
                d.setSalario(sc.nextDouble());

                System.out.println(d.toString());
        }

    }
}