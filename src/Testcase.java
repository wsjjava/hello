/**
 * Created by Administrator on 2018/4/17.
 */
public class Testcase {
    public static void test01(){
        int oddsun = 0;
        int evensun = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddsun += i;
            } else {
                evensun += i;
            }
        }
        System.out.println("奇数和" + oddsun);
        System.out.println("偶数和" + evensun);
    }
    public static int add(int a, int b){
        int sum = a + b;
        return sum;    //结束方法运行；返回值
    }
    //设计方法的原则：方法的本意是功能块
    public static void test02(int a, int b, int c){
        for(int j = 1; j<=a; j++){
            if(j%b==0){
                System.out.print(j + "\t");
            }
            if(j%(b*c) ==0){
                System.out.println();
            }
        }
    }
    //使用递归算阶乘

    public static void main(String[] args){
        test01();
        test02(100,6,3); //100之间可以被6整除，每行输出3个
        int s = add(3, 5);
        System.out.println(s);
    }
}
