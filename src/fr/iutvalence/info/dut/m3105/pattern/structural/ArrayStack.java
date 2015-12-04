package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayStack<T> implements Stack<T> {
	
	private int index;
	
	private T[] stack;
	
	public ArrayStack(){
		this.index = 0;
		this.stack = (T[])new Object[10];
	}
	
	@Override
	public void push(T elem) {
		this.stack[index] = elem;
		this.index++;
	}

	@Override
	public T pop() {
		T elem;
		this.index--;
		elem = this.stack[index];
		this.stack[index] = null;
		return elem;
	}

	@Override
	public T peek() {
		return this.stack[index-1];
	}

	@Override
	public int size() {
		return index;
	}

}
