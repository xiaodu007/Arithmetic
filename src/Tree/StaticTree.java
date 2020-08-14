package Tree;

import static Tree.TraversalTree.*;

/**
 * Created by July on 2020/8/11
 * 静态创建二叉树
 * 遍历二叉树
 */
public class StaticTree {

    public static void main(String[] args) {
        //根节点
        TreeNode treeNode1 = new TreeNode(10);
        //根左节点
        TreeNode treeNode2 = new TreeNode(9);
        //根右节点
        TreeNode treeNode3 = new TreeNode(20);
        //根右节点的子左节点
        TreeNode treeNode4 = new TreeNode(15);
        //根右节点的子右节点
        TreeNode treeNode5 = new TreeNode(35);
        //插入根节点的子左右节点
        treeNode1.setLeftTreeNode(treeNode2);
        treeNode1.setRightTreeNode(treeNode3);
        //插入根右节点的子左右节点
        treeNode3.setLeftTreeNode(treeNode4);
        treeNode3.setRightTreeNode(treeNode5);

//        preTraverseBTree(treeNode1);
          inTraverseBTree(treeNode1);
//        bacTraverseBTree(treeNode1);

        int hight = GetHight.getHight(treeNode1);

        System.out.println(hight);

    }



}
