package Tree;

/**
 * Created by July on 2020/8/13
 */
public class GetMax {
    public static int getMax(TreeNode rootTreeNode){
        if (rootTreeNode == null){
            return -1;
        }else {
            int left = getMax(rootTreeNode.getLeftTreeNode());
            int right = getMax(rootTreeNode.getRightTreeNode());

            int currentRootValue = rootTreeNode.getValue();

            int max = left;
            if (right > left){
                max = right;
            }

            if (currentRootValue > max){
                max = currentRootValue;
            }

            return max;
        }
    }
}
