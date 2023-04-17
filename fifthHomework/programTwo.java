package fifthHomework;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
public class programTwo {
    public static void main(String[] args) {
        
    ArrayList<String> nameList = new ArrayList<>(Arrays.asList(
        "Иван Иванов",
        "Светлана Петрова",
        "Кристина Белова",
        "Анна Мусина",
        "Анна Крутова",
        "Иван Юрин",
        "Петр Лыков",
        "Павел Чернов",
        "Петр Чернышов",
        "Мария Федорова",
        "Марина Светлова",
        "Мария Савина",
        "Мария Рыкова",
        "Марина Лугова",
        "Анна Владимирова",
        "Иван Мечников",
        "Петр Петин",
        "Иван Ежов"));

        HashMap<String,Integer> counter = new HashMap<>();
        for ( var fullName : nameList) {
            String name = fullName.split(" ")[0];
            if (!counter.containsKey(name)) {
                counter.put(name, 0);
            }
            counter.put(name, counter.get(name)+1);
        }
        System.out.println(counter);

        ArrayList<HashMap.Entry<String,Integer>> sortedList = new ArrayList<>(counter.entrySet());
        sortedList.sort(HashMap.Entry.<String,Integer>comparingByValue().reversed());
        for (var entry : sortedList) {
            if (entry.getValue()>1) {
                System.out.println(entry.getKey() + "-" + entry.getValue());
            }
        }
    }
}
