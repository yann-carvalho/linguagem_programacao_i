import java.text.DecimalFormat;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;
    protected double preco;

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    @Override
    public String toString() {

        DecimalFormat dec = new DecimalFormat("0.00");
        String precoFormatado = dec.format(preco);

        return "-----VEICULO-----\n" +
                "Marca: " + marca + "\n"+
                "Modelo: " + modelo + "\n" +
                "Ano: " + ano + "\n" +
                "Preço: " + precoFormatado;
    }
}
