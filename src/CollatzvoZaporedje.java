
public class CollatzvoZaporedje {

	public static void main(String[] args) {
		System.out.println("Dolzina: " + dolzina(6));
		System.out.println("Najvecji clen: " + najvecjiClen(6));
		System.out.print("Zaporedje: "); izpisiZaporedje(6);
	}
	
	public static int dolzina(int clen) {
		int stevec = 1;
		while (clen > 1) {
			if (clen % 2 == 0) clen /= 2;
			else clen = 3 * clen + 1;
			++stevec;
		}
		return stevec;
	}
	
	public static int naslednjiClen(int clen) {
		if (clen % 2 == 0) {return clen / 2;} else {return 3 * clen + 1;}
	}

	public static int najvecjiClen(int clen) {
		int najvecji = clen;
		while (clen > 1) {
			int naslednji = naslednjiClen(clen);
			if (naslednji > clen) najvecji = naslednji;
			clen = naslednji;
		}
		return najvecji;
	}
	
	public static void izpisiZaporedje(int clen) {
		System.out.print(clen + " ");
		while (clen > 1) {
			clen = naslednjiClen(clen);
			System.out.print(clen + " ");
		}
	}
	
}
