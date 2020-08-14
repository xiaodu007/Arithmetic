package Tree;

/**
 * Created by July on 2020/8/11
 * 节点类
 * 二叉树分左右以及根节点
 */
public class TreeNode {
    //左节点
    private TreeNode leftTreeNode;
    //右节点
    private TreeNode rightTreeNode;

    private int value;


    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
