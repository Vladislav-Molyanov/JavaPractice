package thirdHomework;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

// 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class programTwo {
    private static Scanner input = new Scanner(System.in);
        public static void main(String [] args) {
            Scanner iScanner = new Scanner(System.in);
            System.out.println("Введите длину списка");
            int lengthList = iScanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>(lengthList);
            
            for (int i = 0; i < lengthList; i++) {
                System.out.println("Введите элемент списка");
                list.add(iScanner.nextInt());
            }

            System.out.println(list);
            removeEvenNumbers(list);
            System.out.println(list);

        }
        public static void removeEvenNumbers(ArrayList<Integer> colection) {
            Iterator<Integer> iterator = colection.iterator();
            while (iterator.hasNext()) {
                Integer elem = iterator.next();
                if (elem % 2 == 0) {
                    iterator.remove();
                }
            }
        }
}
