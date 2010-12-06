package utilities;

public class InputDouble extends KeyboardReader{
	
 public int InputDouble(){  //The constructor method returns the keyboard input
	 return Double.parseDouble(readKeyboard()); //Converts string to double
 }
}
