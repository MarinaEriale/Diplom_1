package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class BurgerPriceTest {

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    @Test
    public void getBunPriceTest () {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getPrice()).thenReturn(300F);
        Assert.assertEquals(600F, burger.getPrice(), 0);
    }

    @Test
    public void getIngredientPriceTest () {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getPrice()).thenReturn(300F);
        Assert.assertEquals(300F, burger.getPrice(), 0);
    }

}
