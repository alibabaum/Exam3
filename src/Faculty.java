public class Faculty extends Employee {
    private String officeHours;
    private Rank rank;

    public enum Rank {
        JUNIOR, SENIOR
    }

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired, String officeHours, Rank rank) {
        super(name, address, phoneNumber, emailAddress, department, monthlySalary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return this.officeHours;
    }

    public Rank getRank() {
        return this.rank;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAddress" + this.address +
                "\nPhone Number: " + this.phoneNumber +
                "\nEmail Address: " + this.emailAddress + "\nDepartment: " +
                department + "\nMonthly Salary: $" + monthlySalary + "\nDate Hired:" +
                dateHired + "\nOffice Hours: " + this.officeHours + "Rank: " + this.rank + "\n";
    }
}
