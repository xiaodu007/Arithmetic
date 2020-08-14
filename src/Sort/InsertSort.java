package Sort;

import java.util.Arrays;

/**
 * Created by July on 2020/7/10
 * 插入排序
 * 将一个数据插入到已经排好的有序数据中，从而得到一个新的个数加一的有序数组，比如将数组第一个元素当成有序数组，用第二个来比较并加入到数据中
 */
public class InsertSort {

    public static void main(String[] args) {
        //初始化数组
        int[] arrays = {4, 2, 1, 3};
        //交换变量
        int temp;


        for (int i = 1; i < arrays.length; i++) {

            temp = arrays[i];
            //当前元素和前一位进行比较
            int j = i - 1;
            //如果前一位大于当前位置的元素，则将前一位的元素后移一位
            while (j >= 0 && arrays[j] > temp){

                arrays[j+1] = arrays[j];
                //不断前移直到最开始
                j--;
            }

            //如果当前位元素大于前一位，则说明已经为正确排序则将当前位元素插入有序数组的后一位
            arrays[j+1] = temp;
        }

        System.out.println(Arrays.toString(arrays));

    }
}
