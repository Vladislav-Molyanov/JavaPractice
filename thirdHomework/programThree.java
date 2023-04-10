package thirdHomework;

import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.List;


// 3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class programThree {
    public static void main(String[] arg) {
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(2,4,5,2,9,12,3,7));
        System.out.println(Collections.max(intList));// Вывод максимального элемента списка.
        System.out.println(Collections.min(intList));// Вывод минимального элемента списка.
        double avg = getAverage(intList);
        System.out.println(avg);
    }

    // Метод подсчитывающий среднее арифметическое
    public static double getAverage(List<Integer> list) {
        double sum = 0;
        double avg = 0;
        for (Integer i : list) {
            sum += i;
        }

        if (list.size() > 0) {
            avg = sum/list.size();
        }
        return avg;
    }
}
