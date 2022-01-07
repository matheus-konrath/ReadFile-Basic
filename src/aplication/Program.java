package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\matheus.konrath\\eclipse-workspace\\in.txt");
		Scanner sc = null;
		try {
			 sc = new Scanner(file);
			 while(sc.hasNextLine()) {		//Traverse the Text
				 String line = sc.nextLine(); // read line and go to the next
				 System.out.println(line);
			 }
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(sc != null) {
			sc.close();
			}
		}
		

	}

}
