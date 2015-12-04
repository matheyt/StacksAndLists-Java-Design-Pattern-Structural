package fr.iutvalence.info.dut.m3105.pattern.structural;

public interface List<T> {
	void add(int intg, T stack);
	
	T remove(int intg);
	
	T get(int intg);
	
	int size();
}