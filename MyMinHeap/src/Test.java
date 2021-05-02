
public class Test {

	public static void main(String[] args) {
		System.out.println("The Min Heap is ");
        MyMinMaxHeap minmaxHeap = new MyMinMaxHeap(10);
        minmaxHeap.insert(1);
        minmaxHeap.insert(2);
        minmaxHeap.insert(3);
        minmaxHeap.insert(4);
        minmaxHeap.insert(5);
        minmaxHeap.insert(6);
        minmaxHeap.insert(7);
        minmaxHeap.insert(8);
        minmaxHeap.insert(9);
   
        minmaxHeap.minHeap();
        minmaxHeap.print();
        
        System.out.println("The Min is " + minmaxHeap.extractMin());
        System.out.println("The Max is " + minmaxHeap.extractMax());
	}

}
