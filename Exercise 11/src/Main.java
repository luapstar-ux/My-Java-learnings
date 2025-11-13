
public class Main {
    public static void main(String[] args) {
        // Creating an instance of Outer class
        Outer outer = new Outer();

        //Accessing the inner class method through the outer class
        outer.createInner();

        // Alternatively, creating an instance of Inner class directly
        Outer.Inner inner = outer.new Inner();
        inner.display(); // Calling  the method of Inner class
    }
}