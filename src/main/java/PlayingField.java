import cards.Card;

public class PlayingField {
    private Card[] field;
    public PlayingField() {
        field = new Card[] {
                null, null, null,   // 0 1 2
                null, null, null,   // 3 4 5
                null, null, null    // 6 7 8
        };
    }

    public boolean addCard(Card curCard, int spot) {
        if (field[spot] != null)
            return false;
        else {
            field[spot] = curCard;

            /*
             * Left column, will look at right, then up, then down
             * short circuits if there is no up or down
             * will then change ownership of card if card > othercard
             */
            if (spot % 3 == 0) {
                if (field[spot + 1] != null && curCard.greaterThan(field[spot + 1], 2) && !field[spot + 1].playerIsOwner())
                    field[spot + 1].changeOwner();
                if (spot - 3 >= 0 && field[spot - 3] != null && curCard.greaterThan(field[spot - 3], 1) && !field[spot - 3].playerIsOwner())
                    field[spot - 3].changeOwner();
                if (spot + 3 <= field.length && field[spot + 3] != null && curCard.greaterThan(field[spot + 3], 3) && !field[spot + 3].playerIsOwner())
                    field[spot + 3].changeOwner();
            }
            /*
             * middle column
             */
            if (spot % 3 == 1) {
                if (field[spot + 1] != null && curCard.greaterThan(field[spot + 1], 2) && !field[spot + 1].playerIsOwner())
                    field[spot + 1].changeOwner();
                if (field[spot - 1] != null && curCard.greaterThan(field[spot - 1], 0) && !field[spot - 1].playerIsOwner())
                    field[spot - 1].changeOwner();
                if (spot - 3 >= 0 && field[spot - 3] != null && curCard.greaterThan(field[spot - 3], 1) && !field[spot - 3].playerIsOwner())
                    field[spot - 3].changeOwner();
                if (spot + 3 <= field.length && field[spot + 3] != null && curCard.greaterThan(field[spot + 3], 3) && !field[spot + 3].playerIsOwner())
                    field[spot + 3].changeOwner();
            }
            /*
             * right column
             */
            if (spot % 3 == 2) {
                if (field[spot - 1] != null && curCard.greaterThan(field[spot - 1], 0) && !field[spot - 1].playerIsOwner())
                    field[spot - 1].changeOwner();
                if (spot - 3 >= 0 && field[spot - 3] != null && curCard.greaterThan(field[spot - 3], 1) && !field[spot - 3].playerIsOwner())
                    field[spot - 3].changeOwner();
                if (spot + 3 <= field.length && field[spot + 3] != null && curCard.greaterThan(field[spot + 3], 3) && !field[spot + 3].playerIsOwner())
                    field[spot + 3].changeOwner();
            }
            return true;
        }
    }

}
