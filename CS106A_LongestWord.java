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
	static final private String SENTINEL = "exit";
	static final private String DELIMITERS = "!@#$%^&*()_-+={[}]:;\"'<,>.?/~`/\\ ";
	public void run()
	{
		while (true){
			String clientString = readLine("Enter a line: ");
			if (clientString.equals(SENTINEL)){
				println("goodbye."); break;
			}
			println(longestWord(clientString));
		}
		introduceApp();
	}
	
	
	private void introduceApp()
	{
		println("The CS106A_LongestWord class returns the " +
				"longest word in a client provided string. " +
				"Type the word 'exit' to quit the program.");
	}
	
	/**
	 * takes in client provided String and returns longest
	 * word in the line
	 * @param line The user provided string to be measured word for word.
	 * @return a print statement denoting which word was the longest.
	 * */
	private String longestWord(String line)
	{
		StringTokenizer tokenizer = new StringTokenizer(line,DELIMITERS,false);
		String longestWord = "";
		while (tokenizer.hasMoreElements()){
			String token = tokenizer.nextToken();
			if (token.length() > longestWord.length()){
				longestWord = token;
			}
		}
		return "The longest word is " + longestWord + ".";
	}
}