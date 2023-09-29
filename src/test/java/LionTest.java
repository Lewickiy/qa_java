import com.example.Lion;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    @Test
    @DisplayName("Lion`s sex error test")
    @Description("Assert Throws if lion`s sex is other then \"Самец\" or \"Самка\",")
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion("other sex"));
    }

    @Test
    @DisplayName("Get kittens count test")
    @Description("getKittens() must return 1")
    public void checkKittenReturnsOne() throws Exception {
        int expectedKittens = 1;
        int actualKittens = new Lion("Самка").getKittens();
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    @DisplayName("Check food list")
    @Description("Must return {Животные, Птицы, Рыба}")
    public void checkFoodForLion() throws Exception {
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = new Lion("Самка").getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }
}
