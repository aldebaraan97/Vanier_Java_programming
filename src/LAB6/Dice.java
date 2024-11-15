package LAB6;

public class Dice {
     public Dice(){}

    public int roll() {
         return (int)((Math.random() * 5 + 1)  + (int)(Math.random() * 5 + 1));
    }
}
