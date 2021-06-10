
public class Solution {
	static int deep = -1;
    static int ans = 0;
    public void travoman(TreeNode root, int level){
        if(root == null) return;

        if(root.left == null && root.right == null){
            if(deep == -1){
                deep = level;
                ans = root.val;
            }
            else if(deep < level){
                ans = root.val;
                deep = level;
            }
            else if(deep == level){
                ans += root.val;
            }
        }

        travoman(root.left, level+1);
        travoman(root.right, level+1);

    }

    public int deepestLeavesSum(TreeNode root) {

        deep = -1;
        ans = 0;

        travoman(root,1);
        return ans;
    }
}
