public class StackDynamic<E> {
	
	
	
	// Inner class Node as a base for the dynamic structure
	private class Node {
		
		E data;
		Node next;
		
		Node (E d) {
			data = d;
			next = null;
		}

	}
	
	
	
	// ATTRIBUTES
	
	private Node head;
	
	
	
	// METHODS
	
	//constructor, creats an empty stack
	public StackDynamic () {
		head = null;
	}

	
	//inserts item at the top of this stack
	public void push (E item) {
		Node p = new Node(item);
		p.next = head;
		head = p;
	}
		

	//returns the top item of this stack and removes it
	public E pop () {
		Node p = head;
		head = head.next;
		return p.data;
	}

	
	//returns the top item of this stack without removing it
	public E peek () {
		return head.data;
	}
	
	
	//returns true if this stack contains no elements
	public boolean isEmpty() {
		return (head == null);
	}
	
	
	//additional useful methods

	//returns the position of item on this stack, the top positon has
	//count 1, returns -1 if item is not on this stack;
	//compares items with equals!
	public int contains (E item) {
		
		Node p = head;
		
		int count = 1;
		while ((p != null) && (!p.data.equals(item))) {  // WARNING: do not change order!
			
			count ++;
			p = p.next;
		}
		
		if (p == null) return -1;
		else return count;
	}
	

	//returns a String-representation of this stack as
	//[item1, item2, ...] with item1 as the top item
	public String toString () {
		
		String result = "[";
		Node p = head;
		
		while (p != null) {
			
			if (p.next != null)
				result = result + p.data.toString() + " ,";
			else
				result = result + p.data.toString();
			
			p = p.next;
		}
		result = result + "]";
		
		return result;
	}

}
