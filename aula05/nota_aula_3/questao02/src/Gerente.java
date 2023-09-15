public class Gerente extends Funcionario {
    private String departamento;
    private double bonus;

    public double getBonus() {
        return bonus += (getSalario() * 0.1) + salario;
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
        return "\nGERENTE: " + nome +
                "\nDEPARTAMENTO: " + departamento +
                "\nSALÁRIO: " + salario +
                "\nNOVO SALÁRIO (bônus acrescido): " + getBonus();
    }
}
