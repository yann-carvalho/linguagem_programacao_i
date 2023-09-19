public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto ("Camisa", 49.99, "Camisa polo azul");
        Produto produto2 = new Produto ("Calça", 99.99, "Calça jeans preta");

        System.out.println(produto1.toString());
        System.out.println("--------------------------------------------------------");
        System.out.println(produto2.toString());

    }
}