public class Calculadora {
    int total;
    public int somar(int n1, int n2) {
        total = n1 + n2;
        return total;
    }
    public int subtrair(int n1, int n2) {
        total = n1 - n2;
        return total;
    }
    public int multiplicar(int n1, int n2) {
        total = n1 * n2;
        return total;
    }
    public int dividir(int n1, int n2) {
        total = n1 / n2;
        return total; 
    }
}
