// File for the class Person

public class Person {
    private String firstName;
    private String lastName;
    private int id; 

    // Person constructor
    public Person(String fname, String lname, int i) {
        firstName = fname;
        lastName = lname;
        id = i;
    }

    // First name setter
    public void setFirstName(String name) {
        firstName = name;
    }

    // First name getter
    public String getFirstName() {
        return firstName;
    }

    // Last name setter
    public void setLastName(String name) {
        lastName = name;
    }

    // Last name getter
    public String getLastName() {
        return lastName;
    }

    // Person id setter
    public void setId(int i) {
        id = i;
    }

    // Person id getter
    public int getId() {
        return id;
    }

    // Returns the object as a complete string
    @Override
    public String toString() {
        return "First name: " + firstName  + "  Last name: " + lastName + "  Id: " + id;
    }

    // Determines if two people are equal
    public boolean equals(Person p2) {
        return (firstName.equals(p2.firstName) && lastName.equals(p2.lastName) && id == p2.id);
    }
}