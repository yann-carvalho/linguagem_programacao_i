public class Main {
    public static void main(String[] args) {
        Pessoa aluno = new Aluno("Yann");
        System.out.println(aluno.getNome());
        Professor professor = new Professor("Angelo");
        System.out.println(professor.getNome());
    }
}