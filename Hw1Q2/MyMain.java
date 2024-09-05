import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class MyMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Linked list to hold the list of people
        LinkedList<Person> list = new LinkedList<Person>();

        // File containing the list of people
        String fileName = "data.txt";

        // Input stream object
        InputStream input = new FileInputStream(fileName);

        // Storing the people in the data file in the linked list
        System.out.println("Initializing linked list");
        store(input, list);

        // Displaying the list of people 
        System.out.println("List of people:");
        display(System.out, list);


        //// Testing find \\\\

        // Test 1:
        Person p = new Person("jim", "john", 12346);
        System.out.println("\nSearching for: jim john 12346");
        int result = find(p, list);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should print
        else
            System.out.println("Person not found"); // Should not print
        
        // Test 2:
        p.setFirstName("john");
        p.setLastName("jim");
        System.out.println("\nSearching for: john jim 12346");
        result = find(p, list);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should not print
        else
            System.out.println("Person not found"); // Should print

        // Test 3: 
        p.setFirstName("terry");
        p.setLastName("smith");
        p.setId(12321);
        System.out.println("\nSearching for: terry smith 12321");
        result = find(p, list);
        if(result != -1)
            System.out.println("Person found at index " + result); // Should print
        else
            System.out.println("Person not found"); // Should not print

    }// End of main


    // Stores a list of people into the linkedlist from the input
    public static void store(InputStream input, LinkedList<Person> list) throws IOException {
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] s = data.split(" ");
            Person p = new Person(s[0], s[1], Integer.parseInt(s[2]));
            list.add(p);
        }
        
    }

    // Displays each person in the linked list to the output
    public static void display(OutputStream output, LinkedList<Person> list) throws IOException {
        for(int i = 0; i < list.size(); i++){
            output.write(list.get(i).toString().getBytes());
            output.write('\n');
        }

    }

    // Attempts to find a person in the linked list
    // Returns index if found, else -1
    public static int find(Person p, LinkedList<Person> list) {
        for(int i = 0; i < list.size(); i++) {
            if(p.equals(list.get(i)))
                return i;
        }
        return -1;
    }
}