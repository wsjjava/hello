/**
 * Created by Administrator on 2018/4/19.
 */
public class Testswich {
    public static void main(String args[])
    {
        char grade = 'c';
        switch(grade)
        {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case'c':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
                break;
            case 'F':
                System.out.println("你还需要努力");
                break;
            default:
                System.out.println("未知等级");

        }
        System.out.println("你的等级是"+grade);

    }
}
