package core.basesyntax;

import java.util.List;
import java.util.Map;

public class ShopServiceImpl implements ShopService {
    private final OperationStrategy operationStrategy;

    public ShopServiceImpl(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }

    @Override
    public void process(List<FruitTransaction> transactions) {
        Map<String, Integer> fruits = Storage.getFruits();
        for (FruitTransaction transaction : transactions) {
            OperationHandler handler = operationStrategy.get(transaction.getOperation());
            int currentQuantity = fruits.getOrDefault(transaction.getFruit(), 0);
            int newQuantity = handler.apply(currentQuantity, transaction.getQuantity());
            fruits.put(transaction.getFruit(), newQuantity);
        }
    }
}
