public class ObjectB {
    public static void main(String[] args) {
        //2.6 String Objects: Conctatenation, Literals, and more
        //Concatenation = Combining

        String name1 = new String("Michael Crothers");
        String name2 = "Nicole Crothers";
        //Strings are object references. They are not primitives. They are made up of characters        
        System.out.println("name1: " + name1 + " name2: " + name2);
        String firstName="Gwen";
        String lastName ="Stefani";
        String fullName = "";

        //fullName = firstName + lastName;
        fullName = firstName + " " + lastName;
        //fullName += firstName;
        //fullName += lastName;
        System.out.println("fullName: " +fullName);

        //Concatenation with primitives
        int ans = 42;
        System.out.println("The answer is " + ans + ".");

        //Escape sequences
        System.out.println("\"Why are you so far away?\", she said.");
        System.out.println("\\<- That is a backslash");
        System.out.println("\nI just printed a blank line");
        System.out.println("A\tB\tC");

        //2.7 String Methods
        System.out.println(fullName);
        System.out.println("fullName length: " + fullName.length());
        System.out.println("fullName substring 0,6: " + fullName.substring(0,6));
        System.out.println("fullName substring 0,5: " + fullName.substring(0,5));
        System.out.println("fullName substring 0,4: " + fullName.substring(0,4));
        System.out.println("fullName substring 0,3: " + fullName.substring(0,3));
        //Substtring format : starting index, ending endex + 1 
        System.out.println("fullName indexOf Stefani: " + fullName.indexOf("Stefani"));
        for(int i = fullName.length(); i>=1; i--) {
            System.out.println("fullName substring 0," + i+": " +fullName.substring(0,i));
        }

    }
}