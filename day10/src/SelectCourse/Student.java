package SelectCourse;

import sun.tools.tree.InstanceOfExpression;

import java.util.Arrays;
import java.util.Iterator;
import java.util.HashSet;

public class Student {
    private String name;
    private String stuNum;
    private HashSet <Course>course= new HashSet<>();

    public Student(){
    }

    public Student(String name,String stuNum){
        this.name = name;
        this.stuNum = stuNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    void addCourse(Course c){
        course.add(c);
    }

    void delCourse(Course c){
        course.remove(c);
    }

    public Course selCourse(String name){
        for(Course temp:course){
            if(temp.getName().equals(name)){
                return temp;
            }
        }
        System.out.println("查无此课");
        return null;
    }

    void Change(String name){
        Iterator <Course>iterator = course.iterator();
        while (iterator.hasNext()){
            Course temp = iterator.next();
            if(temp.getName().equals(name)){
                temp.setName(name);
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student)){
            return false;
        }
        Student stu = (Student)obj;
        return stu.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return String.format("姓名:%s  学号:%s\n选课:%s", this.getName(), this.getStuNum(), Arrays.toString(course.toArray()));
    }
}
