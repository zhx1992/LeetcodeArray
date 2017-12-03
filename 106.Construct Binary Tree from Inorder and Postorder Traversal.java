/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int pInorder,pPostorder;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        pInorder=inorder.length-1;
        pPostorder=postorder.length-1;
        return buildTree(inorder,postorder,null);
    }
    private TreeNode buildTree(int[] inorder,int[] postorder,TreeNode node) {
        if(pPostorder<0)
            return null;
        TreeNode n=new TreeNode(postorder[pPostorder--]);
        if(inorder[pInorder]!=n.val)
            n.right=buildTree(inorder,postorder,n);
        pInorder--;
        if((node==null)||(inorder[pInorder]!=node.val))
            n.left=buildTree(inorder,postorder,node);
        return n;
    }
}