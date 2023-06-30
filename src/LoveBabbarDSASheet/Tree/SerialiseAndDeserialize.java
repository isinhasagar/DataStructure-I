package LoveBabbarDSASheet.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerialiseAndDeserialize {
    public String serialize(TreeNode root) {
        StringBuilder b = new StringBuilder();
        preOrder(root,b);
        return b.toString();
    }

    public TreeNode deserialize(String data) {
        String[] split = data.split(",");
        List<String> list = new ArrayList<>(Arrays.asList(split));
        return preOrder(list);

    }

    private void preOrder(TreeNode root, StringBuilder b){
        if(root == null)
            b.append("null,");
        else{
            b.append(root.val).append(",");
            preOrder(root.left, b);
            preOrder(root.right, b);
        }
    }

    private TreeNode preOrder(List<String> list){
        String s = list.get(0);
        if(s.equals("null")){
            list.remove(0);
            return null;
        }
        else{
            int num = Integer.parseInt(s);
            TreeNode root = new TreeNode(num);
            list.remove(0);
            root.left = preOrder(list);
            root.right = preOrder(list);
            return root;
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode();

        SerialiseAndDeserialize serialize = new SerialiseAndDeserialize();
        SerialiseAndDeserialize deserialize = new SerialiseAndDeserialize();

        TreeNode ans = deserialize.deserialize(serialize.serialize(root));

    }
}
