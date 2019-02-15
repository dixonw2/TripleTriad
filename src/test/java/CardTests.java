import org.junit.jupiter.api.*;
import cards.*;
import static org.junit.jupiter.api.Assertions.*;

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
        assertEquals('1', basicCardSut.getTopNum());
    }

    @Test
    public void givenNewPerfectCard_WhenGetLeftNum_ThenA() {
        assertEquals('A', perfectCardSut.getLeftNum());
    }

    @Test
    public void givenNewBasicCard_WhenGetRightNum_Then1() {
        assertEquals('1', basicCardSut.getRightNum());
    }

    @Test
    public void givenNewPerfectCard_WhenGetBottomNum_ThenA() {
        assertEquals('A', perfectCardSut.getBottomNum());
    }

    @Test
    public void givenNewBasicCard_WhenCompareToString_ThenTrue() {
        assertTrue(basicCardSut.toString().equals("-------\n|  1  |\n|1   1|\n|  1  |\n-------"));
    }

}
