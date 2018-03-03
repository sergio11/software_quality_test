
package sanchez.sanchez.sergio.ddi_08.utils;

/**
 * @author Sergio Sánchez Sánchez
 */
public class Utils {
    
    /**
     * Comprueba si es un número decimal
     * @param str
     * @return 
     */
    public static boolean isDouble(final String str) {
        try {
            Double.parseDouble(str);
            return Boolean.TRUE;
        } catch (final NumberFormatException ex) {
            return Boolean.FALSE;
        }
    }
    
    /**
     * Comprueba si es un número entero
     * @param str
     * @return 
     */
    public static boolean isInteger(final String str) {
        try {
            Integer.parseInt(str);
            return Boolean.TRUE;
        } catch (final NumberFormatException ex) {
            return Boolean.FALSE;
        }
    }
    
}
