

public class Person {
    private String firstName;
    private String lastName;
    private int id; 

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

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}