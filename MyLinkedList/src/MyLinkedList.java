
public class MyLinkedList<T>{
	private MyNode<T> head;
	private MyNode<T> tail;
	private int size;
	
	public MyLinkedList() {
		head = null;
		size = 0;
	}
	
	public void add(T newItem) {
		MyNode<T> newNode = new MyNode<>(newItem);
		if (head == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void add(T newItem, int index) {
		MyNode<T> newNode = new MyNode<>(newItem);
		if (head == null) {
			head = tail = newNode;
		} else {
			MyNode<T> node = head;
			for(int i = index-1; i > 0; i--) {
				node = node.next;
			}
			newNode.next = node.next;
			node.next = newNode;
		}
		size++;
	}
	
	public T get(int index) {
		MyNode<T> current = head;
		for(int i = 0; i < index; i++) {
			current = current.next;
		}
		return current.data;
	}
	
	public int getSize() {
		return size;
	}
	
	public int find(T keyItem) {
		MyNode<T> current = head;
		for(int i = 0; i < size; i++) {
			current = current.next;
			if(current.data == keyItem) {
				return i+1;
			}
		}
		return -1;
	}
	
	public T remove(int index) {
		MyNode<T> current = head;
		if (index == 0){
			T data = head.data;
            head = head.next;   // Change head
            return data;
        }
		for(int i = 0; i < index-1; i++) {
			current = current.next;
		}
		T removed = current.next.data;
		MyNode<T> next = current.next.next;
		current.next = next;
		size--;
		return removed;
	}
	
	public void reverse() {
		MyNode prev = null;
        MyNode current = head;
        MyNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
	}
	
	private static class MyNode<E>{
		E data;
		MyNode<E> next;
		
		MyNode(E data){
			this.data = data;
		}
	}
}
