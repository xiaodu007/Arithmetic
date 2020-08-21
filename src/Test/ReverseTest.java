package Test;

/**
 * Created by July on 2020/8/19
 */
public class ReverseTest {
    public static int reverse (int x){
        int revnum = 0;
        for(int i = 1; x / i > 0; i = i * 10){
            int num = (x / i) % 10;
            revnum = revnum * 10 + num;
        }
        return revnum;
    }

    public static void main(String[] args) {
        int res = reverse(123);
        System.out.println(res);
    }
}
