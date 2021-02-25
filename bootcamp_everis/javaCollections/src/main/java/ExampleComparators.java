import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExampleComparators {
    public static void main(String[] args) {
        List<Carro> carros = new ArrayList<>();
        carros.add(new Carro("sedan","Corsa","Chevrolet","Preto",1996));
        carros.add(new Carro("sedan","Fiesta","Ford","Prata",2010));
        carros.add(new Carro("hatch","KA","Ford","Preto",2010));
        carros.add(new Carro("caminhonete","S10","Chevrolet","Preto",2006));
        carros.add(new Carro("sedan","Voyage","Wolkswagen","Branco",2013));
        for (Carro ca: carros) {
            System.out.println(ca.ano+" "+ca.marca+" "+ca.cor+" "+ca.modelo+" "+ca.tipo);
        }
        System.out.println("Depois de ordenar:");
        carros.sort((first,seccond)-> first.getAno() - seccond.getAno());
        for (Carro ca: carros) {
            System.out.println(ca.ano+" "+ca.marca+" "+ca.cor+" "+ca.modelo+" "+ca.tipo);
        }
        System.out.println("Depois de ordenar 2:");
        carros.sort(Comparator.comparingInt(Carro::getAno));
        for (Carro ca: carros) {
            System.out.println(ca.ano+" "+ca.marca+" "+ca.cor+" "+ca.modelo+" "+ca.tipo);
        }
        System.out.println("Depois de ordenar 3:");
        carros.sort(Comparator.comparingInt(Carro::getAno).reversed());
        for (Carro ca: carros) {
            System.out.println(ca.ano+" "+ca.marca+" "+ca.cor+" "+ca.modelo+" "+ca.tipo);
        }
        System.out.println("Usando Collections.sort");
        Collections.sort(carros);
        for (Carro ca: carros) {
            System.out.println(ca.ano+" "+ca.marca+" "+ca.cor+" "+ca.modelo+" "+ca.tipo);
        }
    }
}
