package utilities;
import java.io.*;

public class InputString extends KeyboardReader{
	public String InputString(){  //The constructor method returns the keyboard input
		return readKeyboard(); //no conversion is necessary - already a string!
	}

}
