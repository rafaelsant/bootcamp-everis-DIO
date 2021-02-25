import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();
        notasAlunos.add(5.8);
        notasAlunos.add(5.3);
        notasAlunos.add(2.8);
        notasAlunos.add(1.3);
        notasAlunos.add(10.0);
        notasAlunos.add(5.7);
        System.out.println(notasAlunos);

        notasAlunos.remove(5.3);
        System.out.println(notasAlunos);
        System.out.println(notasAlunos.size());
        notasAlunos.add(null);
        Iterator<Double> iterator= notasAlunos.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Double nota: notasAlunos){
            System.out.println(nota);
        }
        notasAlunos.clear();

        System.out.println(notasAlunos.isEmpty());
    }
}
