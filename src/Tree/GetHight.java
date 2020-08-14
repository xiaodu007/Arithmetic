package Tree;

/**
 * Created by July on 2020/8/13
 */
public class GetHight {

    public static int getHight(TreeNode treeNode){
        if (treeNode == null){
            return 0;
        }else{
            int left = getHight(treeNode.getLeftTreeNode());
            int right = getHight(treeNode.getRightTreeNode());

            int max = left;

            if (right > left){
                max = right;
            }

            return max + 1;
        }
    }
}
