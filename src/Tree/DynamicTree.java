package Tree;

import static Tree.TraversalTree.*;

/**
 * Created by July on 2020/8/11
 * 动态创建二叉查找树
 * 即右节点的值大于左节点
 */
public class DynamicTree {

    //创建方法
    public static void createTree(TreeRoot treeRoot, int value){
        //如果根节点为空，则将第一个值作为根节点
        if (treeRoot.getTreeRoot() == null){
            TreeNode treeNode = new TreeNode(value);
            treeRoot.setTreeRoot(treeNode);
        }else {

            TreeNode tempRoot = treeRoot.getTreeRoot();

            while (tempRoot != null){
                //如果当前值大于当前根节点则往右添加
                if (value > tempRoot.getValue()){
                    //右边节点是否为空，若空则添加，不空将右节点的右节点设为当前根节点继续向右添加
                    if (tempRoot.getRightTreeNode() == null){
                        tempRoot.setRightTreeNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getRightTreeNode();
                    }

                }else {
                    //左边节点是否为空，若空则添加，不空将左节点的左节点设为当前根节点继续向左添加
                    if (tempRoot.getLeftTreeNode() == null){
                        tempRoot.setLeftTreeNode(new TreeNode(value));
                        return;
                    }else {
                        tempRoot = tempRoot.getLeftTreeNode();
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arrays = {2, 3, 1, 4, 5};

        TreeRoot root = new TreeRoot();

        for (int value: arrays) {
            createTree(root, value);
        }
        //preTraverseBTree(root.getTreeRoot());
        inTraverseBTree(root.getTreeRoot());
        //bacTraverseBTree(root.getTreeRoot());
        int max = GetMax.getMax(root.getTreeRoot());
        System.out.println("最大值：" + max);

    }



}
