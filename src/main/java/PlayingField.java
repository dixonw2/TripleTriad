import cards.Card;

public class PlayingField {
    private Card[] field;
    public PlayingField() {
        field = new Card[] {
                null, null, null,
                null, null, null,
                null, null, null
        };
    }

    public boolean addCard(Card curCard, int spot) {
        if (field[spot] != null)
            return false;
        else {
            field[spot] = curCard;

            return true;
        }
    }

}
