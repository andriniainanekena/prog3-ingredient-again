package ingredientmanagement.service;
import org.springframework.stereotype.Service;
import ingredientmanagement.entity.Ingredient;
import ingredientmanagement.entity.StockValue;
import ingredientmanagement.entity.UnitEnum;
import ingredientmanagement.repository.IngredientRepository;

import java.time.Instant;
import java.util.List;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;
    private final StockMovementService stockMovementService;

    public IngredientService(IngredientRepository ingredientRepository,
                             StockMovementService stockMovementService) {
        this.ingredientRepository = ingredientRepository;
        this.stockMovementService = stockMovementService;
    }

    public List<Ingredient> getIngredients() {
        return ingredientRepository.getIngredients();
    }

    public Ingredient getIngredientById(Integer id) {
        return ingredientRepository.getIngredientById(id);
    }

    public StockValue getStockAt(Integer ingredientId, Instant at, UnitEnum unit) {
        return stockMovementService.getStockValueAt(ingredientId, at, unit);
    }
}