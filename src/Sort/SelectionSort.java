package Sort;

/*
* 选择排序
* 每一次将待排序数据元素中的最大(小)值找出来放在数组的最末尾(起始)位置，直至所有元素排序完成
* 属于不稳定排序方法，因为在排序过程中会改变初始数组中相同值元素的顺序
*
* */

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        //初始化数组
        int[] arrays = {3, 2, 1, 1, 4, 5, 5, 2, 3, 7, 6, 8, 9};
        //当前圈中所找到的最大值的角标
        int pos;
        //交换变量
        int temp;
        //外层循环，确定需要排序的趟数
        for (int i = 0; i < arrays.length - 1; i++) {
            //新的趟数将角标重新赋值为0
            pos = 0;
            //内层循环，遍历数组所有元素，找到最大值角标
            for (int j = 0; j < arrays.length-i; j++) {
                if (arrays[j] > arrays[pos]) {
                    pos = j;
                }

            }
            //交换，将最大值放在数组的末尾
            temp = arrays[pos];
            arrays[pos] = arrays[arrays.length-1-i];
            arrays[arrays.length-i-1] = temp;
        }

        System.out.println(Arrays.toString(arrays));
    }
}
