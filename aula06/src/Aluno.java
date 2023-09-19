public class Aluno {

    protected String nome;
    protected int matricula;


    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public Aluno(String Nome, int Matricula) {
        this.nome = Nome;
        this.matricula = Matricula;
    }
}