package core.basesyntax;

public class PurchaseOperation implements OperationHandler {
    @Override
    public int apply(int currentQuantity, int transactionQuantity) {
        return currentQuantity - transactionQuantity;
    }
}
