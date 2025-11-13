//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creating objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCAT =  new Cat();

        //Calling the sound method
        myDog.sound();
        myCAT.sound();
    }
}