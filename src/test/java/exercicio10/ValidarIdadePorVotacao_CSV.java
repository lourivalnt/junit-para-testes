package exercicio10;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import votacao.Votacao;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class ValidarIdadePorVotacao_CSV {

    @Test
    @FileParameters(value = "src/test/resources/massa_de_dados.csv", mapper = CsvWithHeaderMapper.class)
    public void validarObrigatoriedadeDeVoto(String nome, int anoDeNascimento, String resultado) {
        assertEquals(resultado, Votacao.podeVotar(nome, anoDeNascimento));
    }
}
