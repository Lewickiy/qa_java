import com.example.Feline;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    @Test
    @DisplayName("Check food list eat meat")
    @Description("Feline.eatMeat() must return {Животные, Птицы, Рыба}")
    public void checkFoodListEatMeat() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = new Feline().eatMeat();
        assertEquals("Food list doesn't match expected list"
                , expectedFood
                , actualFood);
    }

    @Test
    @DisplayName("Check family name value")
    @Description("Feline.getFamily() must return \"Кошачьи\"")
    public void checkFamilyNameValue() {
        String expectedFamily = "Кошачьи";
        String actualFamily = new Feline().getFamily();
        assertEquals("The received Family name does not match the one being checked"
                , expectedFamily
                , actualFamily);
    }

    @Test
    @DisplayName("Check count of kittens without parameters")
    @Description("Feline.getKittens() must return 1")
    public void checkGetKittensWithoutParameters() {
        int expectedKittens = 1;
        int actualKittens = new Feline().getKittens();
        assertEquals("When calling the getKittens() method without parameters, the value 1 should be returned"
                , expectedKittens
                , actualKittens);
    }
}
