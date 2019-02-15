package cards;

public abstract class Card {
    private char leftNum, topNum, rightNum, bottomNum;
    private String name;

    // TODO add player or some kind of ownership property

    public Card(char leftNum, char topNum, char rightNum, char bottomNum, String name) {
        this.leftNum = leftNum;
        this.topNum = topNum;
        this.rightNum = rightNum;
        this.bottomNum = bottomNum;
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

    public char getTopNum() {
        return topNum;
    }

    public char getLeftNum() {
        return leftNum;
    }

    public char getRightNum() {
        return rightNum;
    }

    public char getBottomNum() {
        return bottomNum;
    }

}
