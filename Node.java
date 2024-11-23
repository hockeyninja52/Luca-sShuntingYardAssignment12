package driver;

public class Node<T> {
	public T Payload;
	public Node<T> NextNode;
	public Node<T> PreNode;
	
	public Node(T payload) {
		this.Payload = payload;
		this.NextNode = null;
		this.PreNode = null;
	}
}
