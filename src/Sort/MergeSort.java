package Sort;

/**
 * Created by July on 2020/8/10
 * 将两个已经排好序的数组合并成一个有序的数组，归并排序
 * 步骤：遍历两个数组，比较它们的值。谁比较小放进大数组中，直到遍历完成，剩下未遍历完的有序数据紧接着排列到已排序的大数组后面
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] arrays = {8, 2, 5, 1, 3, 1, 2, 1, 9, 5, 4, 6, 7, 5, 3, 7, 5, 9};
        mergeSort(arrays, 0, arrays.length-1);
        System.out.println("输出：" + arrays);
    }

    public static void mergeSort(int[] array, int L, int R){
        //如果只有一个元素则无需排序
        if ( L == R){
            return;
        }else {
            //取中间位，拆分
            int M = (L + R) / 2;
            //拆分左边
            mergeSort(array, L, M);
            //拆分右边
            mergeSort(array,M+1, R);
            //合并
            merge(array, L, M+1, R);
        }
    }
    //合并
    public static void merge(int[] array, int L, int M, int R){

        //初始化左边数组
        int[] leftArrays = new int[M - L];
        //初始化右边数组
        int[] rightArrays = new int[R - M +1];

        //向左右两个数组中填充内容
        for (int i = L; i < M; i++) {
            leftArrays[i-L] = array[i];
        }
        for (int i = M; i <= R; i++) {
            rightArrays[i - M] = array[i];
        }

        int i = 0;
        int j = 0;
        int k = L;

        while (i < leftArrays.length && j < rightArrays.length){
            //比较左右两边元素大小，将小的放入大数组中，并移动指针到下一位
            if (leftArrays[i] < rightArrays[j]){
                array[k] = leftArrays[i];
                k++;
                i++;
            }else {
                array[k] = rightArrays[j];
                k++;
                j++;
            }

        }

        //如果左边的数组还没完，右边数组已经遍历结束，则左边剩下的填入大数组中
        while (i < leftArrays.length){
            array[k] = leftArrays[i];
            k++;
            i++;
        }

        //和上面正好相反
        while (j < rightArrays.length){
            array[k] = rightArrays[j];
            k++;
            j++;
        }


    }

}
