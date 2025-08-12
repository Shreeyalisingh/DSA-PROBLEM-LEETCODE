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
    private TreeNode previousNode;
    private TreeNode firstSwappedNode;
    private TreeNode secondSwappedNode;

    public void recoverTree(TreeNode root) {
        inOrderTraversal(root);
        int temp = firstSwappedNode.val;
        firstSwappedNode.val = secondSwappedNode.val;
        secondSwappedNode.val = temp;
    }

    private void inOrderTraversal(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraversal(node.left);
        if (previousNode != null && previousNode.val > node.val) {
            if (firstSwappedNode == null) {
                firstSwappedNode = previousNode;
            }
            secondSwappedNode = node;
        }
        previousNode = node;
        inOrderTraversal(node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
