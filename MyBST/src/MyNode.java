public class MyNode {
	private int data;
    private MyNode left;
    private MyNode right;

    public MyNode(int element){
        data = element;
        left = null;
        right = null;
    }

    public void setRightChild(MyNode n)
    {
        right = n;
    }

    public void setLeftChild(MyNode n){
        left = n;
    }

    public MyNode getRightChild(){
        return right;
    }

    public MyNode getLeftChild(){
        return left;
    }

    public int getData(){
        return data;
    }

    public void setData(int x){
        data = x;
    }
}
