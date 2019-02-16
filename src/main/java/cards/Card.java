package cards;

public abstract class Card {
    private char[] nums;
    private String name;
    private boolean playerIsOwner = true;

    // TODO add player or some kind of ownership property

    public Card(char leftNum, char topNum, char rightNum, char bottomNum, String name) {
        nums = new char[] {leftNum, topNum, rightNum, bottomNum};
        this.name = name;
    }

    @Override
    public String toString() {
        return "-------\n"
             + "|  " + getTopNum() + "  |\n"
             + "|" + getLeftNum() + "   " + getRightNum() + "|\n"
             + "|  " + getBottomNum() + "  |\n"
             + "-------";
    }

    public void changeOwner() {
        playerIsOwner = !playerIsOwner;
    }

    public boolean playerIsOwner() {
        return playerIsOwner;
    }

    public char getTopNum() {
        return nums[0];
    }

    public char getLeftNum() {
        return nums[1];
    }

    public char getRightNum() {
        return nums[2];
    }

    public char getBottomNum() {
        return nums[3];
    }

    public String getName() {
        return name;
    }

    public boolean greaterThan(Card otherCard, int curDirection) {
        switch (curDirection) {

            // left
            case 0:
                if (this.getLeftNum() > otherCard.getRightNum())
                    return true;
                break;
            // top
            case 1:
                if (this.getTopNum() > otherCard.getBottomNum())
                    return true;
                break;
            // right
            case 2:
                if (this.getRightNum() > otherCard.getLeftNum())
                    return true;
                break;
            // bottom
            case 3:
                if (this.getBottomNum() > otherCard.getTopNum())
                    return true;
                break;
        }
        return false;
    }

}
