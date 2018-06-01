/*

Timothy Jou
CO SCI 290

- Lab 14

*/

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Lab14{

	public static void main(String[] args){
    
    String FILENAME = "Lab14Test.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String content = "Sauteed or grilled potatoes go well with fried chicken.";

			bw.write(content);

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}