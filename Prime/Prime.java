import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime");
        double num = scan.nextDouble();
        boolean isPrime= true;
        for(int i = 2; i<num;i++) {
        if((num / i) == ((int)(num/i))) {
             isPrime = false;
        }   
        /*if((num / i) != ((int)(num/i))) {
             isPrime = true;
        } */      
        
    }
        if(isPrime == true) {
            System.out.println((int)num +" is a prime number");
        }
        else {
            System.out.println((int)num + " is not a prime number");
        }
    }
}
