public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("João", 12345);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matricula: " + aluno.getMatricula());
    }
}