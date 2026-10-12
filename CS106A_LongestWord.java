//CS106A_LongestWord
/***
 * File: CS106A_LongestWord.java
 * ------------------------------------------
 * The CS106A_LongestWord class returns the longest
 * word in a client provided string.
 * 
 */

import acm.program.*;
import java.util.*;

public class CS106A_LongestWord extends ConsoleProgram
{
	/*Named Constants*/
	static final private String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	public void run()
	{
		//use a tokenizer in java.util
		introduceApp();
	}
	
	
	private void introduceApp()
	{
		println("The CS106A_LongestWord class returns the " +
				"longest word in a client provided string.");
	}
	
	
	private String longestWord(String line)
	{
		StringTokenizer tokenizer = new StringTokenizer(line);
		while (tokenizer.hasMoreElements()){
			tokenizer.nextToken();
		}
		return "";
	}
}