package sanchez.sanchez.sergio.ddi_08;

import static org.hamcrest.Matchers.hasItem;
import static org.valid4j.Assertive.*;
import sanchez.sanchez.sergio.ddi_08.calculator.ICalculator;
import sanchez.sanchez.sergio.ddi_08.calculator.impl.Calculator;
import sanchez.sanchez.sergio.ddi_08.utils.Utils;

/**
 * @author Sergio Sánchez Sánchez
 */
public class Main {
    
    static int EXIT_STATUS_FAILED = 4;
    
    /**
     * Sumar dos números
     *
     * @param num1
     * @param num2
     */
    private static void add(final Double num1, final Double num2) {

        final ICalculator calculator = new Calculator();
        //Sumamos ambos números
        final Double result = calculator.add(num1, num2);
        // Imprimimos el resultado
        System.out.println(String.format("SUMA: %f + %f = %f", num1, num2, result));

    }
    
    /**
     * Restar dos números
     *
     * @param num1
     * @param num2
     */
    private static void substract(final Double num1, final Double num2) {

        final ICalculator calculator = new Calculator();
        // Realizamos la resta de los números
        final Double result = calculator.subtract(num1, num2);
        // Imprimimos el resultado
        System.out.println(String.format("RESTA: %f - %f = %f", num1, num2, result));

    }
    
    /**
     * Multiplicar dos valores
     *
     * @param num1
     * @param num2
     */
    private static void multiply(final Double num1, final Double num2) {

        final ICalculator calculator = new Calculator();
        // Realizamos la multiplicación
        final Double result = calculator.multiply(num1, num2);
        // Imprimimos el resultado
        System.out.println(String.format("MULTIPLICACIÓN: %f * %f = %f", num1, num2, result));

    }
    
    /**
     * Divide dos valores
     *
     * @param num1
     * @param num2
     */
    private static void divide(final Double num1, final Double num2) {

        final ICalculator calculator = new Calculator();
        // Realizamos la división
        final Double result = calculator.divide(num1, num2);
        // Imprimimos el resultado
        System.out.println(String.format("DIVISIÓN: %f / %f = %f", num1, num2, result));

    }
    
    /**
     * Comprueba si es un número primo
     *
     * @param num1
     * @param num2
     */
    private static void isPrime(final Integer number) {

        final ICalculator calculator = new Calculator();
        // Comprueba si es un número primo
        final Boolean result = calculator.isPrime(number);
        
        // Imprimimos el resultado
        System.out.println(result ? String.format("El número %d es primo",number) 
                : String.format("El número %d no es primo",number));

    }
    
    /**
     * Obtiene el enésimo número primo
     *
     * @param num1
     * @param num2
     */
    private static void getNthPrimeNumber(final Integer nthNumber) {

        final ICalculator calculator = new Calculator();
        // Comprueba si es un número primo
        final Integer result = calculator.getNthPrimeNumber(nthNumber);
        
        // Imprimimos el resultado
        System.out.println(String.format("El primo número %d es el número %d", nthNumber, result));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // El primer argumento debe ser el tipo de aoperación
        require(OperationEnum.getAllValuesAsString(), hasItem(args[0]));

        switch (OperationEnum.valueOf(args[0])) {

            case ADD:
                require(Utils.isDouble(args[1]));
                require(Utils.isDouble(args[2]));

                add(Double.parseDouble(args[1]),
                        Double.parseDouble(args[2]));

                break;

            case SUBTRACT:

                require(Utils.isDouble(args[1]));
                require(Utils.isDouble(args[2]));

                substract(Double.parseDouble(args[1]),
                        Double.parseDouble(args[2]));

                break;

            case MULTIPLY:

                require(Utils.isDouble(args[1]));
                require(Utils.isDouble(args[2]));

                multiply(Double.parseDouble(args[1]),
                        Double.parseDouble(args[2]));

                break;

            case DIVIDE:

                require(Utils.isDouble(args[1]));
                require(Utils.isDouble(args[2]));

                divide(Double.parseDouble(args[1]),
                        Double.parseDouble(args[2]));

                break;

            case IS_PRIME:

                require(Utils.isInteger(args[1]));

                isPrime(Integer.parseInt(args[1]));

                break;

            case GET_NTH_PRIME_NUMBER:

                require(Utils.isInteger(args[1]));

                getNthPrimeNumber(Integer.parseInt(args[1]));

                break;

        }
    
    }

}
