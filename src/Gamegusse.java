/**
 * Created by Administrator on 2018/4/20.
 */
import java.util.Random;
import java.util.Scanner;

/**
 * 猜拳游戏思路
 * 1.定义输入函数
 * 2.提示用户输入猜拳数值
 * 3.定义随机数作为电脑数值
 * 4.能够像等就是打平，不能利用&&,\\逻辑符判断输赢
 * 5.设定数值1-石头 2-剪刀 3-布
 */
public class Gamegusse {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("猜拳游戏");
        System.out.println("请输入一个数值");
        int X = in.nextInt(); //用户输入的数
        Random on = new Random();
        int y = on.nextInt(3)+1;
        if(X>=4 || X==0)
        {
            System.out.println("亲，请正确输入"+X);
        }else
        {
            if(X==y)
            {
                if(X==1)
                {
                    System.out.println("你：石头......电脑：石头......很幸运打成平手");
                }else if(X==2)
                {
                    System.out.println("你：剪刀......电脑：剪刀......很幸运打成平手");
                }else
                {
                    System.out.println("你：布..........电脑：布......很幸运打成平手");
                }

            }else if(X==1&&y==2 || X==2&&y==3 ||X==3&&y==1)
            {
                if(X==1&&y==2)
                {
                    System.out.println("你：石头.......电脑：剪刀......恭喜你赢啦");
                }else if(X==2&&y==3)
                {
                    System.out.println("你：剪刀.....电脑：布.....恭喜你赢了");
                }else
                {
                    System.out.println("你：布.....电脑：石头/......恭喜你赢了");
                }
            }else{  //判断输的情况
                if(X==1&&y==3)
                {
                    System.out.println("你;石头.....电脑;布......很遗憾你输了");
                }else if(X==2&&y==1)
                {
                    System.out.println("你;剪刀.....电脑;石头.....很遗憾你输了");
                }else
                {
                    System.out.println("你:布------电脑:剪刀    PK:很遗憾,输了!");
                }
            }
        }

    }

}
