package Sort;

/**
 * Created by July on 2020/8/17
 */
public class HeapSort {

    public static void main(String[] args) {

        int[] arrays = {6, 3, 8, 5, 2, 7, 34, 62, 12, 2, 3, 7, 99, 102, 89};
        maxHeapify(arrays, arrays.length - 1);
        int size = arrays.length - 1;

        for (int i = 0; i < arrays.length; i++) {
            //交换末尾和根节点
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;
            //调整位置
            heapify(arrays, 0, size);
            size--;
        }
        System.out.println(arrays);

    }

    /**
     *构建大顶堆
     */

    public static void maxHeapify(int[] arrays, int size){
        for (int i = arrays.length - 1; i >= 0 ; i--) {
            heapify(arrays, i, size);
        }
    }

    /**
     *建堆
     */
    public static void heapify(int[] arrays, int currentRootNode, int size){

        if (currentRootNode < size){
            //左右子树的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //
            int max = currentRootNode;

            if (left < size){
                if (arrays[max] < arrays[left]){
                    max = left;
                }
            }
            if (right < size){
                if (arrays[max] < arrays[right]){
                    max = right;
                }
            }
            if (max != currentRootNode){
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;

                //继续比较，直到完成一次建堆
                heapify(arrays, max, size);
            }

        }


    }
}
