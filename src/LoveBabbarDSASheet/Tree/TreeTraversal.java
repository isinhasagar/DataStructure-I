package LoveBabbarDSASheet.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeTraversal {

    // Root -> Left -> Right
    public static List<Integer> preOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null)
            return result;

        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            result.add(temp.val);
            if(temp.right != null)
                stack.push(temp.right);
            if(temp.left != null)
                stack.push(temp.left);
        }
        return result;
    }

    // Recursive solution
    public static void recursivePreOrder(TreeNode root){
        if(root == null) return;

        System.out.print(root.val + " ");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    // Left -> Root -> Right
    public static List<Integer> inOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;

        while(!stack.isEmpty() || node != null){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                node = stack.pop();
                result.add(node.val);
                node = node.right;
            }
        }
        return result;
    }

    // Left -> Right -> Root
    public static List<Integer> postOrderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();

        if(root == null) return result;

        stack1.push(root);

        while(!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.push(node);
            if(node.left != null ) stack1.push(node.left); // left
            if(node.right != null ) stack1.push(node.right);// right
        }
        while(!stack2.isEmpty()){
            result.add(stack2.pop().val);
        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        System.out.println(preOrderTraversal(root));
        recursivePreOrder(root);

        System.out.println(inOrderTraversal(root));

        System.out.println(postOrderTraversal(root));
    }
}
