import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class MyMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // PersonList to hold the people
        PersonList list = new PersonList();

        // File containing the list of people
        String fileName = "data.txt";

        // Input stream object
        InputStream input = new FileInputStream(fileName);

        // Storing the people in the data file in the linked list
        System.out.println("Initializing linked list");
        list.store(input);

        // Displaying the list of people 
        System.out.println("List of people:");
        list.display(System.out);


        //// Testing find \\\\

        // Test 1:
        Person p = new Person("jim", "john", 12346);
        System.out.println("\nSearching for: jim john 12346");
        int result = list.find(p);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should print
        else
            System.out.println("Person not found"); // Should not print
        
        // Test 2:
        p.setFirstName("john");
        p.setLastName("jim");
        System.out.println("\nSearching for: john jim 12346");
        result = list.find(p);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should not print
        else
            System.out.println("Person not found"); // Should print

        // Test 3: 
        p.setFirstName("terry");
        p.setLastName("smith");
        p.setId(12321);
        System.out.println("\nSearching for: terry smith 12321");
        result = list.find(p);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should print
        else
            System.out.println("Person not found"); // Should not print

    }// End of main


}