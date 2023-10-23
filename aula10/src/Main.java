import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa pf = new PF();
        Pessoa pj = new PJ();
        CadastroPessoas cp = new CadastroPessoas();

        do {
            System.out.println("Opção (1): Pessoa Física\nOpção (2): Pessoa Jurídica");
            int i = s.nextInt();
            switch (i) {
                case 1:
                    System.out.println("Informe seu nome: ");
                    p.setNome(s.nextLine());
                    System.out.println("Informe sua idade: ");
                    p.setIdade(s.nextInt());
                    System.out.println("Informe seu CPF: ");
                    p.setCpf(s.nextInt());
                    break;
                case 2:
                    System.out.println("Informe a razão social: ");
                    System.out.println("Informe o CNPJ: ");
                    break;







        System.out.println("Digite o nome da pessoa a ser cadastrada: ");
        p.setNome(s.next());

        System.out.println("Digite a idade da pessoa a ser cadastrada: ");
        p.setIdade(s.nextInt());

        cp.cadastrarPessoa(p);

        cp.listar();

    }
}