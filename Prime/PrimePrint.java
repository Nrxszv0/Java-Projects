import java.util.Scanner;
public class PrimePrint {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //primeCheck(43);
        System.out.println("Enter Prime Number Range");
        long nums = scan.nextLong();
        //boolean isPrime= true;
        for(long c =1; c<=nums;c++) {
            primeCheck(c);
        }
    }
    static void primeCheck(double num) {
        boolean isPrime= true;
        for(int i = 2; i<num;i++) {
        if((num / i) == ((int)(num/i))) {
             isPrime = false;
        }         
    }
        if(isPrime == true) {
            System.out.println((int)num +" is a prime number");
        }
        /*else {
            System.out.println((int)num + " is not a prime number");
        }*/
        
    }
}
