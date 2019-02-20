
public class VseSeZacneZ1 {

	public static void main(String[] args) {
		System.out.println("Naslednji clen: " + naslednjiClen("111221"));
		printStringList(zaporedjeDolzine(10));
	}
	
	public static String naslednjiClen(String niz) {
		char trenutni = niz.charAt(0);
		int stevec = 1;
		String novNiz = "";
		for (int i = 1; i < niz.length(); i++) {
			char znak = niz.charAt(i);
			if (znak == trenutni) stevec++; 
			else {
				novNiz += Integer.toString(stevec) + trenutni;
				stevec = 1;
				trenutni = znak;
			}
		}
		return novNiz + Integer.toString(stevec) + trenutni;
	}
	
	public static String[] zaporedjeDolzine(int n) {
		String[] zaporedje = new String[n];
		zaporedje[0] = "1";
		for (int i = 1; i < n; i++) {
			zaporedje[i] = naslednjiClen(zaporedje[i-1]);
		}
		return zaporedje;
	}

	public static void printStringList(String[] stringList) {
		System.out.print("{");
		for (int i = 0; i < stringList.length - 1; i++) {
			System.out.print(stringList[i] + ", ");
		}
		System.out.print(stringList[stringList.length-1] + "}");
		System.out.println();
	}
}
