package Game;

import utilities.*;
import java.util.StringTokenizer;
public class TypeIt {  //inputs a sentence and breaks up into words
	private KeyboardReader readIt;  //new instance variable for Keyboard Reader : "readit"
	public TypeIt() {
		readIt = new KeyboardReader();  //makes the keyboard reader object and attaches it to "readit"
	}
	
	public void runIt() {  //encapsulates the application and is run in the main method below
		String sentence = "";   //new variable called sentence to hold the input text
		readIt.prompt("Please enter your sentence:");   //a line print command from the Keyboard reader class
		sentence = readIt.getKeyboardInput(); //the new object "readit" calls on the getKeyboardInput
		//string reader BufferedReader method             
		readIt.display("You typed: '" + sentence + "'");   //a line print command from the Keyboard reader class
		StringTokenizer st = new StringTokenizer(sentence);  //makes a new StringTokenizer object,
		//assigns it to the instance variable st
		//and runs it on the input sentence
		while (st.hasMoreTokens()) { //goes through all of the blank spaces till there are no more
			System.out.println(st.nextToken());//and prints each word
		}
	}
	
	public static void main(String args[]) {  //runs the "runIt" 
		TypeIt app = new TypeIt();  //creates a new object of the current class "TypeIt" and assigns it to the instance variable "app"
		app.runIt(); //runs the "runIt" constructor method
	}
}
