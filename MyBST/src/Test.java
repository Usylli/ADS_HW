public class Test extends MyBST {
	 public static void main(String[] args) {
			MyNode root;
	        root = new MyNode(20);
	        add(root,5);
	        add(root,1);
	        add(root,15);
	        add(root,9);
	        add(root,7);
	        add(root,12);
	        add(root,30);
	        add(root,25);
	        add(root,40);
	        add(root,45);
	        add(root,42);

	        sort(root);
	        System.out.println("");
	        System.out.println(search(5, root).getData());

	        root = remove(root, 1);
	        root = remove(root, 40);
	        root = remove(root, 45);
	        root = remove(root, 9);
	        
	        System.out.println(search(1, root));
	        
	        sort(root);
	        
	        System.out.println("");

		}
}
