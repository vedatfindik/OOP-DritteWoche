public class MyStackDemo {
	
	public static void main (String args[]) {
		
		StackDynamic<Integer> intStackDynamic = new StackDynamic<>();
		StackArray<Integer> intStackArray = new StackArray<>();
		
		StackDynamic<String> stringStackDynamic = new StackDynamic<>();
		StackArray<String> stringStackArray = new StackArray<>();
		
		StackDynamic<StackArray<Integer>> arrayStackDynamic = new StackDynamic<>();
		StackArray<StackDynamic<Integer>> dynamicStackArray = new StackArray<>();
		
		
		
		int pushStatistic = 0;
		int popStatistic = 0;
		int peekStatistic = 0;
		
		
		for (int i = 0; i < 1000; i++) {
			
			int control = PRNG.randomInt(5);
			
			if (control < 2) {
				
				pushStatistic++;
				int randomInt = PRNG.randomInt(1000);
				String randomString = PRNG.randomString();
				
				intStackDynamic.push(randomInt);
				intStackArray.push(randomInt);
				
				stringStackDynamic.push(randomString);
				stringStackArray.push(randomString);
				 
				arrayStackDynamic.push(intStackArray);
				dynamicStackArray.push(intStackDynamic);
			}
			
			else if (control < 4) {
				
				popStatistic++;
				
				if (!intStackDynamic.isEmpty()) {
				
					System.out.println("intStackDynamic pop: " + intStackDynamic.pop());
					System.out.println("intStackArray pop: " + intStackArray.pop());
					
					System.out.println("stringStackDynamic pop: " + stringStackDynamic.pop());
					System.out.println("stringStackArray pop: " + stringStackArray.pop());
					
					System.out.println("arrayStackDynamic pop: " + arrayStackDynamic.pop());
					System.out.println("dynamicStackArray pop: " + dynamicStackArray.pop());
					
					System.out.println();
				}
			}
			else {
				
				peekStatistic++;
				
				if (!intStackDynamic.isEmpty()) {
				
					System.out.println("intStackDynamic peek: " + intStackDynamic.peek());
					System.out.println("intStackArray peek: " + intStackArray.peek());
					
					System.out.println("stringStackDynamic peek: " + stringStackDynamic.peek());
					System.out.println("stringStackArray peek: " + stringStackArray.peek());
					
					System.out.println("arrayStackDynamic peek: " + arrayStackDynamic.peek());
					System.out.println("dynamicStackArray peek: " + dynamicStackArray.peek());
					
					System.out.println();
				}
			}
		}
		
		System.out.println();
		System.out.println("number of push operations: " + pushStatistic);
		System.out.println("number of pop operations: " + popStatistic);
		System.out.println("number of peek operations: " + peekStatistic);
	}
	
}