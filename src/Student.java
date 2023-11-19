public class Student extends Person {
    private Status status;

    public enum Status {
        FRESHMAN, SOPHOMORE, JUNIOR, SENIOR
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, Status status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + "\nAddress" + this.address +
                "\nPhone Number: " + this.phoneNumber +
                "\nEmail Address: " + this.emailAddress + "\nStatus: " + this.status + "\n";
    }

}
