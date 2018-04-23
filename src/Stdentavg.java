/**
 * Created by Administrator on 2018/4/20.
 */
import java.util.Scanner;
public class Stdentavg {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int grade = 0;
        int sum =0;
        for(int i = 0; i<=5; i++)
        {
            System.out.println("请输入第"+i+"位学生的成绩:");
            grade = sc.nextInt();
            sum +=grade;
        }
        double avg = sum/5 ;
        System.out.println(  "所有同学的平均成绩为"+ avg );
    }
}
