import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Veiculo ("Toyota", "Corolla", 2023, 139990.00);
        DecimalFormat format = new DecimalFormat("0.00");
        String precoFormatado = format.format(carro.getPreco());  // Formata o preço
        carro.setPreco(Double.parseDouble(precoFormatado)); // Atualiza o preço no objeto Veiculo
        System.out.println(carro.toString());
    }
}