import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    // Testes de Soma
    @Test
    void testSomarPositivos() {
        assertEquals(5, calculadora.somar(2, 3));
    }

    @Test
    void testSomarNegativos() {
        assertEquals(-2, calculadora.somar(-4, 2));
    }

    // Testes de Subtração
    @Test
    void testSubtrair() {
        assertEquals(2, calculadora.subtrair(5, 3));
    }

    // Testes de Multiplicação
    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
    }

    // Testes de Divisão
    @Test
    void testDividir() {
        assertEquals(2.5, calculadora.dividir(5, 2));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(5, 0));
    }
}

