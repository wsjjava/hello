
/**
 * Created by Administrator on 2018/4/19.
 *
 *测试Scanner类的使用，如何接受键盘的输入
 *
 */
import java.util.Scanner;
public class Testscan {
    public static void test01(){
        System.out.println("请输入一个人整数:");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
        {
            System.out.println("你输入的数是偶数");
        }else
        {
            System.out.println("你输入的数为奇数");
        }
    }
    public static void test02(){
        System.out.println("请输入年份：");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0&&year%100!=0||year%400==0)
        {
            System.out.println("您输入的年分为闰年");

        } else {
            System.out.println("您输入的年份为平年");
        }

    }
    public static void main(String[] args)
    {
        test01();
        test02();

    }

}
