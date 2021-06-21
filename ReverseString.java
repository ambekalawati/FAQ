package javaLearningPoint;

class ReverseString {
	public static void main(String[] args) {
		String input = "Hello World";
		String output = removeWhiteSpaces(input);
		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);
		System.out.println(output);
	}

	private static String removeWhiteSpaces(String input) {
		char[] characters = input.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for (char c : characters) {
			if (!Character.isWhitespace(c)) {
				buffer.append(c);
			}
		}
		return buffer.toString();
	}
}
