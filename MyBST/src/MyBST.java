public class MyBST {
    public static MyNode search(int x, MyNode n){
        if (n==null || n.getData()==x)
            return n;
        else if(n.getData()>x)
            return search(x, n.getLeftChild()); 
        else
            return search(x, n.getRightChild());
    }

    public static MyNode findMinimum(MyNode root){
        if(root==null)
            return null;
        else if(root.getLeftChild() != null)
            return findMinimum(root.getLeftChild());
        return root;
    }
    
    public static MyNode add(MyNode root, int x){
        if (root == null)
            return new MyNode(x);
        else if(x>root.getData())
            root.setRightChild(add(root.getRightChild(),x));
        else
            root.setLeftChild(add(root.getLeftChild(),x));
        return root;
    }

    public static MyNode remove(MyNode root, int x){
        if(root==null)
            return null;
        if (x>root.getData())
            root.setRightChild(remove(root.getRightChild(), x));
        else if(x<root.getData())
            root.setLeftChild(remove(root.getLeftChild(), x));
        else{
            if(root.getLeftChild()==null && root.getRightChild()==null){
                root = null;
                return null;
            }

            else if(root.getLeftChild()==null || root.getRightChild()==null){
            	MyNode temp;
                if(root.getLeftChild()==null)
                    temp = root.getRightChild();
                else
                    temp = root.getLeftChild();
                root = null;
                return temp;
            }
            else{
            	MyNode temp = findMinimum(root.getRightChild());
                root.setData(temp.getData());
                root.setRightChild(remove(root.getRightChild(), temp.getData()));
            }
        }
        return root;
    }

    
    public static void sort(MyNode root){
        if(root!=null){
        	sort(root.getLeftChild());
            System.out.print(" "+root.getData()+" "); 
            sort(root.getRightChild()); 
        }
    }
}
