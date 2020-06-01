public class ObjectsA {
    public static void main(String[] args) {
        //2.2 Constructors, Parameters, and Overloading
        Dog boo = new Dog("Boo");
        Dog star = new Dog("Star");
        /*2.3 Calling a void method
         *A void method does not return a value
         *A method can either receive or not receive a value
         *A method can either return or not return a value
         */
        boo.bark();
        star.bark();
        
        //2.4 Calling a void method with parameters
        boo.setName("Boo Crothers");
        
    }
}