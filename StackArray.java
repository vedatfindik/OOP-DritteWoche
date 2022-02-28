import java.util.ArrayList;
public class StackArray<E> {
	
	
	// ATTRIBUTES
	
	private ArrayList<E> list;
	
	
	
	// METHODS
	
	//constructor, creats an empty stack
	public StackArray () {
		this.list = new ArrayList<E>();
	}

	
	//inserts item at the top of this stack
	public void push (E item) {
		list.add(item);
	}
		

	//returns the top item of this stack and removes it
	public E pop () {
		return list.remove(list.size() - 1);
	}

	
	//returns the top item of this stack without removing it
	public E peek () {
		return list.get(list.size() - 1);
	}
	
	
	//returns true if this stack contains no elements
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	
	//additional useful methods

	//returns the position of item on this stack, the top positon has
	//count 1, returns -1 if item is not on this stack;
	//compares items with equals!
	public int contains (E item) {
		
		return list.indexOf(item);
	}
	

	//returns a String-representation of this stack as
	//[item1, item2, ...] with item1 as the top item
	public String toString () {
		
		String result = "[";
		
		if(list.size() >= 1) {
			for (int i = list.size()-1; i > 0; i--)
				result = result + list.get(i) + " ,";
		
			result = result + list.get(0);
		}
		
		result = result + "]";
		return result;
	}

}
