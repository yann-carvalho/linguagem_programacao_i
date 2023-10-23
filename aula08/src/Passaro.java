public class Passaro extends Animal implements Comportamento {
    public Passaro(String nome, int idade, String genero, double peso, String especie, String habitat) {
        super(nome, idade, genero, peso, especie, habitat);
    }
    @Override
    public void Som() {
        System.out.println("Piu");
    }
    @Override
    public void Voar() {
        System.out.println("Estou voando");
    }
}
