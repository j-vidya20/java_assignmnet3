package java_assignment3;
import java.io.*;

public class carddWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		        Card card = new Card(12, Card.SPADES);
			System.out.println("Card to write is: " + card);

			try {
			    FileOutputStream out = new FileOutputStream("D:\\js\\card.out.txt");
			    ObjectOutputStream oos = new ObjectOutputStream(out);
			    oos.writeObject(card);
			    oos.flush();
			    oos.close();
			} catch (Exception e) {
			    System.out.println("Problem serializing: " + e);
			}
		    }
		

	}


