public class TestSchoolRecords {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Student("Al", "665 Gum Gum Street", "303-555-5555", "example@example.com", Student.Status.SOPHOMORE),
                new Student("Bob", "245 Gynamasium Avenue", "555-134-2435", "whocares@whocares.com", Student.Status.FRESHMAN),
                new Faculty("Karen", "555 Very Rich Stret", "908-342-3413", "needstosupportadjunctrights@probablydoesnt.com", "Political Science", 1000000.00, "01-08-1994", "When the Harvets Moon is full", Faculty.Rank.SENIOR),
                new Faculty("John", "999 Neanderthal Dentition Court", "123-345-5432", "neanderthaltheethrule@iloveneanderthals.com", "Anthropology", 9999999.99, "05-03-2001", "Midnight on Leap Years Only", Faculty.Rank.JUNIOR),
                new Staff("Kelly", "3234234 Apartment Complex #6B", "342-345-2351", "couldreallyuseaparkingpass@parkingpassestooexpensive.com", "Anthropology", 35.06, "04-04-2014", "Copy Machine Tutor for professors"),
                new Staff("Jelly", "2314 Rundown Condo Lane", "425-356-3452", "noonecares@noonecares.com", "Liberal Arts", .02, "02-03-2020", "Communications Assistant")
        };
        for (Person record : people) {
            System.out.println(record.toString());
        }
        //I was unclear if i needed to call the onlyEmployees function or just build it, so here it is built.
        Person[] newArray = onlyEmployees(people);
        for (Person record : newArray) {
            if (record == null) {
                break;
            }
            System.out.println(record.toString());
        }
    }

    public static Person[] onlyEmployees(Person[] people) {
        int i = 0;
        Person[] employees = new Person[people.length];
        for (Person record : people) {
            if (record instanceof Staff || record instanceof Faculty) {
                employees[i] = record;
                i++;
            }
        }
        return employees;
    }
}
