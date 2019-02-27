
public class OdvodPolinoma {

	public static void main(String[] args) {
		double[] p1 = {1, 2, 3};
		double[] p2 = {4, -1, 2, 0, 1};
		double[] p3 = {1};
		double[] op1 = odvod(p1);
		double[] op2 = odvod(p2, 2);
		double[] op3 = odvod(p3);
		izpis(op1);
		izpis(op2);
		izpis(op3);
	}

	public static double[] odvod(double[] p, int n) {
		if (n > p.length) return new double[0];
		double[] op = new double[p.length - n];
		int f = 1;
		for (int i = 2; i <= n; ++i) f *= i;
		for (int i = n; i < p.length; ++i) {
			op[i - n] = f * p[i];
			f /= i - n + 1;
			f *= i + 1;
		}
		return op;
	}
	
	public static double[] odvod(double[] p) {
		return odvod(p, 1);
	}
	
	public static void izpis(double[] p) {
		for (int i = 0; i < p.length; ++i) System.out.print(p[i] + "x^" + i + " ");
		System.out.println();
	}
}
