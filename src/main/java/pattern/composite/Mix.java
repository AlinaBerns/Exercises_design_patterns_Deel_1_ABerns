package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Mix implements Ingredient{

    private List<Ingredient> ingredientList;

    public Mix() {
        ingredientList = new ArrayList<>();
    }

    @Override
    public void mix() {
        for (Ingredient ingredient : ingredientList) {
            ingredient.mix();
        }
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        ingredientList.remove(ingredient);
    }
}
