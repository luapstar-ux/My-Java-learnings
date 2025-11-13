//Outer Class
public class Outer {
    // Instance variable of the outer class
    private String outerFiled = "Outer Filed";

    //Inner class
    class Inner {
        // Method of the Inner class
        public void display(){
            System.out.println("Accessing: " + outerFiled);
        }
    }
    // Method to create an instance of Inner class
    public void createInner(){
        Inner inner = new Inner();
        inner.display();// Calling the method of inner class
    }
}
