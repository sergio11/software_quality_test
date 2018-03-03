package sanchez.sanchez.sergio.ddi_08;

import java.util.ArrayList;
import java.util.List;

/**
 * Listado de operaciones permitidas
 * @author Sergio Sánchez Sánchez
 */
public enum OperationEnum {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, 
    IS_PRIME, GET_NTH_PRIME_NUMBER;
    
    
    public static List<String> getAllValuesAsString() {

        final List<String> values = new ArrayList();

        for (final OperationEnum operation : OperationEnum.values()) {
            values.add(operation.name());
        }

        return values;

    }
}
