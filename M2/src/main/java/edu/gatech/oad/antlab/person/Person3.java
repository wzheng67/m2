package edu.gatech.oad.antlab.person;
/**
 *  A simple class for person 3
 *  returns their name and a
 *  reversed string 
 *  
<<<<<<< HEAD
 *  @author  William Zheng
=======
 *  @author  Bob
>>>>>>> 165c184b1b9282a5cd030eef158a1f71c930d465
 *  @version 1.1
 */
public class Person3 {
   /** Holds the persons real name */  
	private String name;
	
	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	public Person3(String pname){
	  name = pname;
	}
	
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the 
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
	
	/**
	 * This method should take the string
	 * input and return its reverse.
	 * given "gtg123b" it should return
	 * b321gtg.
	 *
	 * @param input the string to be reversed
	 * @return the reversed string
	 */
	private String calc(String input) {
<<<<<<< HEAD
	  String out = "";
	  for (int x = input.length(); x > 0; x--){
	  	out += input.charAt(x - 1);
	  }
	  return out;
=======
	  //Person 3 put your implementation here
	  return null;
>>>>>>> 165c184b1b9282a5cd030eef158a1f71c930d465
	}
}
