import java.util.Collections;

public class MyArrayList<T> {
	private Object[] array;
	private int size = 0;
	private int capacity = 5;
	
	public MyArrayList() {
		array = new Object[capacity];
	}
	
	public T get(int index) {
		return (T) array[index];
	}
	
	public void add(T newItem) {
		if(size == capacity) {
			increaseBuffer();
		}
		array[size++] = newItem;
	}
	
	public void add(T newItem, int index) {
		if(size == capacity) {
			increaseBuffer();
		}
		for(int i = size; i > index; i--) {
			array[i] = array[i-1];
		}
		array[index] = newItem;
		size++;
	}
	
	public void increaseBuffer() {
		capacity = (int)(1.5 * capacity);
		Object[] array2 = new Object[capacity];
		for(int i = 0; i < size; i++) {
			array2[i] = array[i];
		}
		
		array = array2;
	}
	
	public int getSize() {
		return size;
	}
	
	public int find(T keyItem) {
		for(int i = 0; i < size; i++) {
			if(array[i] == keyItem) {
				return i;
			}
		}
		return -1;
	}
	
	public T remove(int index) {
		T removed = (T) array[index];
		for(int i = index; i < size-1; i++) {
			array[i] = array[i+1];
		}
		size--;
		return removed;
	}
	
	public void reverse() {
		T temp;
		for(int i = 0; i < size/2; i++) {
			temp = (T) array[i];
			array[i] = array[size-i-1];
			array[size-i-1] = temp;
		}
	}
}
