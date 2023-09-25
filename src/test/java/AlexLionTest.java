import com.example.AlexLion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Spy
    AlexLion alexLion;

    @Test
    public void isAlexLionHaveMane() {
        assertTrue("Alex the lion must have a mane"
                , alexLion.doesHaveMane()
        );
    }

    @Test
    public void checkFriendsList() {
        List<String> expectedFriendsList = Arrays.asList("Marty the zebra", "Gloria the hippopotamus", "Melman the giraffe");
        List<String> actualFriendsList = alexLion.getFriends();
        assertEquals("Alex's friends list isn't what you'd expect"
                , expectedFriendsList
                , actualFriendsList
        );
    }

    @Test
    public void checkPlaceOfLiving() {
        String expectedPlace = "Central Park Zoo";
        String actualPlace = alexLion.getPlaceOfLiving();
        assertEquals("Alex the lion lives in the Central Park Zoo"
                , expectedPlace
                , actualPlace
        );
    }

    @Test
    public void checkKittensCount() {
        int expectedKittens = 0;
        int actualKittens = alexLion.getKittens();
        assertEquals("According to the writers, Alex has no kittens"
                , expectedKittens
                , actualKittens
        );
    }
}
