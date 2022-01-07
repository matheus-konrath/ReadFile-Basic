package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Program {

	public static void main(String[] args) {
		
		String path = ("C:\\Users\\matheus.konrath\\eclipse-workspace\\aulao002\\in.txt");
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine(); // read line
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		
		finally{
			try {
			br.close();
			fr.close(); 
			}
		
		catch(IOException e) {
			e.printStackTrace();
		}
	}

	}

}
