/****** Polymorphism overloading in Java means "multiple."
 It allows methods with the same name but different parameters to perform different tasks.
 ****/
public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        int sumInt = math.add(5, 10);
        System.out.println("Sum of two integers (5 + 10): " + sumInt);

        double sumDouble = math.add(5.5, 10.5);
        System.out.println("Sum of two doubles (5.5 + 10.5): " + sumDouble);

        int sumThreeInts = math.add(1, 2, 3);
        System.out.println("Sum of three integers (1 + 2 + 3): " + sumThreeInts);
    }
}


