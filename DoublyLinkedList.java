package driver;

public class DoublyLinkedList<T> {
	public Node<T> Head;
	public Node<T> Tail;
	
	public DoublyLinkedList() {
		this.Head = null;
		this.Tail = null;
	}
	
	public int GetLength() {
		int length = 0;
		Node<T> node = this.Head;
		while (node != null) {
			node = node.NextNode;
			length++;
		}
		return length;
	}
	
	public boolean IsEmpty() {
		return this.Head == null;
	}
	
	public void InsertAfter(Node<T> a, Node<T> b) {
		if (this.IsEmpty()) {
			this.Head = b;
			this.Tail = b;
		} else {
			Node<T> next = a.NextNode;
			a.NextNode = b;
			b.PreNode = a;
			if (this.Tail == a) {
				this.Tail = b;			
			} else {
				b.NextNode = next;
				next.PreNode = b;
			}
		}		
	}
	
	public void InsertAhead(Node<T> a, Node<T> b) {
		if (this.IsEmpty()) {
			this.Head = b;
			this.Tail = b;
		} else {
			Node<T> pre = a.PreNode;
			a.PreNode = b;
			b.NextNode = a;
			if (this.Head == a) {
				this.Head = b;
			} else {
				b.PreNode = pre;
				pre.NextNode = b;
			}
		}
	}
	
	public void Append(Node<T> node) {
		this.InsertAfter(this.Tail, node);
	}
	
	public void Prepend(Node<T> node) {
		this.InsertAhead(this.Head, node);
	}
	
	public void Remove(Node<T> node) {
		if (this.Head == this.Tail && this.Head == node) {
			this.Head = null;
			this.Tail = null;
		} else if (this.Head == node) {
			this.Head = this.Head.NextNode;
			this.Head.PreNode = null;
		} else if (this.Tail == node) {
			this.Tail = this.Tail.PreNode;
			this.Tail.NextNode = null;			
		} else {
			Node<T> pre = node.PreNode;
			Node<T> next = node.NextNode;
			pre.NextNode = next;
			next.PreNode = pre;			
		}
		node.NextNode = null;
		node.PreNode = null;
	}
	
	public Node<T> Search(T value, Boolean front){
		Node<T> ret = null;
		if (front) {
			ret = this.Head;
			while (ret != null) {
				if (ret.Payload == value) {
					return ret;
				} else {
					ret = ret.NextNode;
				}
			}
		} else {
			ret = this.Tail;
			while (ret != null) {
				if (ret.Payload == value) {
					return ret;
				} else {
					ret = ret.PreNode;
				}
			}
		}
		return ret;
	}
}
