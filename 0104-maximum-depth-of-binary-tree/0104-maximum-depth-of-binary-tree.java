class Solution {
    public int maxDepth(TreeNode root) {
        // If tree is empty
        if (root == null) {
            return 0;
        }

        // Find depth of left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);

        // Return maximum depth + current node
        return 1 + Math.max(leftDepth, rightDepth);
    }
}