// Full Binary Tree
class Solution {
    public List<TreeNode> allPossibleFBT(int n) {
        return f(n);
    }
    List<TreeNode> f(int n){
        List<TreeNode> ans = new ArrayList<TreeNode>();
        if(n == 1){
            ans.add(new TreeNode(0));
            return ans;
        }
        for(int i = 1; i < n; i += 2) {
            List<TreeNode> left = allPossibleFBT(i);
            List<TreeNode> right = allPossibleFBT(n - i - 1);
            for(TreeNode l : left) {
                for(TreeNode r : right) {
                    TreeNode root = new TreeNode(0, l, r);
                    ans.add(root);
                }
            }
        }
        return ans;
    }
}