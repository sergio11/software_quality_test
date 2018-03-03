package sanchez.sanchez.sergio.ddi_08.calculator;

/**
 * @author Sergio Sánchez Sánchez
 */
public interface ICalculator {
    
    /**
     * Permite sumar dos números
     * @param number1
     * @param number2
     * @return 
     */
    double add(double number1, double number2);
    
    /**
     * Permite restar dos números
     * @param number1
     * @param number2
     * @return 
     */
    double subtract(double number1, double number2);
    
    /**
     * Permite multiplicar dos números
     * @param number1
     * @param number2
     * @return 
     */
    double multiply(double number1, double number2);
    
    /**
     * Permite dividir dos números
     * @param number1
     * @param number2
     * @return 
     */
    double divide(double number1, double number2);
    
     /**
     * Determina si un número es primo
     * @param number
     * @return 
     */
    boolean isPrime(int number);
    
}
