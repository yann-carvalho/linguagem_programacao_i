import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {

        Pessoa imc = new Pessoa();
        try (Scanner sc = new Scanner(System.in)) {

            double peso, altura;
            int r;
            do {
                System.out.println("------------------------------\n" + "\t\tCALCULADORA DE IMC" + "\n------------------------------" );

                System.out.println("Digite seu peso: ");
                imc.setPeso(sc.nextDouble());

                System.out.println("Digite sua altura");
                imc.setAltura(sc.nextDouble());


                System.out.printf("%.2f",imc.calculo());

                System.out.println("\n------------------------------------------------------------\n" +
                        "Para ver novamente, digite 0: ");
            r = sc.nextInt();
            } while (r == 0);


        }
    }
}