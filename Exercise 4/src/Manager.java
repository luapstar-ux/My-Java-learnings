class Manager extends Employee {
    String department;

    Manager(String name, double salary,String department){
        super(name,salary); // Call to the base class constructor
        this.department = department;
    }

    void displayInfo(){
        super.displayInfo();// Call to the base class method
        System.out.println("Department:"+department);
    }
}

