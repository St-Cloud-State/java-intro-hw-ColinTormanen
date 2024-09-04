import java.io.*;
import java.util.*;
import java.io.FileNotFoundException;

public class MyMain {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        LinkedList<Person> list = new LinkedList<Person>();
        Person p = new Person("Colin", "Tormanen", 12335);
        list.add(p);
        String fileName = "data.txt";
        InputStream input = new FileInputStream(fileName);
        store(input, list);
        display(System.out, list);
    }

    public static void store(InputStream input, LinkedList<Person> list) throws IOException {
        System.out.println(input.read());
    }

    public static void display(OutputStream output, LinkedList<Person> list) throws IOException {
        for(int i = 0; i < list.size(); i++){
            output.write(list.get(i).toString().getBytes());
        }

    }

    public static int find() {
        return 0;
    }
}