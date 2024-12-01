package praktikum;

import org.junit.Assert;
import org.junit.Test;

import static praktikum.constant.Delta.DELTA;

public class BunTest {
    @Test
    public void getNameTest () {
        Bun bun = new Bun("Булочка с кунжутом", 51.99F);
        Assert.assertEquals("Булочка с кунжутом", bun.getName());
    }

    @Test
    public void getPriceTest () {
        Bun bun = new Bun("Булочка с кунжутом", 51.99F);
        Assert.assertEquals(51.99F, bun.getPrice(), DELTA);
    }
}