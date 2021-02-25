import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExercicioFinal {
    public static class Estudante{
        public Estudante(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }

        String nome;
        int idade;

    }
    public static long ContaEstudantes(List<Estudante> estudantes){
        return estudantes.stream().count();
    }
    public static List<Estudante> MaiorDeIdade(List<Estudante> estudantes){
        return estudantes.stream().filter((estudante -> estudante.getIdade()>18 )).collect(Collectors.toList());
    }
    public static List<Estudante> EstudanteComLetraB(List<Estudante> estudantes) {
        return estudantes.stream().filter((estudante -> estudante.getNome().toLowerCase().contains("b"))).collect(Collectors.toList());
    }
    public static boolean EstudanteComLetraD(List<Estudante> estudantes) {
        return estudantes.stream().anyMatch((estudante -> estudante.getNome().toLowerCase().contains("d")));
    }
    public static Optional<Estudante> EstudanteMaisVelho(List<Estudante> estudantes) {
        return  estudantes.stream().max((a,b)-> a.getIdade()>b.getIdade() ? 1 : -1);
    }

    public static Optional<Estudante> EstudanteMaisNovo(List<Estudante> estudantes) {
        return  estudantes.stream().max((a,b)-> a.getIdade()>b.getIdade() ? -1 : 1);
    }
    public static void main(String[] args) {
        List<Estudante> estudantes = new ArrayList<Estudante>();
        estudantes.add(new Estudante("Rafael",25));
        estudantes.add(new Estudante("Laura",21));
        estudantes.add(new Estudante("Daniel",21));
        estudantes.add(new Estudante("Gabriel",23));
        estudantes.add(new Estudante("Jeff", 29));
        System.out.println("Número de estudantes:");
        System.out.println(ContaEstudantes(estudantes));
        System.out.println("Estudantes maiores de idade:");
        MaiorDeIdade(estudantes).stream().forEach((estudante -> System.out.println(estudante.getNome()+ " - "+ estudante.getIdade())));
        System.out.println("Estudantes com a letra B");
        EstudanteComLetraB(estudantes).stream().forEach((estudante -> System.out.println(estudante.getNome())));
        EstudanteMaisVelho(estudantes).stream().forEach(estudante -> System.out.println(estudante.getNome()+ " - "+ estudante.getIdade()));
        EstudanteMaisNovo(estudantes).stream().forEach(estudante -> System.out.println(estudante.getNome()+ " - "+ estudante.getIdade()));
    }
}
