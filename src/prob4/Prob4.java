package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {

		char[] result = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			result[i] = str.charAt(str.length() - i - 1); 
		}

		return result;
	}

	public static void printCharArray(char[] array) {
		System.out.println(array);
	}
}
