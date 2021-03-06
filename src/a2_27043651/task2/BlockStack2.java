package a2_27043651.task2;

import common.BlockStackEmptyException;
import common.BlockStackFullException;

/**
 * Class BlockStack
 * Implements character block stack and operations upon it.
 *
 * @author Nicolas Brodeur-Champagne
 * With base assignment from Serguei A. Mokhov, mokhov@cs.concordia.ca;
 */
class BlockStack2
{
	//Task2 change, public->private
	private static int accessCounter =0;
	
	
	//Task2 change, public->private
	/**
	 * # of letters in the English alphabet + 2
	 */
	private static final int MAX_SIZE = 28;

	//Task2 change, public->private
	/**
	 * Default stack size
	 */
	private static final int DEFAULT_SIZE = 6;

	//Task2 change, public->private
	/**
	 * Current size of the stack
	 */
	private int iSize = DEFAULT_SIZE;

	//Task2 change, public->private
	/**
	 * Current top of the stack
	 */
	private int iTop  = 3;

	//Task2 change, public->private
	/**
	 * stack[0:5] with four defined values
	 */
	private char acStack[] = new char[] {'a', 'b', 'c', 'd', '$', '$'};

	/**
	 * Default constructor
	 */
	public BlockStack2()
	{
	}

	/**
	 * Supplied size
	 */
	public BlockStack2(final int piSize)
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

	//Changed for task2
	//Exception Handling added for task2
	/**
	 * Standard push operation
	 */
	public void push(final char pcBlock)
	{
		accessCounter++;
		if(this.isEmpty())
			this.acStack[++this.iTop] = 'a';
		else if(iTop==iSize)
		{
			try {
				throw new BlockStackFullException();
			} catch (BlockStackFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return;
		}
		else
			this.acStack[++this.iTop] = pcBlock;
	}

	//Exception Handling added for task2
	/**
	 * Standard pop operation
	 * @return ex-top element of the stack, char
	 */
	public char pop()
	{
		accessCounter++;
		
		if(this.isEmpty())
		{
			try {
				throw new BlockStackEmptyException();
			} catch (BlockStackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return (Character) null;
		}
		else
		{
			char cBlock = this.acStack[this.iTop];
			this.acStack[this.iTop--] = '$'; // Leave prev. value undefined
			return cBlock;
		}
		
	}
	
	public int getITop()
	{
		accessCounter++;
		return iTop;
	}
	
	public int getISize()
	{
		accessCounter++;
		return iSize;
	}
	
	public int getAccessCounter()
	{
		return accessCounter;
	}
	
	public boolean isEmpty()
	{
		accessCounter++;
		return (this.iTop == -1);
	}
}

// EOF
