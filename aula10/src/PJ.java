public class PJ extends Pessoa {
    private String cnpj;

    public PJ(String cnpj, String razaoSocial) {
    }

    public String getCnpj() {
        return cnpj;
    }

    public PJ() {
        super();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\nIdade: " + getIdade() + "\nTipo: Pessoa Jurídica\nCNPJ: " + cnpj;
    }
}
