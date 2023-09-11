public class Pessoa {

    private String nome;
    private double peso;
    private double altura;
    public int idade;

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getPeso() {
        return peso;
    }
    public void setAltura(double altura) {
        this.altura = altura;

    }
    public double getAltura() {
        return altura;
    }


    public double calculo(){
            return  (peso / (altura * altura));

    }
    public void niver() {
    }



}

