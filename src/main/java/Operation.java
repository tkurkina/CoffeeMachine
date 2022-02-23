import java.util.HashMap;
import java.util.Map;

public enum Operation {
    WATER("water"),
    MILK("milk"),
    COFFEE("coffee"),
    TURN_OFF("turn off"),
    RISTRETTO("ristretto"),
    ESPRESSO("espresso"),
    LUNGO("lungo"),
    CAPPUCCINO("cappuccino"),
    LATTE("latte");

    private String operation;

    Operation(String operation) {
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }

    private static final Map<String, Operation> BY_VALUE = new HashMap<>();

    static {
        for (Operation o : values()){
            BY_VALUE.put(o.operation, o);
        }
    }

    public static Operation getOperationByValue(String value) {
        return BY_VALUE.get(value);
    }
}
