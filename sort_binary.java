// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}

public class Solution {
    
    // Main function that converts sorted array to Binary Search Tree (BST)
    public TreeNode sortedArrayToBST(int[] num) {
        if (num.length == 0) {
            return null;
        }
        // Calling the helper function to recursively create BST
        TreeNode head = helper(num, 0, num.length - 1);
        return head;
    }

    // Helper function for recursively constructing BST
    public TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
            return null; // Base case: if low index is greater than high, return null
        }
        int mid = (low + high) / 2; // Find the middle element
        TreeNode node = new TreeNode(num[mid]); // Create a new TreeNode with the middle value
        node.left = helper(num, low, mid - 1);  // Recursively build the left subtree
        node.right = helper(num, mid + 1, high); // Recursively build the right subtree
        return node;
    }
    
    // Function to print the tree in inorder traversal (for testing purposes)
    public void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] sortedArray = {-10, -3, 0, 5, 9};
        
        TreeNode bstRoot = solution.sortedArrayToBST(sortedArray);
        
        // Print inorder traversal of the constructed BST
        System.out.print("Inorder Traversal of the BST: ");
        solution.inorderTraversal(bstRoot);  // Expected output: -10 -3 0 5 9
    }
}
