package ingredientmanagement.service;

import org.springframework.stereotype.Service;
import ingredientmanagement.entity.StockValue;
import ingredientmanagement.entity.UnitEnum;
import ingredientmanagement.repository.StockMovementRepository;

import java.time.Instant;

@Service
public class StockMovementService {

    private final StockMovementRepository stockMovementRepository;

    public StockMovementService(StockMovementRepository stockMovementRepository) {
        this.stockMovementRepository = stockMovementRepository;
    }

    public StockValue getStockValueAt(Integer ingredientId, Instant at, UnitEnum unit) {
        return stockMovementRepository.getStockValueAt(ingredientId, at, unit);
    }
}