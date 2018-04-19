/**
 * Created by Administrator on 2018/4/19.
 *
 *测试Scanner类的使用，如何接受键盘的输入
 *
 */
public class TestScanner {
    public static void main(String[] args)
    {
        System.out.println("请输入一个数");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("这是一个偶数");
        }else
        {
            System.out.println("这是一个奇数");
        }
    }
}
