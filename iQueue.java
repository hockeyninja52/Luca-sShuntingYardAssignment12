package driver;

public interface iQueue<T> {
	public void Enqueue(Node<T> node);
	
	public Node<T> Dequeue();
	
	public Node<T> Peek();
	
	public int GetLength();
	
	public boolean IsEmpty();
}
