package exercicio11;

import org.junit.Ignore;
import org.junit.Test;

public class IgnorarTestes {

    @Test
    public void teste1() {

    }

    @Test
    @Ignore
    public void testeIgnorado() {

    }

    @Test
    @Ignore(value = "Teste ignorado pelo motivo XPTO")
    public void testeIgnoradoComMotivo() {

    }

}
