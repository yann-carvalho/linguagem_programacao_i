public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno("Ana", 20, 12345);
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Aluno a4 = new Aluno("João", 28, 19088975);

        Professor p = new Professor("Adalberto", 49, 5250.50);

        System.out.println("ALUNO");
        System.out.println("Nome: " + a.getNome());
        System.out.println("Matrícula: " + a.getIdade());
        System.out.println("Idade: " + a.getMatricula());
        System.out.println("\n----------------------------------\n");
        System.out.println("PROFESSOR");
        System.out.println("Nome: " + p.getNome());
        System.out.println("Nome: " + p.getIdade());
        System.out.println("Salário: " + p.getSalario());
    }
}