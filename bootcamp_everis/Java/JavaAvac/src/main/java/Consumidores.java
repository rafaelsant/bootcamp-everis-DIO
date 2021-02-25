import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[] args) {
        Consumer<String> imprimirUmaFrase = frase -> System.out.println(frase);
        imprimirUmaFrase.accept("Imprime essa frase");
        Consumer<String> imprimirUmaFraseDeOutraForma = System.out::println;
        imprimirUmaFraseDeOutraForma.accept("Dessa forma também  vale");
    }
}
