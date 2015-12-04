package fr.iutvalence.info.dut.m3105.pattern.structural;

public class StackListAdapter<T> implements Stack<T> {
	
	private List<T> liste;
	
	public StackListAdapter() {
		this.liste = new ArrayList<T>();
	}
	
	@Override
	public void push(T elem) {
		this.liste.add(this.liste.size(), elem);
	}

	@Override
	public T pop() {
		return this.liste.remove(this.size()-1);
	}

	@Override
	public T peek() {
		return this.liste.get(this.size()-1);
	}

	@Override
	public int size() {
		return this.liste.size();
	}
	
}
