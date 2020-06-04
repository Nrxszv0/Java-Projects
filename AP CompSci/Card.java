public class Card {
    private String name;
    private String suit;
    private int value;
    // 5.2 Constructors
    public Card() {
        System.out.println("I am a new card.");
    }
    public Card(String myName, String mySuit, int myValue) {
        name = myName;
        suit = mySuit;
        value = myValue;
        System.out.println("I am a " + name + " of " + suit + " with a value of " + value +".");
    }
    
    
}
