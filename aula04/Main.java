import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cadastro c = new Cadastro();
        try (Scanner sc = new Scanner(System.in)) {

            String codigo;
            String nome;
            int quant;
            int r;

            do{
                System.out.println("|-------------------------------------------------------------------------------|\n"
                        + "\t\t\t\t\t\t\tCadastro do produto"
                        + "\n|-------------------------------------------------------------------------------|");

                System.out.println("|Crie um código para o produto: ");
                codigo = sc.next();
                c.setCodigo();

                System.out.println("|Digite o nome do produto: ");
                nome = sc.next();
                c.setNome();

                System.out.println("|Digite a quantidade de unidades do produto a ser cadastrada no sistema:");
                quant = sc.nextInt();
                c.setQuant(quant);

                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("\t\t\t\tOs dados do produto foram cadastrados com sucesso!");

                System.out.println("|-------------------------------------------------------------------------------|\n"
                        + "\t\t\t\t\t\tCadastro de produto"
                        + "\n|-------------------------------------------------------------------------------|");
                System.out.println("\t\t\t\t\t\t|Código do produto: " + codigo + "|\n" +
                                    "\t\t\t\t\t\t|Nome do produto: " + nome + "|\n" +
                                    "\t\t\t\t\t\t|Unidades cadastradas: " + quant + "|\n");
                System.out.println("|-------------------------------------------------------------------------------|");

                System.out.println("\tDeseja realizar uma venda para decrementar a quantidade do produto?");
                System.out.println("|-------------------------------------------------------------------------------|");

                System.out.println("\tSe você quiser realizar a venda digite 1, se não, digite 0: ");
                int venda = sc.nextInt();
                System.out.println("|-------------------------------------------------------------------------------|");

                switch (venda) {
                    case 1:
                        System.out.println("\tQuantas unidades você deseja vender? ");
                        c.setEstoque(sc.nextInt());
                        System.out.println("|-------------------------------------------------------------------------------|");
                        System.out.println("|Após a venda, restam: "+ c.result() + " unidades do produto: " + nome + ".");
                        System.out.println("|-------------------------------------------------------------------------------|");
                        break;

                    case 0:
                        System.out.println("|-------------------------------------------------------------------------------|");
                        System.out.println("|Encerrando o programa...");
                        System.out.println("|-------------------------------------------------------------------------------|");
                        break;
                }
                System.out.println("\n|Se você deseja cadastrar mais um produto, digite 2, se deseja encerrar o programa digite 0");
                r = sc.nextInt();

            } while(r == 2); {
                if (r == 0){
                    System.out.println("|-------------------------------------------------------------------------------|");
                    System.out.println("|Encerrando o programa...");
                    System.out.println("|-------------------------------------------------------------------------------|");
                }
            }


        }

    }
}