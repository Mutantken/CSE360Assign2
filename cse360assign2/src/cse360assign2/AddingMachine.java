//Kenneth Wong
//ID: 1212586360
//Assign 2
package cse360assign2;

/**
 * 
 * @Author Kenneth Wong
 * 
 * This class contains the methods and a constructor that are used
 * for a simple calculator that can add and subtract two numbers
 * and output a result.
 *
 */

public class AddingMachine {

	private int total;
	private String string;
	
	/**
	 * This is a constructor used for initializing the variable total.
	 */
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		string = "0 ";
	}
	
	/**
	 * This is a method used to return the current total of all actions
	 * performed.
	 * @return	Returns a value to be printed
	 */
	
	public int getTotal () {
		return total;
	}
	
	/**
	 * This method is used to add the total and the given number from
	 * the parameter value.
	 * @param value	This parameter is a value given by the user to add to the total.
	 */
	
	public void add (int value) {
		total += value;
		string = string + "+ " + String.valueOf(value) + " ";
	}
	
	/**
	 * The subtract method is used to subtract the parameter from the total.
	 * @param value	Parameter value is given by user to subtract from total.
	 */
	
	public void subtract (int value) {
		total -= value;
		string = string + "- " + String.valueOf(value) + " ";
	}
		
	/**
	 * The method toString records all actions done by the user and
	 * returns the text for all actions and numbers done in the calculator.
	 * @return returns the string that contains operations and numbers from actions by user.
	 */

	public String toString () {
		return string;
	}

	/**
	 * This method clears all data from the program by resetting the getTotal to 0
	 * and by clearing toString so that has no operations or numbers recorded.
	 */
	
	public void clear() {
	
	}
}
