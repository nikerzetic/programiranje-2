
public class MnozenjeMatrik {

	public static void main(String[] args) {
		double[][] A = {
				{1, 2, 3, 4},
				{3, 4, 5, 6},
				{5, 6, 2, 1}
		};
		double[][] B = {
				{1, 2, 5},
				{3, 4, 5}
		};
		printMatrix(zmnozi(A, B));
		printMatrix(zmnozi(B, A));
	}

	public static double[][] zmnozi(double[][] A, double[][] B) {
		if (A[0].length == B.length) {
			double[][] C = new double[A.length][B[0].length];
			for (int i = 0; i < A.length; i++) {
				for (int j = 0; j < B[0].length; j++) {
					double c = 0;
					for (int k = 0; k < B.length; k++) c += A[i][k] * B[k][j];
					C[i][j] = c;
				}
			}
			return C;
		}
		else return null;
	}
	
	public static void printMatrix(double[][] M) {
		if (M == null) System.out.println("null");
		else {
			for (int i = 0; i < M.length; i++) {
				for (int j = 0; j < M[0].length; j++) {
					System.out.print(M[i][j] + " ");
				}
				System.out.println();
			}
		}
	}
	
}
