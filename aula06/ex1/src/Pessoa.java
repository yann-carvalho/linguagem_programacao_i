public class Pessoa {
    protected String nome;
    protected int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Pessoa(){

    }
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
