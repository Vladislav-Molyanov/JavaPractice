package fourthHomework;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Stack;


//Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
public class programThird {
    public static void main(String[] args) {
        String ch = "({[]]})";
        Deque<Character> deque = new ArrayDeque<>();
        for (Character c : ch.toCharArray()) {
            deque.add(c);
        }
        System.out.println(deque);
        System.out.println(validate(deque));
    }
    static public boolean validate(Deque<Character> deque){
        Stack<Character> stack = new Stack<>();

        for (Character c : deque) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else if (c == ')' || c == '}' || c == ']'){
                if (stack.isEmpty()) {
                    return false;
                } 
            
            Character top = stack.pop();
            if (c == ')' && top != '(' ||
                c == '}' && top != '{' ||
                c == ']' && top != '[') {
                return false;
            }
        }
        }
        return stack.isEmpty();
    }
}
