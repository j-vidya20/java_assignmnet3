package java_assignment3;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;


public class append_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "";
		try {
			File file = new File("D:\\js\\test.txt");
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter br = new BufferedWriter(fr);
			br.write("data to be appended at the end of the file");

			br.close();
			fr.close();
			System.out.println("the data is appended successfully.please check the file for changes");
			
	      } catch(IOException e){
	         e.printStackTrace();
	      }

	}

}
