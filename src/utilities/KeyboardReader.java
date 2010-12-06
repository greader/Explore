package utilities;

import java.io.*;
public class KeyboardReader {
	static private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	// creates a static variable "reader" of type BufferedReader
	//passes new System input into new InputStreamReaderobject 
	//and passes into new BufferedReader and
	//stores as "reader" variable

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
	public double inputDouble() {  //method returns the keyboard input
		return Double.parseDouble(readKeyboard()); //Converts string to double
	}
	public int inputInteger() {  //method returns the keyboard input
		return Integer.parseInt(readKeyboard());  //converts string to integer
	}
	public String inputString() {  //method returns the keyboard input
		return readKeyboard(); //no conversion is necessary - already a string!
	}
}