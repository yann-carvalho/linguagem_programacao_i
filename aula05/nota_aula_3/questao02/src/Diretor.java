public class Diretor extends Funcionario {
    private int acoes;

    public int getAcoes() {
        return acoes;
    }

    public void setAcoes(int acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        return "\nDIRETOR(A): " + nome +
                "\nQTDE AÇÕES: " + acoes +
                "\nSALÁRIO: " + salario;
    }
}
