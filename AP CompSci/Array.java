public class Array {
    public static void main(String[] args) {
        //6.1 Array Creation and Access
        int[] scores = new int[8];

        String name = "Michael";
        for(char letter: name.toCharArray()) {
            System.out.println(letter); 
        }
        // Assigning values
        scores[0] = 100;
        scores[1] = 90;
        scores[2] = 74;
        scores[3] = 24;
        scores[4] = 68;
        scores[5] = 20;
        scores[6] = 95;
        scores[7] = 91;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[0] + scores[1]);
        //Array of Strings
        //String[] args == Array of string arguments
        String[] names = new String[7];
        names[0] = "Jeff";
        names[1] ="Jenn";
        names[2] = "Dan";
        names[3] = "Fred";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

        // Array initializer list
        String[] cities ={"Wildwood", "Chicago", "Dallas"};
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        names[2] = "Daniel";
        System.out.println(cities[2] + "\n");
        //Array length
        System.out.println(cities.length);
        //No parentheses
        //6.2 Traversing arrays
        for(int i = 0; i<scores.length; i++) {
            System.out.println(scores[i]);
        }
        System.out.println();

        for(int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println();
        int f = 0;
        while(f<cities.length) {

            System.out.println(cities[f]);
            f++;
        }
        System.out.println();        
        for(int i =names.length-1;i>=0; i--) {
            System.out.println(names[i]);
        }
        System.out.println();

        //6.3 enhanced for loop: iterate through a loop without an index. For each thing in array do something
        for(int score: scores) {
            System.out.println(score);   
        }
        System.out.println();

        for(String city: cities) {
            System.out.println(city);
        }

        //6.4 Standard algorithms

        //Determining a max or min value
        int[] avgs = {34, 43,13, 57, 68, 21, 23, 78, 98, 93};
        int max = avgs[0];
        for(int i = 1; i <avgs.length; i++) {
            if(avgs[i] > max){
                max = avgs[i];
            }
        }
        System.out.println("The max is " +max);
        
        //Compute sum or average
        double[] prices = {4.22, 43.99, 2.00, 3.53, 12.54, .45, 15.44};
        double sum = 0.0;
        double average = 0.0;
        for(double price: prices){
            sum +=price;
        }
        System.out.println(sum);
        average = sum/prices.length;
        System.out.println(average);
        System.out.println();
        
        //Determine if element has a property
        boolean isOverTen = false;
        for(double price: prices) {
            if(price > 9.999) {
             isOverTen = true;   
            }
        }
        System.out.println(isOverTen);
                

    }
}