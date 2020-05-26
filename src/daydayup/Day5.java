package daydayup;

import daydayup.basic.TreeNode;

/**
 * User          : zhouchenbin
 * Date          : 2020-05-26
 * ----      Title           ----
 * 1 二叉树的最大深度
 * 2 验证二叉搜索树
 * ----      Description     ----
 * ----      Example         ----
 */
public class Day5 {

    private static int maxDepth = 0;

    public static void main(String[] args) {

    }

    /**
     * 二叉树的最大深度 递归
     *
     * @param root
     * @return
     */
    public static int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth1(root.getLeft()), maxDepth1(root.getRight())) + 1;

    }


    /**
     * 验证二叉搜索树 -递归
     *
     * @param root
     * @return
     */
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        boolean leftLess = true;
        boolean rightThen = true;
        if (root.getLeft() != null) {
            leftLess = root.getLeft().getValue() < root.getValue();
        }
        if (root.getRight() != null) {
            rightThen = root.getRight().getValue() > root.getValue();
        }
        if (!leftLess || !rightThen) {
            return false;
        }
        return isValidBST(root.getLeft()) &&
                isValidBST(root.getRight());

    }

}
