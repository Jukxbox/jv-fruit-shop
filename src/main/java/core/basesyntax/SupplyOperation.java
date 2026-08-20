package core.basesyntax;

public class SupplyOperation implements OperationHandler {
    @Override
    public int apply(int currentQuantity, int transactionQuantity) {
        return currentQuantity + transactionQuantity;
    }
}
