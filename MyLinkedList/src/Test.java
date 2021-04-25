
public class Test {

	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<>();
		
		for(int i = 0; i < 11; i++) {
			list.add(i);
		}
	
		list.reverse();
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		System.out.println(list.find(2));
		
		System.out.println(list.remove(5));
		
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		list.add(5, 5);
		
		System.out.println();
		
		for(int i = 0; i < list.getSize(); i++) {
			System.out.print(list.get(i) + " ");
		}
	
	}

}
