package tp1_Ejercicio9;
import java.util.Stack;

public class TestBalanceo {

	public static boolean estaBalanceado (String s) {
		Stack <Character> stack = new Stack<>();
		
		for (char c : s.toCharArray()) {
		if (c == '(' || c == '[' || c == '{') {
			stack.push(c);
		}
		else {
			if (c == ')' || c == ']' || c == '}') {
				if (stack.isEmpty()) {
                    return false;
                }
				char tope = stack.pop();
				if ((c == ')' && tope != '(') || (c == ']' && tope != '[') || (c == '}' && tope != '{')) {
	                    return false;
				}
				
		    }
		
		}
		}
		return stack.isEmpty();
	}
	
}
