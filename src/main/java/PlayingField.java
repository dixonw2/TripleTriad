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
            // spot % 3 == 0 means it's on the left
            // spot % 3 == 1 means it's in the middle
            // spot % 3 == 2 means it's on the right
            return true;
        }
    }

}
