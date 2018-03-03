
package sanchez.sanchez.sergio;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import sanchez.sanchez.sergio.ddi_08.Main;

/**
 * Esta prueba de integración verifica el funcionamiento de un programa completo, 
 * un módulo o un conjunto de clases dependientes.
 * Esta prueba de integración usa reglas del sistema, 
 * una extensión para JUnit que le permite probar System.out y System.exit ()
 * 
 * @author Sergio Sánchez Sánchez
 */
public class CalculatorIT {
    
    @Rule
    public final StandardOutputStreamLog out = new StandardOutputStreamLog();
    
    public CalculatorIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Init Calculator Itegration test Suite ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Calculator Itegration test Suite ...");
    }

    /**
     * Test para verificar que la salida de la multiplicación es correcta
     */
    @Test
    public void testVerifyTheCorrectResultOfTheMultiplicationByTheStandardOutput() {
        // Solicitamos la múltiplicación de 2 X 5
        String[] args = { "MULTIPLY", "2.0", "5.0" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("MULTIPLICACIÓN: %f * %f = %f\n", 2.0, 5.0, 10.0);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    
    /**
     * Test para verificar que la salida de la suma es correcta
     */
    @Test
    public void testVerifyTheCorrectResultOfTheAddedByTheStandardOutput() {
        // Solicitamos la suma de 2 + 2
        String[] args = { "ADD", "2.0", "2.0" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("SUMA: %f + %f = %f\n", 2.0, 2.0, 4.0);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    /**
     * Test para verificar que la salida de la resta es correcta
     */
    @Test
    public void testVerifyTheCorrectResultOfTheSubtractionByTheStandardOutput() {
        // Solicitamos la resta de 6.0 - 3.0
        String[] args = { "SUBTRACT", "6.0", "3.0" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("RESTA: %f - %f = %f\n", 6.0, 3.0, 3.0);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    /**
     * Test para verificar que la salida de la división es correcta
     */
    @Test
    public void testVerifyTheCorrectResultOfTheDivisionByTheStandardOutput() {
        // Solicitamos la resta de 6.0 - 3.0
        String[] args = { "DIVIDE", "6.0", "2.0" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("DIVISIÓN: %f / %f = %f\n", 6.0, 2.0, 3.0);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    /**
     * test para verificar que la comprobación del número primo 3 produce el resultado correcto
     */
    @Test
    public void testVerifyThatCheckingThePrimeNumber3ProducesTheCorrectResult(){
        // Comprobamos número primo 3
        String[] args = { "IS_PRIME", "3" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("El número %d es primo\n", 3);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    /**
     * test para verificar que la comprobación del número no primo 4 produce el resultado correcto
     */
    @Test
    public void testVerifyThatCheckingTheNoPrimeNumber4ProducesTheCorrectResult(){
        // Comprobamos número primo 3
        String[] args = { "IS_PRIME", "4" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("El número %d no es primo\n", 4);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
    /**
     * test para comprobar que el décimo número primo produce el resultado correcto
     */
    @Test
    public void testVerifyThatTheTenthPrimeNumberProducesTheCorrectResult(){
        // Comprobamos número primo 3
        String[] args = { "GET_NTH_PRIME_NUMBER", "10" };
        // Iniciamos la ejecuón
        Main.main(args);
        // Configuramos el texto del resultado...
        final String textResult = String.format("El primo número %d es el número %d\n", 10, 23);
        assertThat(out.getLog(), is(equalTo(textResult)));
    }
    
}
