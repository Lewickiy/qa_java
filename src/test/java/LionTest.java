import com.example.Lion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionTest {
    @Test
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion("other sex"));
    }

    @Test
    public void checkKittenReturnsOne() throws Exception {
        int expectedKittens = 1;
        int actualKittens = new Lion("Самка").getKittens();
        assertEquals(expectedKittens, actualKittens);
    }

    @Test
    public void checkFoodForLion() throws Exception {
        List<String> expectedFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFoodList = new Lion("Самка").getFood();
        assertEquals(expectedFoodList, actualFoodList);
    }
}
