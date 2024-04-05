import com.dam.chema.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Float.NaN;
import static java.lang.Float.POSITIVE_INFINITY;

public class CalculadoraTest {
    @Test
    public void testNumerosNegativos(){
        Assertions.assertEquals(-10, Calculadora.Operacion.operar(0,-5,-5,"Hola"));
    }
    @Test
    public void testSumaCero(){
        Assertions.assertEquals(2,Calculadora.Operacion.operar(0,0,1,"hola"));
    }
    @Test
    public void testRestaNegativo(){
        Assertions.assertEquals(-3,Calculadora.Operacion.operar(1,-1,-2,"hola"));
    }
    @Test
    public void testRestaPositivoNegativo(){
        Assertions.assertEquals(10,Calculadora.Operacion.operar(1,5,-5,"hola"));
    }
    @Test
    public void testMultiplicacionNegativos(){
        Assertions.assertEquals(30,Calculadora.Operacion.operar(2,-6,-5,"hola"));
    }
    @Test
    public void testMultiplicacionCero(){
        Assertions.assertEquals(0,Calculadora.Operacion.operar(2,50,0,"hola"));
    }
    @Test
    public void testDivisionCero(){
        Assertions.assertEquals(0,Calculadora.Operacion.operar(3,0,10,"hola"));
    }
    @Test
    public void testDivisionNegativo(){
        Assertions.assertEquals(-10,Calculadora.Operacion.operar(3,-30,10,"hola"));
    }
    @Test
    public void testRaizNumeroNegativo(){
        Assertions.assertEquals(NaN,Calculadora.Operacion.operar(4,2,-5,"hola"));
    }
    @Test
    public void testRaizCero(){
        Assertions.assertEquals(POSITIVE_INFINITY,Calculadora.Operacion.operar(4,5,0,"hola"));
    }
}
