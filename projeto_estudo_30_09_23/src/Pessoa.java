public abstract class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome.toUpperCase();
    }

    abstract String getNome();
}