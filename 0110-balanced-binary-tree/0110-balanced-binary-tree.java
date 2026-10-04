class Solution {

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        // Empty tree is balanced
        if (node == null) {
            return 0;
        }

        // Height of left subtree
        int leftHeight = height(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        // Height of right subtree
        int rightHeight = height(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        // If difference is greater than 1, tree is unbalanced
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        // Return height of current subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}