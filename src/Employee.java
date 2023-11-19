public abstract class Employee extends Person {
    protected String department;
    protected double monthlySalary;
    protected String dateHired;

    public Employee(String name, String address, String phoneNumber, String emailAddress, String department, double monthlySalary, String dateHired) {
        super(name, address, phoneNumber, emailAddress);
        this.department = department;
        this.monthlySalary = monthlySalary;
        this.dateHired = dateHired;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public String getDateHired() {
        return this.dateHired;
    }

}
