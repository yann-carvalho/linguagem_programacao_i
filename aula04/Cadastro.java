public class Cadastro {

    private String codigo;
    private String nome;
    private int quant;
    private int estoque;

    public void setCodigo() {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNome() {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getQuant() {
        return quant;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoque() {
        return estoque;
    }

    public int result() {
        int result = quant - estoque;
        return result;
    }
}