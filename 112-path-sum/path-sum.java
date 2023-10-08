
class Solution {
    public boolean hasPathSum(TreeNode root, int target) {
        if(root==null){
            return false;
        }

        if(root.left==null && root.right==null && root.val == target){
            return true ;
        }

        boolean lans = hasPathSum(root.left,target-root.val);
        boolean rans = hasPathSum(root.right,target-root.val);

        return lans || rans ;

    }
}