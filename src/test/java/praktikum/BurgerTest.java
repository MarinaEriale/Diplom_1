package praktikum;

import org.hamcrest.MatcherAssert;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;


import java.util.ArrayList;
import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {

    @Test
    public void setBunsTest () {
        Burger burger = new Burger();
        Bun bun = new Bun("red bun", 300);
        burger.setBuns(bun);
        Assert.assertEquals(bun, burger.getBuns());
    }

    @Mock
    Ingredient ingredient;

    @Test
    public void addIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();
        burger.addIngredient(ingredient);
        MatcherAssert.assertThat(burger.ingredients.size(), is(1));

    }

    @Test
    public void removeIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();
        burger.addIngredient(ingredient);

        burger.removeIngredient(burger.ingredients.size()-1);

        MatcherAssert.assertThat(burger.ingredients.size(), is(0));
    }

    @Test
    public void moveIngredientTest () {
        Burger burger = new Burger();
        burger.ingredients.clear();

        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);
        burger.addIngredient(ingredient);


        List<Ingredient> testList = new ArrayList<>();
        testList.add(ingredient);
        testList.add(ingredient);
        testList.add(ingredient);

        testList.remove(0);
        testList.add(2, ingredient);

        burger.moveIngredient(0,2);

        Assert.assertEquals(testList, burger.ingredients);
    }

}