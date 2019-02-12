import org.junit.jupiter.api.*;
import cards.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTests {
    public Card basicCardSut;
    public Card perfectCardSut;

    @BeforeEach
    public void init() {
        basicCardSut = new BasicCard();
        perfectCardSut = new PerfectCard();
    }

    @Test
    public void givenNewBasicCard_WhenGetTopNum_Then1() {
        assertEquals(1, basicCardSut.getTopNum());
    }

    @Test
    public void givenNewPerfectCard_WhenGetLeftNum_ThenA() {
        assertEquals('A', perfectCardSut.getLeftNum());
    }

}
