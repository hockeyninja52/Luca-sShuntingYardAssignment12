package driver;

public class IntegerStack extends DoublyLinkedList<Integer> implements iStack<Integer> {

	@Override
	public void Push(Node<Integer> node) {
		this.InsertAfter(this.Tail, node);
	}

	@Override
	public Node<Integer> Pop() {
		if (this.IsEmpty()) {
			return null;
		}
		Node<Integer> ret = this.Tail;
		this.Remove(ret);
		return ret;
	}

	@Override
	public Node<Integer> Peek() {
		return this.Tail;
	}

}
