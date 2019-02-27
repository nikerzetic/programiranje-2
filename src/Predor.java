import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Predor {

	public static void main(String[] args) throws IOException {
		int n = prekoracitveHitrosti("podatki.txt", "krsilci.txt");
		System.out.println("Zaznanih je bilo " + n + " krsitev.");
	}
	
public static int prekoracitveHitrosti(String imeVhodne, String imeIzhodne) throws IOException {
		
		int steviloKrsitev = 0;
		
		BufferedReader vhodna = new BufferedReader(new FileReader(imeVhodne));
		PrintWriter izhodna = new PrintWriter(new FileWriter(imeIzhodne));
		
		while(vhodna.ready()) {
			String vrstica = vhodna.readLine().trim();
			if (vrstica.equals("")) continue;
			String[] besede = vrstica.split(" ");
			int cas = Integer.parseInt(besede[1]) - Integer.parseInt(besede[0]);
			double povprecnaHitrost = 622.0 / cas * 3.6;
			if (povprecnaHitrost > 80.0) {
				double zaokrozeno = Math.round(povprecnaHitrost * 100.0) / 100.0;
				izhodna.println(besede[2] + " " + zaokrozeno);
				steviloKrsitev++;
			}
		}
		
		vhodna.close();
		izhodna.close();
		
		return steviloKrsitev;
		
	}

}
