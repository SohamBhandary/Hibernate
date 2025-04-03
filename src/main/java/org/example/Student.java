package org.example;

public class Student {
    private  int  rollNo;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", rollNo=" + rollNo +
                ", sName='" + sName + '\'' +
                '}';
    }

    private String sName;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }




    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}
