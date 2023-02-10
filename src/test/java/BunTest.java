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
<<<<<<< HEAD
        String actualName = bun.getName();
        Assert.assertEquals("red bun", actualName);
=======
        String actual = bun.getName();
        Assert.assertEquals("red bun", actual);
>>>>>>> c43e08e (Final project Diplom-1)
    }

    @Test
    public void bunGetPrice() {
<<<<<<< HEAD
        Float actualPrice = bun.getPrice();
        Assert.assertEquals(300.0F, actualPrice, 0);
=======
        Float actual = bun.getPrice();
        Assert.assertEquals(300.0F, actual, 0);
>>>>>>> c43e08e (Final project Diplom-1)

    }

}
