package daydayup;

import daydayup.basic.Node;
import daydayup.basic.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * 1 N 叉树的前序遍历
 * 2 二叉树的前序遍历
 * ----      Description     ----
 * ----      Example         ----
 */
public class Day4 {

    private static List<Integer> list = new ArrayList<>();
    public static Stack<Node> stack = new Stack<>();

    public static void main(String[] args) {

    }


    /**
     * N 叉树的前序遍历 - 递归 01
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder1(Node root) {
        if (root == null) {
            return null;
        }
        list.add(root.value);
        if (!isEmpty(root.children)) {
            for (Node n : root.children) {
                preOrder1(n);
            }
        }
        return list;
    }

    /**
     * N 叉树的前序遍历 -栈
     *
     * @param root
     * @return
     */
    public static List<Integer> preOrder2(Node root) {
        List<Integer> list = new ArrayList<>();
        stack.add(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.value);
            if (node.children != null && !node.children.isEmpty()) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.push(node.children.get(i));
                }
            }
        }
        return list;
    }

    public static boolean isEmpty(List list) {
        return list == null || list.isEmpty();
    }

    /**
     * 二叉树的前序遍历 - 递归
     *
     * @param root
     * @return
     */
    public List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return list;
        }
        list.add(root.getValue());
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
        return list;
    }

}
