import java.io.*;

class task2 {
	public static void main(String args[ ]) {
		long n = 600851475143L;
		int prime = 2;
		task2 IP = new task2();

		System.out.println("Start search max prime for " + n + "...");

		while (n != 1){
			if (n%prime == 0)
			    System.out.println(n + " / " + prime + " = " + (n=n/prime));
			else
			    while(!IP.isPrime(++prime)){};
		};

		System.out.println("Max prime = " + prime);

	}

	private boolean isPrime(long n){
		long d;

		for (d=2; d*d <= n; d++)
			if (n%d == 0) return false;

		return true;
	}
}