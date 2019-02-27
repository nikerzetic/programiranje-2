
public class RazcepNaravnegaStevila {

	public static void main(String[] args) {
		razcep(1024);
		razcep(5761665);
	}
	
	public static void razcep(int n) {
		char operator = '=';
		System.out.print(n + " ");
		for (int d = 2; d * d <= n; d++) {
			int c = 0;
			while (n % d == 0) {
				n /= d;
				c++;
			}
			if (c > 0) {
				System.out.print(" " + operator + " " + d);
				if (c > 1) {System.out.print(" ^ " + c);
				operator = '+';
				}
			}
		}
		if (n > 1) System.out.print(" " + operator + " " + n);
		System.out.println();
	}

}
