import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkCatsSound() {
        String expectedSound = "Мяу";
        String actualSound = new Cat(feline).getSound();
        assertEquals("The sound made by the cat is not as expected"
                , expectedSound
                , actualSound);
    }

    @Test
    public void checkFoodForCat() throws Exception {
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = new Cat(new Feline()).getFood();
        assertEquals("Food list not as expected"
                , expectedFoodList
                , actualFoodList
        );
    }
}
