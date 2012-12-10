public class EvenString extends String{

	public void printEven(String str) {

		for (int x = 0; x < str.length(); x++) {
			if (isEven(x)) {
				System.out.println(str.charAt(x));
			}
		}
	}

	private boolean isEven(int x) {
		return (x % 2 == 0);
	}
}