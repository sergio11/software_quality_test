package sanchez.sanchez.sergio;

import static org.hamcrest.CoreMatchers.is;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.valid4j.errors.RequireViolation;
import sanchez.sanchez.sergio.ddi_08.calculator.impl.Calculator;

/**
 * @author Sergio Sánchez Sánchez
 */
public class CalculatorTest {
    
    private static Calculator calculator;
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Init Calculator Test Suite ...");
        // Creamos objeto calculator
        calculator = new Calculator();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Calculator Test Suite ...");
    }
    
    /**
     * Test unitario para verificar que la suma de dos números produce el resultado correcto.
     */
    @Test
    public void testWeVerifyThatTheSubtractionOfTwoNumbersProducesTheCorrectResult(){
        final Double result = calculator.subtract(5, 2);
        // Comprobamos que el resultado devuelto es 3
        assertThat(result, is(3.0));
    }    

    /**
     * Test unitario para comprobar que la suma de dos números produce el resultado esperado
     */
    @Test
    public void testWeCheckThatTheSumOfTwoNumbersGivesACorrectResult() { 
        final Double result = calculator.add(2, 2);
        // Comprobamos que el resultado devuelto es 4
        assertThat(result, is(4.0));
    }
    
    /**
     * Test unitario para comprobar que la multiplicación de dos números produce el resultado esperado
     */
    @Test
    public void testWeCheckThatTheMultiplyOfTwoNumbersGivesACorrectResult() { 
        final Double result = calculator.multiply(2, 2);
        // Comprobamos que el resultado devuelto es 4
        assertThat(result, is(4.0));
    }
    
    /**
     * Test unitario para comprobar que la división de dos números produce el resultado esperado
     */
    @Test
    public void testWeCheckThatTheDivideOfTwoNumbersGivesACorrectResult() { 
        final Double result = calculator.divide(10, 2);
        // Comprobamos que el resultado devuelto es 5
        assertThat(result, is(5.0));
    }

    /**
     * Test unitario para verificar que una división entre cero produce un error de programación.
     */
    @Test(expected = RequireViolation.class)
    public void testIllegalArgumentForADivisionBetweenZero() {
        // División entre cero.
        calculator.divide(2, 0);
        
    }
}
