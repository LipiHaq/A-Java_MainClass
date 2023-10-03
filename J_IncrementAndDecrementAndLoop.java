package A_package_1;

public class J_IncrementAndDecrementAndLoop {

	public static void main(String[] args) {
	
		// Incrementing a loop.
		for (int i = 0; i < 10; i++) {
		  System.out.println(i);
		}

		// Decrementing a loop.
		for (int i = 10; i > 0; i--) {
		  System.out.println(i);
		}

		// Incrementing a loop by 2.
		for (int i = 0; i < 10; i += 2) {
		  System.out.println(i);
		}

		// Decrementing a loop by 2.
		for (int i = 10; i > 0; i -= 2) {
		  System.out.println(i);
		}
		int i = 1;
		while (i <= 10) {
		  System.out.println(i);
		  i++;
		}
	}

}
