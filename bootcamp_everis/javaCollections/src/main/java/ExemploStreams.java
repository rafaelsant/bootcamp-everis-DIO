import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploStreams {
    public static void main(String[] args) {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Laura");
        estudantes.add("Rafael");
        estudantes.add("Daniel");
        estudantes.add("Gabriel");
        estudantes.add("Jeffit");

        System.out.println("Contagem"+ estudantes.stream().count());
        System.out.println("Maior numero de letras "+ estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor numero de letras "+ estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("Com letra R no nome "+ estudantes.stream()
                .filter((estudante)->estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Com letra L no nome"+ estudantes.stream()
        .filter((estudante)->estudante.toLowerCase().contains("l")).collect(Collectors.toList()));
        System.out.println("Teste com Map"+ estudantes.stream().map((estudante)->estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        System.out.println("Retorna os 3 primeiros nomes" + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Retorna todos os nomes");
        estudantes.stream().forEach(System.out::println);
        System.out.println("Retorna os elementos "+ estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("Retorna se alguem tem a letra W no nome: "+ estudantes.stream().allMatch((elemento)->elemento.contains("W")));
        System.out.println("Tem algum elemento com a minusculo no nome? "+ estudantes.stream().anyMatch((elemento)->elemento.contains("a")));
        System.out.println("Encontra o primeiro elemento da coleção:");
        estudantes.stream().findFirst().ifPresent(System.out::println);
        System.out.println("Operação encadeada:");
        System.out.println(estudantes.stream().peek(System.out::println)
        .map((estudante)->estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                //.filter((estudante)-> estudante.toLowerCase().contains("r"))
                //.collect(Collectors.toList())
                .collect(Collectors.groupingBy((estudante)->estudante.substring(estudante.indexOf("-") + 1)))
        );
    }
}
