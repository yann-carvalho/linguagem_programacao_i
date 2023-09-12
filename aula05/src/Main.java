import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Escolha uma opção:\n(1) para aluno\n(2) para professor\n");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Aluno pessoa = new Aluno();

                System.out.println("Informe seu nome: ");
                String nome = sc.next();

                System.out.println("Informe sua idade: ");
                int idade = sc.nextInt();

                System.out.println("Informe a primeira nota: ");
                double nota1 = sc.nextDouble();

                System.out.println("Informe a segunda nota: ");
                double nota2 = sc.nextDouble();

                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                pessoa.setNota1(nota1);
                pessoa.setNota2(nota2);

                System.out.println("Aluno cadastrado com sucesso.");
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("Nota 1: " + pessoa.getNota1());
                System.out.println("Nota 2: " + pessoa.getNota2());
                System.out.println("Média: " + pessoa.getMedia());
            break;

            case 2:
                Professor pessoaprof = new Professor();

                System.out.println("Informe seu nome: ");
                nome = sc.next();

                System.out.println("Informe sua idade: ");
                idade = sc.nextInt();

                System.out.println("Informe sua especialização: ");
                String especializacao = sc.next();

                System.out.println("Informe seu salário: ");
                double salario = sc.nextDouble();

                pessoaprof.setNome(nome);
                pessoaprof.setIdade(idade);
                pessoaprof.setEspecializacao(especializacao);
                pessoaprof.setSalario(salario);

                System.out.println("Professor cadastrado com sucesso.");
                System.out.println("Nome: " + pessoaprof.getNome());
                System.out.println("Idade: " + pessoaprof.getIdade());
                System.out.println("Especialização: " + pessoaprof.getEspecializacao());
                System.out.println("Salário: " + pessoaprof.getSalario());
        }
    }
}