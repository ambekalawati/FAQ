package stackDataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateParanthesis {
	private static List<String> getExpression() {
		List<String> expression = new ArrayList<>();
		expression.add("{");
		expression.add("(");
		expression.add("[");
		return expression;
	}

	public static boolean isValidExpression(String exp) {
		String[] split = exp.split("");
		Stack<String> stack = new Stack<>();
		for (int i = 0; i < split.length; i++) {
			if (getExpression().contains(split[i])) {
				stack.push(split[i]);
			} else {
				if (stack.size() > 0)
					stack.pop();
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		boolean exp = isValidExpression("[({})]");
		System.out.println(exp);
	}
}
