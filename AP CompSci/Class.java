public class Class {
  public static void main(String[] args) {
      //5.1 Classes define objects which have attributes and behaviors
      //Class is a description of an object, a blueprint
      //Card
      //5.2 Constructors
      String name = new String("Bob Mould");
      Card card = new Card("King", "S", 10);
      Card card2 = new Card("Queen", "H", 11);
      
      //5.3 Document your code with comments
      //5.4 Accessor Methods- allows you to get a value from an object - Getters
      System.out.println(card.getName());
      System.out.println(card.getSuit());
      System.out.println(card.getValue() + "\n");
      System.out.println(card2.getName() + " " + card2.getSuit() + " " + card2.getValue());
      
      //5.5 Mutator Methods - Setters
      // Dont do this:card.suit = "D"; 
      card.setName("Ace");
      card.setSuit("S");
      card.setValue(1);
      
     
    }
} 
