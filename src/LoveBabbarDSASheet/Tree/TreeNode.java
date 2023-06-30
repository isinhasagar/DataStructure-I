package LoveBabbarDSASheet.Tree;

import com.sun.source.tree.Tree;

public class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(){ }
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
