package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackOfStringTester {
	
	private Stack<String> stack;
	
	public StackOfStringTester(Stack<String> stack) {
		this.stack=stack;
	}

	public void testStack() {
		System.out.println("size : "+this.stack.size());
		
		this.stack.push("a");
		System.out.println("elem : "+this.stack.peek()+" added");
		
		System.out.println("new size : "+this.stack.size());
		
		this.stack.push("b");
		System.out.println("elem : "+this.stack.peek()+" added");
		
		System.out.println("new size : "+this.stack.size());
		
		System.out.println("last added elem : "+this.stack.peek());
		
		System.out.println("current size : "+this.stack.size());
		
		System.out.println("elem : "+this.stack.pop()+" removed");
		System.out.println("new size : "+this.stack.size());
		
		System.out.println("elem : "+this.stack.pop()+" removed");
		System.out.println("new size : "+this.stack.size());
	}

}
