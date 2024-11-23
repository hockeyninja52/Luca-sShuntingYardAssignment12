package driver;

public abstract class ArrayList {
	public int Size;
	public int[] arrya;
	public int Capacity;
	
	public abstract void Append();
	
	public abstract void Prepend();
	
	public abstract boolean Remove();
	
	public abstract int Get(int index);
	
	
}
