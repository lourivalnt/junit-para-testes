package exercicio12;

import org.junit.Test;
import static org.junit.Assert.*;

public class TempoExecucaoTeste {

    @Test(timeout = 1000)
    public void naoPassaPelotimeout() {
        assertTrue(true);
    }

    @Test(timeout = 1000)
    public void apresentaErroTimeout() throws InterruptedException {
        Thread.sleep(1001);
    }


}
