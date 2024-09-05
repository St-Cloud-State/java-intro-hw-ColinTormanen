import java.util.*;
import java.io.*;

public class PersonList {

    // List of people
    private LinkedList<Person> list;

    // Constructor
    public PersonList() {
        list = new LinkedList<Person>();
    }

    // Stores a list of people into the linked list from an input stream
    public void store(InputStream input) throws IOException {
        Scanner sc = new Scanner(input);
        while(sc.hasNextLine()) {
            String data = sc.nextLine();
            String[] s = data.split(" ");
            Person p = new Person(s[0], s[1], Integer.parseInt(s[2]));
            list.add(p);
        }
    }

    // Displays all people in the list 
    public void display(OutputStream output) throws IOException {
        for(int i = 0; i < list.size(); i++){
            output.write(list.get(i).toString().getBytes());
            output.write('\n');
        }
    }

    // Attempts to find a person in the list
    // Returns index if found, else -1
    public int find(Person p) {
        for(int i = 0; i < list.size(); i++) {
            if(p.equals(list.get(i)))
                return i;
        }
        return -1;
    }

}