package common;

/**
* @author Nicolas Brodeur-Champagne
* With base assignment from Serguei A. Mokhov, mokhov@cs.concordia.ca;
*/

//Exception Handling added for task2
public class BlockStackEmptyException extends Exception {

	
	public BlockStackEmptyException() {
        System.err.println("Can not pop an empty stack!, Exception handled.");
    }
	
	
	public BlockStackEmptyException(String message) {
        super(message);
    }
	
}
