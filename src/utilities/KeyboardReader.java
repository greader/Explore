package utilities;

import java.io.*;

public class KeyboardReader {

	private BufferedReader reader;
	// creates an instance variable "reader" of type BufferedReader

	public KeyboardReader() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		//passes new System input into new InputStreamReaderobject 
		//and passes into new BufferedReader and
		//stores as "reader" variable
	}

	public String readKeyboard() {  //takes keyboard input and stores as local variable "line".
		String line = "";  //new variable called line to hold the keyboard input
		try {
			line = reader.readLine(); //an imported ReadLine method readLine
			                                          //passes the input to the new "reader" method
		} catch (IOException e) {  //if error in input then prints the error
			e.printStackTrace();
		}
		return line;  //the final input!!!
	}
	 public String getKeyboardInput() {
		return readKeyboard();
	  }

	
public void prompt (String s){  //prints string s
System.out.println(s);
}
public void display (String s){ //prints string s  (?Why does it have to be static?)
	System.out.println(s);
	}


}