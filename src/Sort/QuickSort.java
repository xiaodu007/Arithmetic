package Sort;

/**
 * Created by July on 2020/7/10
 * 通过一趟排序将要排序的数据分成两部分，其中一部分的数据都要比另一部分小，
 * 然后再按照此方法继续分别对这两部分数据排序，直到整个数组变成有序序列
 */
public class QuickSort {

    public static void main(String[] args) {
        //初始化数组
        int[] arrays = {1, 5, 6, 25, 3, 15, 4, 2};
        long start = System.currentTimeMillis();
        quickSort(arrays, 0, 7);
        long end = System.currentTimeMillis();
        long spend = end - start;
        System.out.println("耗时：" + spend);
    }

    public static void quickSort(int[] arry, int L, int R){
        int i = L;
        int j = R;
        //设置节点
        int pivot = arry[(L+R)/2];
        //设置循环结束的条件
        while(i <= j){
            //比较左侧
            while(pivot > arry[i])
                i++;
            //比较右侧
            while(pivot < arry[j])
                j--;
            //找到需要交换的，进行交换
            if (i <= j){
                int temp = arry[i];
                arry[i] = arry[j];
                arry[j] = temp;
                i++;
                j--;
            }

        }
        //对上次循环节点的左侧继续进行排序
        if (L < j){
            quickSort(arry, L, j);
        }
        //对右侧继续进行排序
        if (i < R){
            quickSort(arry, i, R);
        }
    }
}
