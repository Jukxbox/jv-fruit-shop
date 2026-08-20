package core.basesyntax;

import core.basesyntax.FruitTransaction.Operation;

public interface OperationStrategy {
    OperationHandler get(Operation operation);
}
