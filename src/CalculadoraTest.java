import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    public void testDiferenca() {
        int resultado = Calculadora.diferenca(10, 5);
        int resultadoEsperado = 5;
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testDivisao() {
        int resultado = Calculadora.divisao(10, 2);
        int resultadoEsperado = 5;
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testProduto() {
        int resultado = Calculadora.produto(5, 2);
        int resultadoEsperado = 10;
        Assertions.assertEquals(resultadoEsperado, resultado);
    }

    @Test
    public void testSoma() {
        int resultado = Calculadora.soma(2, 3);
        int resultadoEsperado = 5;
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
}