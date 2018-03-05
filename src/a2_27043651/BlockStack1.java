package a2_27043651;

/**
 * Class BlockStack
 * Implements character block stack and operations upon it.
 *
 * @author Nicolas Brodeur-Champagne
 * With base assignment from Serguei A. Mokhov, mokhov@cs.concordia.ca;
 */
class BlockStack1
{
	//Added for Task1
	public static int accessCounter =0;
	
	/**
	 * # of letters in the English alphabet + 2
	 */
	public static final int MAX_SIZE = 28;

	/**
	 * Default stack size
	 */
	public static final int DEFAULT_SIZE = 6;

	/**
	 * Current size of the stack
	 */
	public int iSize = DEFAULT_SIZE;

	/**
	 * Current top of the stack
	 */
	public int iTop  = 3;

	/**
	 * stack[0:5] with four defined values
	 */
	public char acStack[] = new char[] {'a', 'b', 'c', 'd', '$', '$'};

	/**
	 * Default constructor
	 */
	public BlockStack1()
	{
	}

	/**
	 * Supplied size
	 */
	public BlockStack1(final int piSize)
	{


                if(piSize != DEFAULT_SIZE)
		{
			this.acStack = new char[piSize];

			// Fill in with letters of the alphabet and keep
			// 2 free blocks
			for(int i = 0; i < piSize - 2; i++)
				this.acStack[i] = (char)('a' + i);

			this.acStack[piSize - 2] = this.acStack[piSize - 1] = '$';

			this.iTop = piSize - 3;
                        this.iSize = piSize;
		}
	}

	/**
	 * Picks a value from the top without modifying the stack
	 * @return top element of the stack, char
	 */
	public char pick()
	{
		accessCounter++;
		return this.acStack[this.iTop];
	}

	/**
	 * Returns arbitrary value from the stack array
	 * @return the element, char
	 */
	public char getAt(final int piPosition)
	{
		accessCounter++;
		return this.acStack[piPosition];
	}

	/**
	 * Standard push operation
	 */
	public void push(final char pcBlock)
	{
		accessCounter++;
		this.acStack[++this.iTop] = pcBlock;
	}

	/**
	 * Standard pop operation
	 * @return ex-top element of the stack, char
	 */
	public char pop()
	{
		accessCounter++;
		char cBlock = this.acStack[this.iTop];
		this.acStack[this.iTop--] = '$'; // Leave prev. value undefined
		return cBlock;
	}
	
	//Added for Task1
	public int getITop()
	{
		accessCounter++;
		return iTop;
	}
	
	//Added for Task1
	public int getISize()
	{
		accessCounter++;
		return iSize;
	}
	
	//Added for Task1
	public int getAccessCounter()
	{
		return accessCounter;
	}
	
	//Added for Task1
	public boolean isEmpty()
	{
		accessCounter++;
		return (this.iTop == -1);
	}
}

// EOF
