package exercicio9;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import votacao.Votacao;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class ValidarIdadePorVotacao_Parametros {

    @Parameterized.Parameter(0) public String nome;
    @Parameterized.Parameter(1) public int anoDeNascimento;
    @Parameterized.Parameter(2) public String resultado;

    @Test
    public void validarObrigatoriedaDeDeVoto() {
        assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
    }

    @Parameterized.Parameters(name = " {0} | {1} | {2} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
//                { "Lucio", 2006, "Lucio voce nao pode votar" },
                { "Maria", 2005, "Maria voce nao pode votar" },
                { "Rodrigo", 2004, "Rodrigo seu voto e facultativo" },
                { "Joao", 2003, "Joao seu voto e facultativo" },
                { "Carla", 2002, "Carla seu voto e obrigatorio" },
                { "Jose", 1993, "Jose seu voto e obrigatorio" },
                { "Ana", 1950, "Ana seu voto e obrigatorio" },
                { "Pedro", 1947, "Pedro seu voto e facultativo" }
        });
    }
}
