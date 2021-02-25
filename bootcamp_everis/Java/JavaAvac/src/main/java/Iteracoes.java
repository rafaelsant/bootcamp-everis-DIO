import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
    public static void main(String[] args) {
        String[] nomes = {"Rafael","Gabriel","Daniel","Laura","Luiza"};
        Integer[] numeros = {1,2,4,5,6,7};
        imprimirNomesFiltrados(nomes);
        Arrays.stream(nomes)
                .filter((name-> name.equals("Rafael")))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        imprimirDobroDeCadaNumero(numeros);
    }
    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir="";
        for (int i = 0; i < nomes.length;i++){
            if (nomes[i].equals("Rafael")){
                nomesParaImprimir+=nomes[i];
            }
        }
        System.out.println(nomesParaImprimir);
        String nomesParaImprimirDaStream =  Stream.of(nomes)
                .filter(nome->nome.equals("Rafael"))
                .collect(Collectors.joining());
        System.out.println(nomesParaImprimirDaStream);
    }
    public static void imprimirDobroDeCadaNumero(Integer... numero){
        Stream.of(numero).map(valor->valor*2).forEach(System.out::println);
    }
}
