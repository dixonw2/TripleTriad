import org.junit.jupiter.api.*;
import cards.*;
import static org.junit.jupiter.api.Assertions.*;

public class PlayingFieldTests {
    PlayingField sut;
    Card enemyBasicCard;
    Card playerPerfectCard;
    Card geezardCard;

    @BeforeEach
    public void init() {
        sut = new PlayingField();
        enemyBasicCard = new BasicCard();
        enemyBasicCard.changeOwner();
        playerPerfectCard = new PerfectCard();
        geezardCard = new Geezard();
    }

    @Test
    public void givenNewPlayingField_WhenPlayNewCard_ThenTrue() {
        assertTrue(sut.addCard(enemyBasicCard, 0));
    }

    @Test
    public void givenNewPlayingField_WhenPlayCardInSpot0AndCardThere_ThenFalse() {
        sut.addCard(enemyBasicCard, 0);
        assertFalse(sut.addCard(playerPerfectCard, 0));
    }

    @Test
    public void givenPlayingFieldWithEnemyBasicCardAt0_WhenPlayPerfectCardAt3_ThenBasicCardPlayerIsOwnerTrue() {
        sut.addCard(enemyBasicCard, 0);
        sut.addCard(playerPerfectCard, 3);
        assertTrue(enemyBasicCard.playerIsOwner());
    }

    @Test
    public void givenPlayingFieldWithEnemyBasicCardAt0_WhenGeezardCardAt1_ThenBasicCardPlayerIsOwnerTrue() {
        sut.addCard(enemyBasicCard, 0);
        sut.addCard(geezardCard, 1);
        assertTrue(enemyBasicCard.playerIsOwner());
    }

    @Test
    public void givenPlayingFieldWithEnemyBasicCardAt0_WhenGeezardCardAt3_ThenBasicCardPlayerIsOwnerFalse() {
        sut.addCard(enemyBasicCard, 0);
        sut.addCard(geezardCard, 3);
        assertFalse(enemyBasicCard.playerIsOwner());
    }
}
