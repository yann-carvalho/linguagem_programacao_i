public class PF extends Pessoa {
    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public PF(int cpf, String nome, int idade) {
        super(nome, idade);
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo: Pessoa Física\nCPF: " + cpf;
    }
}
