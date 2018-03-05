package a2_27043651;
/**
* @author Nicolas Brodeur-Champagne
* With base assignment from Serguei A. Mokhov, mokhov@cs.concordia.ca;
*/
//Exception Handling added for task2
public class BlockStackFullException extends Exception {
	
	public BlockStackFullException() {
        System.err.println("Can not push onto a full stack!, Exception handled.");
    }
	
	
	public BlockStackFullException(String message) {
        super(message);
    }
	

}
