public class PJ extends Pessoa {
    private int cpnj;

    public int getCpnj() {
        return cpnj;
    }

    public void setCpnj(int cpnj) {
        this.cpnj = cpnj;
    }

    public PJ(int cpnj) {
        this.cpnj = cpnj;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "Tipo: Pessoa Jurídica: " + cpnj;
    }

}
