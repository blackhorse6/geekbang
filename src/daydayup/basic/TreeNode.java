package daydayup.basic;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-24
 * ----      Title           ----
 * 基础数结构
 */
public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }


    public static TreeNode generateTreeNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        return null;
    }
}
