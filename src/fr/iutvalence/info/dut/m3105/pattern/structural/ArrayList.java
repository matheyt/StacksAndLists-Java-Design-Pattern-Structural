package fr.iutvalence.info.dut.m3105.pattern.structural;

public class ArrayList<T> implements List<T> {

	private T[] liste;
	private int count;
	
	public ArrayList(){
		this.liste = (T[])new Object[10];
		this.count = 0;
	}
	
	@Override
	public void add(int intg, T elem) {
		this.liste[intg] = elem;
		this.count++;
	}

	@Override
	public T remove(int intg) {
		T elem = this.liste[intg];
		this.liste[intg] = null;
		this.count--;
		return elem;
	}

	@Override
	public T get(int intg) {
		return this.liste[intg];
	}

	@Override
	public int size() {
		return this.count;
	}

}
