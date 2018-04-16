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

}
