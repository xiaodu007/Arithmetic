package Sort;


/*冒泡排序例子
算法描述：1. i 从0开始， i 与 i+1 ⽐较，如果 i>i+1 ，那么就互换
        2. i 不断增加，直到 i<n-1 （n是数组元素的个数， n-1 是数组已经最后1个元素）一趟下来，
            可以让数组元素中最大值排在数组的最后⾯
*/

public class BubbleSort {


    public static void main(String[] args) {

        int[] arrays = {3, 2, 5, 4, 1};
        int temp;
        int isChange;
        int num = 0;
        //外层循环，确定圈数
        for (int i = 0; i < arrays.length-1; i++) {
            //每圈初始化
            isChange=0;
            //内层循环，确定需要比较的次数
            for (int j = 0; j < arrays.length-i-1; j++) {
                //前一位和后一位比较，若前一位比后一位大则交换
                if (arrays[j] > arrays[j+1]) {
                    temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1] = temp;

                    //如果发生了置换则值改变
                    isChange = 1;
                }

            }
            //如果此次循环值没有改变则说明未发生置换则排序完成
            if (isChange == 0) {
                break;
            }

            num++;
        }

        System.out.println(num);
        System.out.println(arrays.toString());

    }
}
