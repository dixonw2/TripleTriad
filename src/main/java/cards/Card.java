package cards;

public abstract class Card {
    private int leftNum, topNum, rightNum, bottomNum;
    private String name;
    public Card(int leftNum, int topNum, int rightNum, int bottomNum, String name) {
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
             + "|" + getLeftNum() + "    " + getRightNum() + "|\n"
             + "|  " + getBottomNum() + "  |";
    }

    public char getTopNum() {
        if (topNum >= 'A')
            topNum = 'A';
        return (char) topNum;
    }

    public char getLeftNum() {
        if (leftNum >= 10)
            leftNum = 'A';
        return (char) leftNum;
    }

    public char getRightNum() {
        if (rightNum >= 'A')
            rightNum = 'A';
        return (char) rightNum;
    }

    public char getBottomNum() {
        if (bottomNum >= 'A')
            bottomNum = 'A';
        return (char) bottomNum;
    }

}
