/**
 * Created by Administrator on 2018/4/16.
 */

public class Employeetest {

        String name;
        int age;
        String designation;
        double salary;

        // Employee 类的构造
        public Employeetest(String name){
            this.name = name;
        }
    //设置age的值
        public void empAge(int empAge){
            age = empAge;
}

//设置designation的值
    public void empDesignation(String empDesig){
        designation = empDesig;
    }

    //设置salary的值
    public void empSalary(double empSalary){
        salary = empSalary;
    }

    //打印的信息
    public void printEmployeetest(){
        System.out.println("名字：" +name);
        System.out.println("年龄：" +age);
        System.out.println("职位：" +designation);
        System.out.println("薪水：" +salary);
    }
    public static void main(String args[]){
    //使用构造器创建两个对象
    Employeetest empOne = new Employeetest("Run00b1");
    Employeetest empTwo = new Employeetest("RUN00B2");

    //调用两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("高级程序员");
        empOne.empSalary(1000);
        empOne.printEmployeetest();

        empTwo.empAge(21);
        empTwo.empDesignation("菜鸟程序员");
        empTwo.empSalary(500);
        empTwo.printEmployeetest();

    }

}

