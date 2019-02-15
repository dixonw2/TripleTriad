import org.junit.jupiter.api.*;
import cards.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayingFieldTests {
    PlayingField sut;

    @BeforeEach
    public void init() {
        sut = new PlayingField();
    }

    @Test
    public void givenNewPlayingField_WhenPlayNewCard_ThenTrue() {
        assertTrue(sut.addCard(new BasicCard(), 0));
    }
}
