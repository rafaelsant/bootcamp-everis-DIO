import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {
    public static void main(String[] args) {
        Queue<String> filaBanco = new LinkedList<>();
        filaBanco.add("Pamela");
        filaBanco.add("Patrícia");
        filaBanco.add("Roberto");
        filaBanco.add("Flávio");
        filaBanco.add("Anderson");
        System.out.println(filaBanco);
        String clienteASerAtendido = filaBanco.poll();
        System.out.println(filaBanco);
        System.out.println(clienteASerAtendido);
        String primeiroCliente = filaBanco.peek();
        System.out.println(filaBanco);
        System.out.println(primeiroCliente);
        filaBanco.clear();
        try{
            String primeiroClienteOuErro = filaBanco.element();
            System.out.println(primeiroClienteOuErro);
        }catch (Exception e){
            System.out.println("Erro! "+ e);
        }
        System.out.println(filaBanco.poll());
    }
}
