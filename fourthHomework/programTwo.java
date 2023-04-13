package fourthHomework;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.
// result [6,6,0,1]
public class programTwo {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1,2,3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5,4,7));

        System.out.println(sum(d1, d2));
    }
         static public Deque<Integer> sum(Deque<Integer> d1, Deque<Integer> d2) {
            Deque<Integer> result = new ArrayDeque<>();
            int carry = 0;
            while (!d1.isEmpty() || !d2.isEmpty() || carry > 0) {
                int sum = carry;
                if (!d1.isEmpty()) {
                    sum += d1.removeFirst();
                }
                if (!d2.isEmpty()) {
                    sum+= d2.removeFirst();
                }
                result.add(sum%10);
                carry = sum/10;
            }
            return result;
         }
}
