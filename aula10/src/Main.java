import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CadastroPessoas cp = new CadastroPessoas();

        do {
            System.out.println("Opção (1): Pessoa Física\nOpção (2): Pessoa Jurídica");
            int i = s.nextInt();
            s.nextLine(); // Limpar o buffer do Enter

            switch (i) {
                case 1:
                    System.out.println("Informe seu nome: ");
                    String nomePF = s.nextLine();
                    System.out.println("Informe sua idade: ");
                    int idadePF = s.nextInt();
                    s.nextLine(); // Limpar o buffer do Enter
                    System.out.println("Informe seu CPF: ");
                    int cpf = s.nextInt();
                    s.nextLine(); // Limpar o buffer do Enter

                    Pessoa pf = new PF(cpf, nomePF, idadePF);
                    cp.cadastrarPessoa(pf);
                    break;
                case 2:
                    System.out.println("Informe a razão social: ");
                    String razaoSocial = s.nextLine();
                    System.out.println("Informe o CNPJ: ");
                    String cnpj = s.nextLine();
                    s.nextLine(); // Limpar o buffer do Enter

                    Pessoa pj = new PJ(cnpj, razaoSocial);
                    cp.cadastrarPessoa(pj);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println("Deseja cadastrar outra pessoa? (s/n)");
        } while (s.nextLine().equalsIgnoreCase("s"));

        cp.listar();
    }
}
