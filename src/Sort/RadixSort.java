package Sort;

/**
 * Created by July on 2020/8/17
 * 基数排序，将待排序元素分配到桶中，进行排序
 * 对有负数和0的数列难以进行排序
 */
public class RadixSort {


    //找到数组最大值
    public static int finMax(int[] arrays, int L, int R){
        if (L == R){
            return arrays[L];
        }else {

            int a = arrays[L];
            int b = finMax(arrays, L +1, R);

            if (a > b){
                return a;
            }else {
                return b;
            }
        }
    }

    public static void radixSort(int[] arrays){
        int max = finMax(arrays, 0, arrays.length - 1);
        //要遍历的次数由最大值决定
        for (int i = 1; max / i > 0; i = i * 10) {
            int[][] buckets = new int[arrays.length][10];

            //获取每一位数字
            for (int j = 0; j < arrays.length; j++){
                //拿到每一位元素的个位
                int num = (arrays[j] / i) % 10;
                //放入筒子
                buckets[j][num] = arrays[j];
            }

            int k = 0;
            //取回10个桶子里的数
            for (int j = 0; j < 10; j++) {
                for (int l = 0; l < arrays.length; l++) {

                    if (buckets[l][j] != 0){
                        arrays[k++] = buckets[l][j];
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = {6, 4322, 432, 344, 55, 234, 45};
        radixSort(arrays);
        System.out.println(arrays);
    }
}
