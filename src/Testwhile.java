/**
 * Created by Administrator on 2018/4/19.
 *
 * 循环 While;do While;for的用法
 */
public class Testwhile {
   /*
    public static void main(String[] args)
    {
        int x = 10;
        while(x<20)
        {
            System.out.println("value of x:" +x);
            x++;
            System.out.print("\n");
        }
    }
    */
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};
        for(int x : numbers){
           //x等于30跳出循环
            if(x==30)
            {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("\n");
        String[] names ={"James", "Lsrry", "Tom", "Lacy"};
        for(String name : names){
            System.out.print(name);
            System.out.print(",");
        }
    }
}
