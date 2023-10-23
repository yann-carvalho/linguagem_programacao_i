public class PF extends Pessoa {
    private int cpf;

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public PF(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "Tipo: Pessoa Física: " + cpf;
    }
}
