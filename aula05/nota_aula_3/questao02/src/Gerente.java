public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public double getBonus() {
        double salario = getSalario();
        double bonussalario = salario * 0.1;
        bonus = salario + bonussalario;
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "departamento='" + departamento + '\'' +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                ", bonus=" + bonus +
                '}';
    }
}
