public class Produto {
    protected String produto;
    protected double preço;
    protected String peça;

    public String getProduto() {
        return produto;
    }

    public double getPreço() {
        return preço;
    }

    public String getPeça() {
        return peça;
    }

    public Produto(String produto, double preço, String peça) {
        this.produto = produto;
        this.preço = preço;
        this.peça = peça;
    }

    @Override
    public String toString() {
        return "Produto: '" + produto + '\'' +
                ", Preço: " + preço +
                ", Peça: " + peça + '\'';
    }
}
