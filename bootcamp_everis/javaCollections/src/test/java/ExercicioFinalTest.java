import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class ExercicioFinalTest {
    List<ExercicioFinal.Estudante> estudantes = new ArrayList<ExercicioFinal.Estudante>();

    @Before
    public void criaEstudante(){
        this.estudantes.add(new ExercicioFinal.Estudante("Rafael",25));
        this.estudantes.add(new ExercicioFinal.Estudante("Laura",21));
        this.estudantes.add(new ExercicioFinal.Estudante("Daniel",21));
        this.estudantes.add(new ExercicioFinal.Estudante("Gabriel",23));
        this.estudantes.add(new ExercicioFinal.Estudante("Jeff", 29));
    }
    @Test
    public void ContaQuantidadeDeEstudantesTest(){
        long numero = ExercicioFinal.ContaEstudantes(estudantes);
        assertEquals(5,numero);
    }
    @Test
    public void FiltraIdadeSuperiorTest(){
        List<ExercicioFinal.Estudante> maiorDeIdade = ExercicioFinal.MaiorDeIdade(estudantes);
        assertEquals(estudantes,maiorDeIdade);
    }
    @Test
    public void EstudanteComLetraBTest(){
        List<ExercicioFinal.Estudante> estudanteComB = ExercicioFinal.EstudanteComLetraB(estudantes);
        assertEquals(estudanteComB.get(0),estudantes.get(3));
    }
    @Test
    public void EstudanteComLetraDNoNomeTest(){
        boolean estudanteComD = ExercicioFinal.EstudanteComLetraD(estudantes);
        assertEquals(estudanteComD, true);
    }
    @Test
    public void RetornaMaisVelho(){
        Optional<ExercicioFinal.Estudante> maisVelho = ExercicioFinal.EstudanteMaisVelho(estudantes);
        assertEquals(maisVelho.get(),estudantes.get(4));
    }
    @Test
    public void RetornaMaisNovo(){
        Optional<ExercicioFinal.Estudante> maisNovo = ExercicioFinal.EstudanteMaisNovo(estudantes);
        assertEquals(maisNovo.get(),estudantes.get(1));
    }
}
