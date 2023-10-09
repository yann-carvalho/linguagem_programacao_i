public abstract class Animal {
    protected String nome;
    protected int idade;
    protected String genero;
    protected double peso;
    protected String especie;
    protected String habitat;

    public Animal(String nome, int idade, String genero, double peso, String especie, String habitat) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.peso = peso;
        this.especie = especie;
        this.habitat = habitat;
    }

    public void Som() {

    }
}

