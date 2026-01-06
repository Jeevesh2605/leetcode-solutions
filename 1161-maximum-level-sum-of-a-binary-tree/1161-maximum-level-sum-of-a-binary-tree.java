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
class Solution1 {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> levelSums = new ArrayList<>();
        while (!queue.isEmpty()) {
            int size = queue.size();
            int sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            levelSums.add(sum);
        }
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int answer = 1;
        for (int i = 0; i < levelSums.size(); i++) {
            if (levelSums.get(i) > maxSum) {
                maxSum = levelSums.get(i);
                answer = i + 1; 
            }
        }
        return answer;
    }
}


class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int level = 1;
        int maxSum = Integer.MIN_VALUE;
        int answerLevel = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int currentSum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                currentSum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                answerLevel = level;
            }
            level++;
        }
        return answerLevel;
    }
}
