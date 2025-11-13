public class Student {
    private final String name;
    private final int  age ;
    private final String gender;

    //Constructor
    public Student(String name ,int age ,String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        printStudentDetails();
    }
    //Method to print student details
    private void printStudentDetails(){
        System.out.println("Student Details:");
        System.out.println("Name:"+name);
        System.out.println("Age: " +age);
        System.out.println("Gender:" +gender);
    }
}
