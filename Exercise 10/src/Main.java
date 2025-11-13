//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Display the company name using the static method
        Company.displayCompanyName();

        // Create an instance of Company to display the registration number
        Company myCompany = new Company("123456789");
        Company.displayRegNo(myCompany);
    }
}