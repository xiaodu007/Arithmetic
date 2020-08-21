package Tree;

/**
 * Created by July on 2020/8/21
 */
public class GetMin {
    public static int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            int left = minDepth(root.getLeftTreeNode());
            int right = minDepth(root.getRightTreeNode());

            int  min = left;
            if(right < left ){
                min = right;
            }
            return min +1;
        }

    }

    public static void main(String[] args) {

        System.out.println();
    }
}
