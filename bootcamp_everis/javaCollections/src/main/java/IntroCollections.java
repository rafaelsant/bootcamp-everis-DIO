import java.util.*;

public class IntroCollections {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Rafael");
        nomes.add("Laura");
        nomes.add("Gabriel");
        nomes.add("Daniel");
        nomes.add("Lucio");
        System.out.println(nomes);
        Collections.sort(nomes);
        System.out.println(nomes);
        nomes.set(0,"Adriana");
        System.out.println(nomes);
        try{
            nomes.remove(8);
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println(nomes);
        Iterator<String> iterator = nomes.iterator();
        System.out.println(nomes.get(1));


    }
}
