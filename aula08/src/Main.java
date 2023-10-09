public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato("Abelardo", 3, "Masculino", 5.8, "Persa", "Casa");
        System.out.println("O nome do gato é " + gato.nome);
        gato.Som();
        gato.Correr();
        System.out.println("------------------------------------------------");
        Cachorro cachorro = new Cachorro("Jorge", 6, "Masculino", 15.5, "Rotweiller", "Casa");
        System.out.println("O nome do cachorro é " + cachorro.nome);
        cachorro.Som();
        cachorro.Correr();
        System.out.println("------------------------------------------------");
        Passaro passaro = new Passaro("Adilson", 21, "Masculino", 0.3, "Conversador de bosta", "Gaiola");
        System.out.println("O nome do pássaro é " + passaro.nome);
        passaro.Som();
        passaro.Voar();
    }
}