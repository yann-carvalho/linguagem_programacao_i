import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Veiculo carro = new Veiculo ("Toyota", "Corolla", 2023, 139990.98889);
        DecimalFormat format = new DecimalFormat("0.00");
        String precoFormatado = format.format(carro.getPreco());
        carro.setPreco(Double.parseDouble(precoFormatado));
        System.out.println(carro.toString());
    }
}