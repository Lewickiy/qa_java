import com.example.Cat;
import com.example.Feline;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
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
    @DisplayName("Check cat`s sound")
    @Description("Cat.getSound must return \"Мяу\"")
    public void checkCatsSound() {
        String expectedSound = "Мяу";
        String actualSound = new Cat(feline).getSound();
        assertEquals("The sound made by the cat is not as expected"
                , expectedSound
                , actualSound);
    }

    @Test
    @DisplayName("Check food for cat")
    @Description("Cat.getFood() must return {Животные, Птицы, Рыба}")
    public void checkFoodForCat() throws Exception {
        List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = new Cat(new Feline()).getFood();
        assertEquals("Food list not as expected"
                , expectedFoodList
                , actualFoodList
        );
    }
}
