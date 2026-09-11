/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        inorder(root1,a);
        inorder(root2,b);
        List<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        while(i<a.size()&& j<b.size()){
            if(a.get(i)<=b.get(j)){
                ans.add(a.get(i));
                i++;
            }else{
                ans.add(b.get(j));
                j++;
            }
        }
        while(i<a.size()){
            ans.add(a.get(i));
            i++;
        }
        while(j<b.size()){
            ans.add(b.get(j));
            j++;
        }
        return ans;
    }
    private void inorder(TreeNode root, List<Integer> list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}