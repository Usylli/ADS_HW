public class MyMinMaxHeap<T extends Comparable<T>> {
	private Object[] array;
	private int size = 0;
	private int capacity = 5;
	
	public MyMinMaxHeap(int capacity){
        this.capacity = capacity;
        this.size = 0;
        array = new Object[this.capacity + 1];
        array[0] = Integer.MIN_VALUE;
    }
	
	public T get(int index) {
		return (T) array[index];
	}
	
	public int size(){
        return size;
    }
	
	public boolean empty(){
        return size() == 0;
    }
	
	public int rightChildOf(int index){
        return (2 * index) + 1;
    }
	
	private int leftChildOf(int index){
        return (2 * index);
    }
	
	private int parentOf(int index) {
        return index / 2;
    }
	
	private boolean leafNode(int index){
        if (index >= (size / 2) && index <= size) {
            return true;
        }
        return false;
    }
	private void swap(int index1, int index2){
        T temp;
        temp = (T) array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
	
	private void minHeapify(int index){
		if (!leafNode(index)) {
	        if (((T) array[index]).compareTo((T) array[leftChildOf(index)]) > 0 || ((T) array[index]).compareTo((T) array[rightChildOf(index)]) > 0) {
	            if (((T) array[leftChildOf(index)]).compareTo((T) array[rightChildOf(index)]) < 0) {
	                swap(index, leftChildOf(index));
	                minHeapify(leftChildOf(index));
	            }
	            else {
	                swap(index, rightChildOf(index));
	                minHeapify(rightChildOf(index));
	            }
	        }
	    }
    }

	public void insert(T item){
        if (size >= capacity) {
            return;
        }
        array[++size] = item;
        int current = size;
  
        while (((T) array[current]).compareTo((T) array[parentOf(current)]) < 0) {
            swap(current, parentOf(current));
            current = parentOf(current);
        }
    }
	
	public void minHeap(){
        for (int index = (size / 2); index >= 1; index--) {
            minHeapify(index);
        }
    }
	
	public T getMin() {
		minHeapify(1);
		return (T) array[1];
	}
	
	public T getMax() {
		T maximumElement = (T) array[0];
		 
        for (int i = 1; i < size; ++i) {
            if(maximumElement.compareTo((T) array[i]) < 0) {
            	maximumElement = (T) array[i];
            }
        }
 
        return maximumElement;
	}
	
	public T extractMin(){
		minHeapify(1);
        T popped = (T) array[1];
        array[1] = array[size--];
        minHeapify(1);
        return popped;
    }
	public T extractMax(){
		T maximumElement = (T) array[0];
		int maxInd = 0;
		 
        for (int i = 1; i < size; ++i) {
            if(maximumElement.compareTo((T) array[i]) < 0) {
            	maximumElement = (T) array[i];
            	maxInd = i;
            }
        }
        T popped = maximumElement;
        array[maxInd] = array[size--];
        minHeapify(maxInd);
        return popped;
    }
	
	public void print(){
        for (int i = 1; i <= size / 2; i++) {
            System.out.print(" O : " + array[i] + " / : " + array[2 * i] + " \\ :" + array[2 * i + 1]);
            System.out.println();
        }
    }
	
	
}
