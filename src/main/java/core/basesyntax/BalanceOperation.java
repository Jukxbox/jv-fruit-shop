package core.basesyntax;

public class BalanceOperation implements OperationHandler {
    @Override
    public int apply(int currentQuantity, int transactionQuantity) {
        return transactionQuantity;
    }
}
