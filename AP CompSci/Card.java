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
    //5.4 Accessor Methods
    public String getName() {
        return name;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public int getValue() {
        return value;
    }
    //5.5 Mutator Methods
    public void setName(String newName) {
        name = newName;
    }
    public void setSuit(String newSuit) {
        suit = newSuit;
    }
    public void setValue(int newValue) {
        value = newValue;
    }
    
}
