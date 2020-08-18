package Sort;

/**
 * Created by July on 2020/8/18
 * 汉诺塔算法  典型的递归案例
 */
public class Hanoi {
    public static void hanoi(int n, char start, char assist, char target){
        System.out.println("n=" + n);
        if (n == 1){
            System.out.println(start + "---->" + target);
        }else {
            hanoi(n-1, start, target, assist);
            System.out.println(start + "---->" + target);

            hanoi(n-1, assist, start, target);
        }
    }

    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
}
