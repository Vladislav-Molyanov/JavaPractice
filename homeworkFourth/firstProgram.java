// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернет “перевернутый” список.

package homeworkFourth;

import java.util.*;
public class firstProgram {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int len = getNumberByUser("\nВведите количество элементов списка: ");
        LinkedList<Integer> numberList = new LinkedList<>();
        fillLinkedListNums(numberList, len);
        System.out.println(numberList.toString());

        numberList = reverseLinkedListNums(numberList);
                
        System.out.println("\nПеревёрнутый список:");
        System.out.println(numberList.toString());
    }

    
    public static int getNumberByUser(String text) {
        System.out.print(text);
        return input.nextInt();
    }

    
    public static void fillLinkedListNums(LinkedList<Integer> col, int count) {
        int index = 0;
        while (index < count) {
            col.add(index);
            index++;
        }
    }
        
    public static LinkedList<Integer> reverseLinkedListNums(LinkedList<Integer> colNums) {
        LinkedList<Integer> revColNums = new LinkedList<>();

        for (int i = colNums.size()-1; i >= 0; i--) {
            revColNums.add(colNums.get(i));
        }
        return revColNums;
    }
}
