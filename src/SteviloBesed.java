import java.io.*;

public class SteviloBesed {

	public static void main(String[] args) throws IOException {
		int n = steviloBesed("src/SteviloBesed.java", "SteviloBesed.txt");
		System.out.println("Na datoteki je " + n + " besed.");
	}

	public static int steviloBesed(String imeVhodne, String imeIzhodne) throws IOException {
		
		int stevilo_besed = 0;
		
		BufferedReader vhodna = new BufferedReader(new FileReader(imeVhodne));
		PrintWriter izhodna = new PrintWriter(new FileWriter(imeIzhodne));
		
		while(vhodna.ready()) {
			String vrstica = vhodna.readLine().trim();
			if (vrstica.equals("")) continue;
			String[] besede = vrstica.split(" +");
			for (String beseda : besede) izhodna.println(beseda);
			stevilo_besed += besede.length;
		}
		
		vhodna.close();
		izhodna.close();
		
		return stevilo_besed;
		
	}
	
}
