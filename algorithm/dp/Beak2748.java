package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beak2748 {
	static long memo[];

	private static long fibonacci(int n) {
		if (n <= 1)
			return n;
		else if (n == 2)
			return 1;
		else {
			if (memo[n] > 0)
				return memo[n];
			else
				return memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		memo = new long[91];

		System.out.println(fibonacci(n));
	}
}
