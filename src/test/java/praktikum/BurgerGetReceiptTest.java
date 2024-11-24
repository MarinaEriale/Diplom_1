package praktikum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerGetReceiptTest {
    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;

    @Test
    public void getReceiptTest () {
        Burger burger = new Burger();
        burger.setBuns(bun);
        Mockito.when(bun.getName()).thenReturn("red bun");
        Mockito.when(bun.getPrice()).thenReturn(300F);

        burger.addIngredient(ingredient);
        Mockito.when(ingredient.getType()).thenReturn(IngredientType.FILLING);
        Mockito.when(ingredient.getName()).thenReturn("sausage");
        Mockito.when(ingredient.getPrice()).thenReturn(300F);

        String expected = "(==== red bun ====)\r\n= filling sausage =\r\n(==== red bun ====)\r\n\r\nPrice: 900,000000\r\n";

        //System.out.println(expected);
        //System.out.println(burger.getReceipt());
        String actual = burger.getReceipt();

        Assert.assertEquals(expected, actual);


    }

}