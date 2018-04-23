/**
 * Created by Administrator on 2018/4/20.
 * java中的自动装箱与拆箱
 * 装箱就是自动将基本数据类型转换为包装类型；拆箱就是自动将
 * 包装器类型转换为基本数据类型
 *
 */
public class Number {
    public static void main(String [] args){
        /**
         * Integer il = 128; //装箱相当于Integer.valueOf(128);
         * int t = il; //相当于 il.intValue（)拆箱
         * System.out,println(t);
         */

        /**
         * 对于-128-127（默认是127）之间的值。被装箱后，会被放在内存里进行重用
         * 但是如果超出了这个值，系统会重新new一个对象
         */
        Integer i1 = 200;
        Integer i2 = 200;

        /**
         * 注意 == 与 equals的区别
         * ==它比较的是对象的地址
         * equals比较的是对象的内容
         */

        if(i1.equals(i2))
        {
            System.out.println("true");

        }else
        {
            System.out.println("false");
        }

    }

}
