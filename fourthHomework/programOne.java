package fourthHomework;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;


// Дан Deque состоящий из последовательности цифр.
// Необходимо проверить, что последовательность цифр является палиндромом
public class programOne {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(1,2,3,3,2,1));
        Deque<Integer> deque2 = new ArrayDeque<>(Arrays.asList(1,2,3,4,5,6));

        System.out.println(checkOn(deque));
        System.out.println(checkOn(deque2));

    }
       static public boolean checkOn(Deque<Integer> deque){
            while (deque.size() > 1) {
                int first = deque.removeFirst();
                int last = deque.removeLast();
                if (first != last) {
                    return false;
                }
            }
            return true;
        }
}
