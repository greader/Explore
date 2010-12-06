package utilities;

public class InputInteger extends KeyboardReader{
	
	 public int InputInteger(){  //The constructor method returns the keyboard input
		 return Integer.parseInt(readKeyboard());  //converts string to integer
	 }
	}
