package exemplo.cicd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OperacoesTest {
    

    @Test
    public void check_can_sum_two_numbers(){
        int num1=10;
        int num2=11;
        int resp = num1+num2;

        Operacoes op = new Operacoes();

        int res = op.soma(num1, num2);

        assertEquals(res, resp);
    }
}
