package java_assignment3;
import java.io.*;

public class fifth_main {

	
		

		
		    public static void main(String[] args) throws IOException {
		        CountReader cr = new CountReader(new FileReader("D:\\js\\e.txt"), 'e');
		        CountWriter cw = new CountWriter(new FileWriter("D:\\js\\fifth.txt"), 'e');
		        int c = 0;
		        while ((c = cr.read()) != -1) {
		            cw.write(c);
		        }
		        System.out.println(cr.getCount());   
		        System.out.println(cw.getCount());   
			cr.close();
			cw.close();
		    }
		

	}

