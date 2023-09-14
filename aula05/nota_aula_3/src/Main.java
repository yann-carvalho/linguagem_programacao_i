import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo v = new Veiculo();

        System.out.println("Opção (1) para Carro\nOpção (2) para Moto");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                Carro c = new Carro();

                System.out.println("Insira a marca do carro: ");
                c.setMarca(sc.next());

                System.out.println("Informe o modelo");
                c.setModelo(sc.next());

                System.out.println("Informe ano fabricação");
                c.setAnoFabricacao(sc.nextInt());

                System.out.println("Informe o número de portas");
                int numPortas = sc.nextInt();
                c.setNumPortas(numPortas);

                System.out.println(c.toString());
                break;

            case 2:
                Moto m = new Moto();

                System.out.println("Insira a marca da moto: ");
                m.setMarca(sc.next());

                System.out.println("Informe o modelo");
                m.setModelo(sc.next());

                System.out.println("Informe ano fabricação");
                m.setAnoFabricacao(sc.nextInt());

                System.out.println("Informe o número de cilindradas");
                int cilindradas = sc.nextInt();
                m.setCilindradas(cilindradas);

                System.out.println(m.toString());
                break;
        }
    }
}