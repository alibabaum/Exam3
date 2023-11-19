public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAddress" + this.address +
                "\nPhone Number: " + this.phoneNumber +
                "\nEmail Address: " + this.emailAddress + "\nDepartment: " +
                department + "\nMonthly Salary: $" + monthlySalary + "\nDate Hired:" +
                dateHired + "\nTitle: " + title + "\n";
    }
}
