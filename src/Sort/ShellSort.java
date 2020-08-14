package Sort;

/**
 * Created by July on 2020/8/11
 * 希尔排序是插入排序的进阶版，将数组分成多个数组，先进行数组内排序，在将数组进行排序
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] arrays = {6, 3, 4, 10, 1, 2, 66, 32, 98, 3, 5};
        shellSort(arrays);
        System.out.println(arrays);
    }



    public static void shellSort(int[] arrays){
        //设置增量，进行循环，每次取一半
        for (int step = arrays.length / 2; step > 0 ; step /= 2) {
            //从增量的那组开始进行插入排序
            for (int i = step; i < arrays.length; i++) {

                int j = i;
                int temp = arrays[j];

                while (j - step >= 0 && arrays[j - step] > temp){
                    arrays[j] = arrays[j - step];
                    j = j -step;

                }
                arrays[j] = temp;

            }

        }

    }
}
