import java.io.*;
public class Finder { 
	private String line1, line2, line3;
	private BufferedReader keyboard;
	private BufferedReader inStream;

	public static void main (String [] args) {
		Finder aFind = new Finder();     
		aFind.doSearch();
	} // end main

	private void doSearch() {
		keyboard = new BufferedReader(new InputStreamReader(System.in));
		String fileName = prompt("Type file to search: ");
		String wanted = prompt("Type string to find: ");
		line1 = "";
		line2 = "";
		try {
			inStream = new BufferedReader(new FileReader(fileName));
			while ((line3 = inStream.readLine()) != null) {
				if ( line2.indexOf(wanted) >= 0 ) {
					displayLine();
				}
				// advance to the next group of 3
				line1 = line2;
				line2 = line3;
				// and get new line3 from file...
			} // end while
			// check the last line
			line3 = "";                //remove null eof value
			if (line2.indexOf(wanted) >= 0) {
				displayLine();
			}
			inStream.close();
		} catch (IOException e) {
			System.err.println("Error in Finder: "+ e.toString());
			System.exit(1);
		} // end try catch
	} // end doSearch

	private void displayLine() {
		System.out.println("[=== context:");
		System.out.println(line1);
		System.out.println(line2);
		System.out.println(line3);
		System.out.println("===]");
		System.out.println("");
	} // end displayLine

	private String prompt(String message) {
		String reply = "";
		try {
			System.out.print(message);
			System.out.flush();
			reply = keyboard.readLine();
		} catch (IOException e) {
			System.err.println("Keyboard "+ e.toString());
			System.exit(2);
		} // end try catch
		return reply;
	} // end prompt
} // end class Finder
