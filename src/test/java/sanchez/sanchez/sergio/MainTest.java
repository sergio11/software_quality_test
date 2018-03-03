
package sanchez.sanchez.sergio;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.valid4j.errors.RequireViolation;
import sanchez.sanchez.sergio.ddi_08.Main;

/**
 * @author Sergio Sánchez Sánchez
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({System.class, Main.class})
public class MainTest {
    
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Init Main Test Suite ...");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Finish Main Test Suite ...");
    }

    /**
     * Test para verificar que la operación de raíz cuadrada no está soportada
     */
    @Test(expected = RequireViolation.class)
    public void testVerifyThatTheSquareRootOperationIsNotSupported() {
        String[] args = { "SQUARE_ROOT" };
        Main.main(args);
    }
    
    /**
     * Test para verificar que la operación de multiplicación está soportada
     */
    @Test
    public void testVerifyThatTheMultiplyOperationIsSupported() {
        String[] args = { "MULTIPLY", "1.0", "1.0" };
        Main.main(args);
    }
    
    /**
     * Test para verificar que no es posible sumar una cadena con un número con preción
     */
    @Test(expected = RequireViolation.class)
    public void testVerifyThatOnlyNumbersCanBeAdded() {
        String[] args = { "ADD", "HOLA", "2.0" };
        Main.main(args);
    }
    
    
    
    
    
}
