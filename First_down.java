
import java.io.*;
// import java.util.Scanner;


public class First_down {

	public static void main(String[] args) throws IOException {
		String CurLine = "";
	
	
		System.out.println("Hello,world" + "  And goodbye ");
		Message.showText();
		System.out.println("Type some shit");
		
		
			InputStreamReader converter = new InputStreamReader(System.in);
		
			 BufferedReader in = new BufferedReader(converter);
			 
	            while (!(CurLine.equals("quit"))){
	            CurLine = in.readLine();
	            
	            if (!(CurLine.equals("quit"))){
	             System.out.println("You typed: " + CurLine);
	         
	            }
	           
		}
	}

}
