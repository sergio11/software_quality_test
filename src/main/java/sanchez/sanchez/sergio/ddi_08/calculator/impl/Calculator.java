package sanchez.sanchez.sergio.ddi_08.calculator.impl;

import java.util.ArrayList;
import java.util.List;
import static org.valid4j.Assertive.*;
import sanchez.sanchez.sergio.ddi_08.calculator.ICalculator;

/**
 * @author Sergio Sánchez Sánchez
 */
public class Calculator implements ICalculator {
    
    /**
     * Listado que contiene los número primos averiguados
     */
    private final List<Integer> primeNumbers = new ArrayList<>();

    /**
     * Permite sumar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public Double add(double number1, double number2) {
        
        return number1 + number2;
    }

    /**
     * Permite restar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public Double subtract(double number1, double number2) {
        return number1 - number2;
    }

    /**
     * Permite multiplicar dos números
     * @param number1
     * @param number2
     * @return 
     */
    public Double multiply(double number1, double number2) {
        return number1 * number2;
    }

    /**
     * Permite dividir dos números
     * @param number1
     * @param number2
     * @return 
     */
    public Double divide(double number1, double number2) {
        require(number2 > 0, "The value (%f) must be positive", number2);
        return number1 / number2;
    }
    
    /**
     * Determina si el número especificado como parámetro es un número primo
     * @param number
     * @return
     */
    public Boolean isPrime(final Integer number){

        if (number == 1) {

            return true;

        } else{

            for(int i = 2; i <= Math.sqrt(number); i++ ){

                if(number%i == 0) return false;
            }
            return  true;
        }
    }

    /**
     * Devuelve el enésimo número primo
     * @param nth enésimo número solicitado
     * @return
     */
    public Integer getNthPrimeNumber(final Integer nth){

        Integer primeNumber = null;

        // Comprobamos si podemos cubrir la búsqueda con los valores del listado
        if(primeNumbers.size() < nth) {

            // Obtenemos siguiente número a comprobar
            Integer nextNumber = !primeNumbers.isEmpty() ? primeNumbers.get(primeNumbers.size() - 1) + 1: 1;

            do {

                // Comprobamos si es un número primo
                if(isPrime(nextNumber))
                    primeNumbers.add(nextNumber);

                if(primeNumbers.size() == nth) {
                    // Guardamos este número primo que se acaba de determina
                    // como el número primo solicitado
                    primeNumber = nextNumber;
                } else {
                    nextNumber++;
                }

            } while(primeNumbers.size() < nth);



        } else {
            // Recuperamos el número primo del listado
            primeNumber = primeNumbers.get(nth - 1);

        }

        return primeNumber;
    }

}
