import java.util.function.Supplier;

public class Suppliers {
    public static void main(String[] args) {
        Supplier<Pessoa> suppliers = Pessoa::new;
        System.out.println(suppliers.get());
    }
}

class Pessoa{
    private String name;
    private Integer age;

    public Pessoa(){
        name = "Rafael";
        age= 25;
    }
    //Implementa a resposta ddo toString para retornar a classe Pessoa
    @Override
    public String toString(){
        return String.format("nome:%s, idade:%d",name,age);
    }
}
