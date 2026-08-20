package core.basesyntax;

public class ReturnOperation implements OperationHandler {
    @Override
    public int apply(int currentQuantity, int transactionQuantity) {
        return currentQuantity + transactionQuantity;
    }
}
