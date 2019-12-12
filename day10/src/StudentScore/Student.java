package StudentScore;


import java.util.Comparator;

@SuppressWarnings("all")

public class Student {
    private String name;
    private String stuNum;
    private double score;

    public Student() {
    }

    public Student(String name, String stuNum) {
        this.name = name;
        this.stuNum = stuNum;
        setScore();
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

    public double getScore() {
        return score;
    }

    public void setScore() {
        this.score =  Math.random() * 100;
    }


    /*@Override
    public int compare(Student o1,Student o2) {
        int num1 = (int) ((o1.getScore() - o2.getScore()) * 100);
        return num1 == 0 ? num1 : new Integer(o1.getStuNum()) - new Integer(o2.getStuNum());
    }*/

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Student)) {
            return false;
        }
        Student stu = (Student) obj;
        return stu.getName().equals(this.getName());
    }

    @Override
    public String toString() {
        return String.format("姓名:%s  学号:%s  成绩:%.2f", this.getName(), this.getStuNum(), this.getScore());
    }
}
