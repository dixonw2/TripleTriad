
public abstract class Card {
    private byte leftNum, topNum, rightNum, bottomNum;
    private String name;
    public Card(byte leftNum, byte topNum, byte rightNum, byte bottomNum, String name) {
        this.leftNum = leftNum;
        this.topNum = topNum;
        this.rightNum = rightNum;
        this.bottomNum = bottomNum;
        this.name = name;
    }



}
