import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("----------------------------");
        System.out.println("CADASTRO DE FUNCIONÁRIO");
        System.out.println("----------------------------");

        System.out.printf("Selecionea opção:");
        System.out.println("\n[1] Gerente\n[2] Diretor");
        System.out.println("----------------------------");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Gerente g = new Gerente();

                System.out.println("Insira seu nome:");
                g.setNome(sc2.next());

                System.out.println("Informe seu departamento:");
                g.setDepartamento(sc2.next());

                System.out.println("Informe seu salário:");
                g.setSalario(sc.nextDouble());

                System.out.println("GERENTE CADASTRADO(A) COM SUCESSO!");
                System.out.println(g.toString());
            break;

            case 2:
                Diretor d = new Diretor();

                System.out.println("Insira seu nome:");
                d.setNome(sc2.next());

                System.out.println("Informe a quantidade de ações que possui:");
                d.setAcoes(sc.nextInt());

                System.out.println("Informe seu salário:");
                d.setSalario(sc.nextDouble());

                System.out.println("DIRETOR(A) CADASTRADO(A) COM SUCESSO!");
                System.out.println(d.toString());
        }

    }
}