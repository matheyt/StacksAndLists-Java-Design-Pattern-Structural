package fr.iutvalence.info.dut.m3105.pattern.structural;

public class Main
{

	public static void main(String[] args)
	{
		Stack<String> stack = new StackListAdapter<String>();
		new StackOfStringTester(stack).testStack();
	}

}
