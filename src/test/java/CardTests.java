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

    @Test
    public void givenNewPerfectCard_WhenGetName_ThenPerfectCard() {
        assertEquals("Perfect Card", perfectCardSut.getName());
    }

    @Test
    public void givenBasicCard_WhenGreaterThanPerfectCardLeft_ThenFalse() {
        assertFalse(basicCardSut.greaterThan(perfectCardSut, 0));
    }

    @Test
    public void givenPerfectCard_WhenGreaterThanBasicCardLeft_ThenTrue() {
        assertTrue(perfectCardSut.greaterThan(basicCardSut, 0));
    }

    @Test
    public void givenPerfectCard_WhenGreaterThanBasicCardTop_ThenTrue() {
        assertTrue(perfectCardSut.greaterThan(basicCardSut, 1));
    }

    @Test
    public void givenBasicCard_WhenGreaterThanPerfectCardRight_ThenFalse() {
        assertFalse(basicCardSut.greaterThan(perfectCardSut, 2));
    }

    @Test
    public void givenPerfectCard_WhenGreaterThanBasicCardRight_ThenTrue() {
        assertTrue(perfectCardSut.greaterThan(basicCardSut, 2));
    }

    @Test
    public void givenPerfectCard_WhenGreaterThanBasicCardBottom_ThenTrue() {
        assertTrue(perfectCardSut.greaterThan(basicCardSut, 3));
    }

    @Test
    public void givenBasicCard_WhenOwnerIsPlayer_ThenTrue() {
        assertTrue(basicCardSut.playerIsOwner());
    }

    @Test
    public void givenBasicCard_WhenChangeOwner_ThenPlayerIsOwnerFalse() {
        basicCardSut.changeOwner();
        assertFalse(basicCardSut.playerIsOwner());
    }

    @Test
    public void givenBasicCard_WhenGreaterThanBasicCardLeft_ThenFalse() {
        assertFalse(basicCardSut.greaterThan(new BasicCard(), 0));
    }

    @Test
    public void givenBasicCard_WhenGreaterThanGeezardDown_ThenFalse() {
        assertFalse(basicCardSut.greaterThan(new Geezard(), 3));
    }

    @Test
    public void givenGeezardCard_WhenGreaterThanBasicCardUp_ThenFalse() {
        assertFalse(new Geezard().greaterThan(basicCardSut, 1));
    }

}
