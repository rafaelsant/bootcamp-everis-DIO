package innovation.one.utils.operacao;

import innovation.one.utils.operacao.internal.DivHelper;
import innovation.one.utils.operacao.internal.MinHelper;
import innovation.one.utils.operacao.internal.MultHelper;
import innovation.one.utils.operacao.internal.SumHelper;

public class Calculadora {
    public DivHelper divHelper;
    public SumHelper sumHelper;
    public MinHelper minHelper;
    public MultHelper multHelper;

    public Calculadora(){
        divHelper = new DivHelper();
        sumHelper = new SumHelper();
        minHelper = new MinHelper();
        multHelper = new MultHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a,b);
    }
    public int subt(int a, int b){
        return minHelper.execute(a,b);
    }
    public int div(int a, int b){
        return divHelper.execute(a,b);
    }
    public int mult(int a, int b){
        return multHelper.execute(a,b);
    }
}
