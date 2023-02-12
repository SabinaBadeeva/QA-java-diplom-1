import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import praktikum.Bun;

public class BunTest {
    Bun bun;

    @Before
    public void setup() {
        bun = new Bun("red bun", 300.0F);
    }

    @Test
    public void bunGetName() {
        String actualName = bun.getName();
        Assert.assertEquals("red bun", actualName);
    }

    @Test
    public void bunGetPrice() {
        Float actualPrice = bun.getPrice();
        Assert.assertEquals(300.0F, actualPrice, 0);

    }

}
