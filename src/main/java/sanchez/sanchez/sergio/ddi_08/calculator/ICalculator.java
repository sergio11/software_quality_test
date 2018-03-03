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
    Double add(double number1, double number2);
    
    /**
     * Permite restar dos números
     * @param number1
     * @param number2
     * @return 
     */
    Double subtract(double number1, double number2);
    
    /**
     * Permite multiplicar dos números
     * @param number1
     * @param number2
     * @return 
     */
    Double multiply(double number1, double number2);
    
    /**
     * Permite dividir dos números
     * @param number1
     * @param number2
     * @return 
     */
    Double divide(double number1, double number2);
    
    /**
     * Determina si un número es primo
     *
     * @param number
     * @return
     */
    Boolean isPrime(Integer number);
    
    
    /**
     * Devuelve el enésimo número primo
     * @param nth enésimo número solicitado
     * @return
     */
    Integer getNthPrimeNumber(Integer nth);
    
}
