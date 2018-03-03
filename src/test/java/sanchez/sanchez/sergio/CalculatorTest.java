package sanchez.sanchez.sergio;

import static org.hamcrest.CoreMatchers.is;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.valid4j.errors.RequireViolation;
import sanchez.sanchez.sergio.ddi_08.calculator.impl.Calculator;

/**
 * Unidad de pruebas para realizar pruebas 
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
    
    /**
     * Test Unitario para verificar que el número 5 es un número primo
     */
    @Test
    public void testVerifyThatTheNumber5IsAPrimeNumber(){
        assertEquals(Boolean.TRUE, calculator.isPrime(5));
    }
    
    /**
     * Test Unitario para verificar que el número 1 es un número primo
     */
    @Test
    public void testToVerifyThatTheNumber1IsAPrimeNumber(){
        assertEquals(Boolean.TRUE, calculator.isPrime(1));
    }
    
    /**
     * Test Unitario para verificar que el número 20 no es un número primo
     */
    @Test
    public void testVerifyThatTheNumber20IsAPrimeNumber(){
        assertEquals(Boolean.FALSE, calculator.isPrime(20));
    }
    
    /**
     * Test para verificar el séptimo número primo es 13
     */
    @Test
    public void testVerifyThatTheSeventhPrimeNumberIs13(){
        assertTrue("13 no es el séptimo número primo", calculator.getNthPrimeNumber(7).equals(13));
    }
    
    /**
     * Test para verificar que el cuarto número primo es el 5
     */
    @Test
    public void testVerifyThatTheFourthPrimeNumberIs5(){
        assertTrue("5 no es el cuarto número primo", calculator.getNthPrimeNumber(4).equals(5));
    }
    
    /**
     * Test para verificar que el n-ésimo número primo es devuelto desde cache
     */
    @Test
    public void testVerifyThatThePrimeNumberIsReturnedFromCache(){
        //Obtenemos primero el séptimo número primo
        assertTrue("13 no es el séptimo número primo", calculator.getNthPrimeNumber(7).equals(13));
        // Obtenemos el cuarto número primo debería ser obtenido desde cache
        assertTrue("5 no es el cuarto número primo", calculator.getNthPrimeNumber(4).equals(5));
        
    
    }
    
    /**
     * Test para verificar que el décimo número primo no es el 19
     */
    @Test
    public void testToVerifyThatTheTenthPrimeNumberIsNot19(){
        assertFalse("19 es el décimo número primo", calculator.getNthPrimeNumber(10).equals(19));
    }
    
    
    
}
