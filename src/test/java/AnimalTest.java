import com.example.Animal;
import io.qameta.allure.Description;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Test
    @DisplayName("Check food list predator")
    @Description("Animal getFood with parameter \"Хищник\" must return {Животные, Птицы, Рыба}")
    public void checkFoodListPredator() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = new Animal().getFood("Хищник");
        assertEquals("Food list doesn't match expected list"
                , expectedFood
                , actualFood
        );
    }

    @Test
    @DisplayName("Check food list herbivore")
    @Description("Animal getFood with parameter \"Травоядное\" must return {Трава, Различные растения}")
    public void checkFoodListHerbivore() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");
        List<String> actualFood = new Animal().getFood("Травоядное");
        assertEquals("Food list doesn't match expected"
                , expectedFood
                , actualFood
        );
    }

    @Test
    @DisplayName("Check food list other type")
    @Description("Wrong sex should throw an exception")
    public void checkFoodListOtherType() {
        assertThrows(Exception.class, () -> new Animal().getFood("Wrong type"));
    }

    @Test
    @DisplayName("Get family of all animals")
    @Description("Animal.getFamily() must return: Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи")
    public void getFamilyOfAllAnimals() {
        String expectedFamilyOfAllAnimals = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamilyOfAllAnimals = new Animal().getFamily();
        assertEquals(expectedFamilyOfAllAnimals, actualFamilyOfAllAnimals);
    }

}
