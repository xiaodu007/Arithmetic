package Tree;

/**
 * Created by July on 2020/8/13
 */
public class TraversalTree {
    /**
     * 先序遍历
     * 顺序：根->左->右
     */
    public static void preTraverseBTree(TreeNode rootTreeNode){

        if (rootTreeNode != null){

            System.out.println(rootTreeNode.getValue());

            preTraverseBTree(rootTreeNode.getLeftTreeNode());

            preTraverseBTree(rootTreeNode.getRightTreeNode());

        }

    }
    /**
     * 中序遍历
     * 顺序：左->根->右
     */
    public static void inTraverseBTree(TreeNode rootTreeNode){

        if (rootTreeNode != null){

            inTraverseBTree(rootTreeNode.getLeftTreeNode());

            System.out.println(rootTreeNode.getValue());

            inTraverseBTree(rootTreeNode.getRightTreeNode());

        }

    }
    /**
     * 后序遍历
     * 顺序：左->右->根
     */
    public static void bacTraverseBTree(TreeNode rootTreeNode){

        if (rootTreeNode != null){

            bacTraverseBTree(rootTreeNode.getLeftTreeNode());

            bacTraverseBTree(rootTreeNode.getRightTreeNode());

            System.out.println(rootTreeNode.getValue());

        }

    }
}
