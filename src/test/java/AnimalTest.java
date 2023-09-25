import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Test
    public void checkFoodListHerbivore() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = new Animal().getFood("Хищник");
        assertEquals("Food list doesn't match expected list"
                , expectedFood
                , actualFood
        );
    }

    @Test
    public void checkFoodListPredator() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");
        List<String> actualFood = new Animal().getFood("Травоядное");
        assertEquals("Food list doesn't match expected"
                , expectedFood
                , actualFood
        );
    }

    @Test
    public void checkFoodListOtherType() {
        assertThrows(Exception.class, () -> new Animal().getFood("Wrong type"));
    }

    @Test
    public void getFamilyOfAllAnimals() {
        String expectedFamilyOfAllAnimals = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyOfAllAnimals = new Animal().getFamily();
        assertEquals(expectedFamilyOfAllAnimals, actualFamilyOfAllAnimals);
    }

}
