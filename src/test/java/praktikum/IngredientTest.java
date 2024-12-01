package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;

import static praktikum.constant.Delta.DELTA;

@RunWith(Parameterized.class)
public class IngredientTest {
   private final IngredientType type;
   private final String name;
   private final float price;

   public IngredientTest(IngredientType type, String name, float price) {
       this.type = type;
       this.name = name;
       this.price = price;
   }

    @Parameterized.Parameters
    public static Object[][] ingredientObject() {
        return new Object[][] {
                {SAUCE, "Соус", 5.51F},
                {FILLING, "Начинка", 7.12F},

        };
    }

    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(price, ingredient.getPrice(), DELTA);
    }

    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(name, ingredient.getName());
    }

    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        Assert.assertEquals(type, ingredient.getType());
    }

}