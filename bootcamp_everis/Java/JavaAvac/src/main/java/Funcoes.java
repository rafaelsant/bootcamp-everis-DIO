import java.util.function.Function;

public class Funcoes {
    public static void main(String[] args) {
        Function<String, String> retornaOContrario = texto -> new StringBuilder(texto).reverse().toString();
        Function<String, Integer> converteStringParaInteiro = Integer::valueOf;
        System.out.println(retornaOContrario.apply("Meu nome é Rafael"));
        System.out.println(converteStringParaInteiro.apply("323232"));
    }
}
