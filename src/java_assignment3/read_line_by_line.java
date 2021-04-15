package java_assignment3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
 

public class read_line_by_line {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
        String line = "";
        String data = "";
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:\\js\\test.txt"));
             while (line != null)
             {
                if (line == null) {
                 break;}
               data += line;
                
               line = br.readLine();
                
                
            }
              System.out.println(data);
             br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Unable to read the file.");
        }

	}

}
