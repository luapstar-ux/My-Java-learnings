/**
 * In Java, an interface is like a contract with method names only (no bodies).
 * It can have constants and method signatures but no instance fields or constructors.
 * Classes implement interfaces to provide specific behaviors.
 **/
public class Main {
    public static void main(String[] args) {
        Playable myGuitaer = new Guitar();
        Playable mypiano = new Piano();

        myGuitaer.playSound();
        mypiano.playSound();
    }
}