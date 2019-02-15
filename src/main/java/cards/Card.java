package cards;

public abstract class Card {
    private char[] nums;
    private String name;

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

}
