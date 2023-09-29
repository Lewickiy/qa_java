import com.example.Lion;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionManeTest {

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean hasMane;

    @Parameterized.Parameters(name = "Sex of lion: {0}, has mane: {1}")
    public static Object[] testManeData() {
        return new Object[][] {
                {"Самец", true}
                , {"Самка", false}
        };
    }

    @Test
    @DisplayName("Parametrized test: \"Mane if sex...\"")
    public void ManeIfSexTest() throws Exception {
        assertEquals(new Lion(sex).doesHaveMane(), hasMane);
    }
}
