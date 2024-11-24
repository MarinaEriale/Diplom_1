package praktikum;

import org.junit.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BurgerTest {

    @Test
    public void setBunsTest () {
        Burger burger = new Burger();
        Bun bun = new Bun("red bun", 300);
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.getBuns());
    }

    @Test
    public void addIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        burger.addIngredient(ingredient);
        Assert.assertEquals(burger.ingredients, List.of(ingredient));
    }

    @Test
    public void removeIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();
        Ingredient ingredient_1 = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        burger.addIngredient(ingredient_1);
        Ingredient ingredient_2 = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        burger.addIngredient(ingredient_2);

        burger.removeIngredient(0);

        Assert.assertEquals(burger.ingredients, List.of(ingredient_2));
    }

    @Test
    public void moveIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();
        Ingredient ingredient_1 = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        burger.addIngredient(ingredient_1);
        Ingredient ingredient_2 = new Ingredient(IngredientType.SAUCE, "hot sauce", 100);
        burger.addIngredient(ingredient_2);
        Ingredient ingredient_3 = new Ingredient(IngredientType.SAUCE, "chili sauce", 300);
        burger.addIngredient(ingredient_3);

        List<Ingredient> testList = new ArrayList<>();
        testList.add(ingredient_1);
        testList.add(ingredient_2);
        testList.add(ingredient_3);

        testList.remove(0);
        testList.add(2, ingredient_1);

        burger.moveIngredient(0,2);

        Assert.assertEquals(testList, burger.ingredients);
    }

}