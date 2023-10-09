public class Gato extends Animal implements Corrida {
    public Gato(String nome, int idade, String genero, double peso, String especie, String habitat) {
        super(nome, idade, genero, peso, especie, habitat);
    }
    @Override
    public void Som() {
        System.out.println("Miau");
    }
    @Override
    public void Correr() {
        System.out.println("Estou correndo!");
    }

}
