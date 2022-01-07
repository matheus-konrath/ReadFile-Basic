package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;


public class Program {

	public static void main(String[] args) {
		
		String path = ("C:\\Users\\matheus.konrath\\eclipse-workspace\\aulao002\\in.txt");
		
		List<Product> list = new ArrayList<Product>(); 
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				
			String line = br.readLine(); // read line
			line = br.readLine();
			while (line != null) {
				
				String[] vect = line.split(",");
				String name = vect[0];
				double price = Double.parseDouble (vect[1]);
				Integer qte = Integer.parseInt(vect[2]);
				
				Product prod = new Product(name,price,qte);
				list.add(prod);
				
				line = br.readLine();
				}
			System.out.println("Products: ");
			for (Product p : list) {		// para cada produto p da minha lista
				System.out.println(p);
			}
			
		}
		catch(IOException e) {
			System.out.println("Error" + e.getMessage());
		}
		 

	}

}
