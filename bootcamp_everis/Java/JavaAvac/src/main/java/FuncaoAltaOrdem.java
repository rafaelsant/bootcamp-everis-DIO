public class FuncaoAltaOrdem {
    public static void main(String[] args) {
        Calculo sum_ =(a,b)-> a+b;
        Calculo subtract =(a,b)-> a-b;
        Calculo multiply = (a,b)->a*b;
        Calculo divide =(a,b)-> a/b;
        System.out.println("Soma: "+executarOperação(sum_,1,3));
        System.out.println("Multiplicação: "+executarOperação(multiply,3,5));
        System.out.println("Subtração: "+executarOperação(subtract,1,3));
        System.out.println("Divisão: "+executarOperação(divide,12,23));
    }
    public static float executarOperação(Calculo calculo, float a, float b){
        return calculo.calculo(a,b);
    }
    interface Calculo{
        public float calculo(float a,float b);
    }
}
