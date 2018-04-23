/**
 * Created by Administrator on 2018/4/16.
 */

public class PrimitiveTypeTest {
    public static void main(String[] args){
        double d = Math.random();
        int e = 1 +(int)(d*6);
        if(e==6){
            System.out.println("大树运气不错");
        }else if(e>=4) {
            System.out.println("运气花不错");
        }else if(e>=2){
            System.out.println("一般");

        }
        for(int j = 1; j<=9; j++)
        {
            for(int i = 1; i<=j; i++)
            {
                System.out.print(j + "*" + i + "=" +(j*i)+ "\t");
            }
            System.out.println();
        }

        char c1 = 'a';    //char自动类型转换为int
        int il = c1;     //char自动类型转换为int
        System.out.println("char自动类型转换为int后的值等于" +il);
        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" +i2);






       /*
        //byte
        System.out.println("基本类型：byte 二进制位数：" +Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" +Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" +Byte.MAX_VALUE);

        //short
        System.out.println("基本类型：short 二进制：" +Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" +Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" +Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println("基本类型：long 二进制位数：" +Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最大值：Integer.MIN_VALUE=" +Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" +Integer.MAX_VALUE);
        System.out.println();

        //long
        System.out.println("基本类型：long 二进制：" +Long.SIZE);
        System.out.println("包装类：java.lang.long");
       */


    }
}
