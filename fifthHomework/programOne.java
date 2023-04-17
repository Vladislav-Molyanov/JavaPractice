package fifthHomework;
import java.util.ArrayList;
import java.util.HashMap;
// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.
public class programOne {
   public HashMap<String,ArrayList<String>> telephonesBook = new HashMap<>();
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> telephonesBook = new HashMap<>();

        addUser("Pasha",telephonesBook);
        addTelephone("Pasha", "89995550012",telephonesBook);
        addUser("Masha",telephonesBook);
        addTelephone("Masha", "9561712",telephonesBook);
        addUser("Alex", telephonesBook);
        addTelephone("Alex", "+11043568",telephonesBook);
        addUser("Alex",telephonesBook);
        addTelephone("Alex", "88005553535",telephonesBook);
        addUser("Elena",telephonesBook);
        addTelephone("Elena", "89272074017",telephonesBook);
        deleteUser("Alex", telephonesBook);

        System.out.println(telephonesBook);
        
    }
    public static void addUser(String name, HashMap<String,ArrayList<String>> book) {
        if (book.containsKey(name)) {
            return;
        }
        
        book.put(name, new ArrayList<>());
    }

    public static void addTelephone(String name, String telephone,HashMap<String,ArrayList<String>> book) {
        if (!book.containsKey(name)) {
            return;
        }

        ArrayList<String> tel = book.get(name);
        tel.add(telephone);
        book.put(name, tel);
    }

    public static void deleteUser(String user,HashMap<String,ArrayList<String>> book) {
        if (!book.containsKey(user)) {
            return;
        }

        book.remove(user);
    }
}

