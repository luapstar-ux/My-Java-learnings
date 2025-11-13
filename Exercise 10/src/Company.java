public class Company {
    // Static variable shared by all instances of Company
    private static String companyName = "Tech Innovations Inc.";

    // Final variable that cannot be changed once initialized
    private final String REG_NO;

    // Constructor to initialize the final variable
    public Company(String regNo) {
        this.REG_NO = regNo;
    }

    // Static method to display the company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Static method to display the registration number
    public static void displayRegNo(Company company) {
        System.out.println("Registration Number: " + company.REG_NO);
    }
}
