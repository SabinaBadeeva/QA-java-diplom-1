import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.FILLING;

public class IngredientTest {
    Ingredient ingredient;

    @Before
<<<<<<< HEAD
    public void setup() {
=======
    public void setupTest() {
>>>>>>> c43e08e (Final project Diplom-1)
        ingredient = new Ingredient(FILLING, "dinosaur", 200.0F);
    }

    @Test
    public void getPriceTest() {
<<<<<<< HEAD
        assertEquals("Price is incorrect", 200.0F, ingredient.getPrice(), 0);
=======
        assertEquals("Price is not correct", 200.0F, ingredient.getPrice(), 0);
>>>>>>> c43e08e (Final project Diplom-1)
    }

    @Test
    public void getNameTest() {
<<<<<<< HEAD
        assertEquals("Name is incorrect", "dinosaur", ingredient.getName());
=======
        assertEquals("Name is not correct", "dinosaur", ingredient.getName());
>>>>>>> c43e08e (Final project Diplom-1)
    }
}
