// Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать программу, 
// которая найдет и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.

package homeworkFifth;

import java.util.*;
public class secondProgram {
    private static Random random = new Random();

    public static void main(String[] args) {
        HashMap<String, Integer> namesMap = new HashMap<>();
        LinkedHashMap<String, Integer> namesLHM = new LinkedHashMap<>();
        List<String> namesList = new ArrayList<>();
        
        String[] names = new String[] {"Влад", "Матвей", "Алексей", "Лена", "Арсений", "Сергей"};
        fillNamesList(namesList, names); 
        System.out.println(namesList);

        System.out.println("\nИмена с количеством повторений:");
        namesCountMap(namesMap, namesList);
        System.out.println(namesMap);

        System.out.println("\nСортировка имён по убыванию популярности:");
        sortNamesDescendingCount(namesMap, namesLHM);
        System.out.println(namesLHM);
    }

    
    private static void fillNamesList(List<String> nList, String[] nms) {
        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(6);
            nList.add(nms[index]);
        }
    }

    
    private static void namesCountMap(HashMap<String, Integer> nMap, List<String> nList) {
        for (int i = 0; i < nList.size(); i++) {
            if (! nMap.containsKey(nList.get(i))) {
                nMap.put(nList.get(i), 1);
            } else {
                Integer temp = nMap.get(nList.get(i)) + 1;
                nMap.replace(nList.get(i) , temp);
            }
        }
    }

    
    private static void sortNamesDescendingCount(HashMap<String, Integer> nMap,
     LinkedHashMap<String, Integer> nmLHM) {
        List<Map.Entry<String, Integer>> mappings = new ArrayList<>(nMap.entrySet());
        Collections.sort(mappings, Comparator.comparingInt(e -> -e.getValue()));

        for (Map.Entry<String, Integer> entry: mappings) {
            nmLHM.put(entry.getKey(), entry.getValue());
        }
    }
}
