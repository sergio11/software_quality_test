package sanchez.sanchez.sergio.ddi_08.calculator.impl;

import static org.valid4j.Assertive.*;
import sanchez.sanchez.sergio.ddi_08.calculator.ICalculator;

/**
 * @author Sergio Sánchez Sánchez
 */
public class Calculator implements ICalculator {

    /**
     * Permite sumar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public double add(double number1, double number2) {
        
        return number1 + number2;
    }

    /**
     * Permite restar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Permite multiplicar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Permite dividir dos números
     * @param number1
     * @param number2
     * @return 
     */
    public double divide(double number1, double number2) {
        require(number2 > 0, "The value (%f) must be positive", number2);
        return number1 / number2;
    }
    
    /**
     * Determina si un número es primo
     * @param number
     * @return 
     */
    public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
