package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface Stack<T> {
	void push(T elem);
	
	T pop();
	
	T peek();
	
	int size();
}
