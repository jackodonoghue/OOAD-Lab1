public class Game {
    public static void main(String[] args) {
        Dice die1 = new Dice();

        Dice die2 = new Dice();

        die1.roll();
        die2.roll();

        if(die1.getFaceValue() + die2.getFaceValue() == 7)
            System.out.println("Winner" + (die1.getFaceValue() + die2.getFaceValue()));

        else
            System.out.println("Looser" + (die1.getFaceValue() + die2.getFaceValue()));
    }
}
