public class PJ extends Pessoa {
    public int cpnj;

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    public PJ(int cpnj, String nome) {
        super(nome, cpnj);
        this.cpnj = cpnj;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "Tipo: Pessoa Jurídica: " + cpnj;
    }

}
