import java.io.*;

class task1 {
	public static void main(String args[ ]) {
		int sum = 2;
		int previous = 1;
		int current = 2;
		int newCurrent = 0;

		while (current <= 4000000){
			newCurrent = current + previous;
			previous = current;
			current = newCurrent;
			if (current%2 == 0) sum += current;
		};

		System.out.println("Sum: " + sum);

	}
}