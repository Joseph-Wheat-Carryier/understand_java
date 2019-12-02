package com.banyuan.club;

public class ClassRoom {
    int classNum;
    int maxNstu;
    int count;
    Student[] students;

    ClassRoom(int classNum, int maxNstu) {
        this.maxNstu = maxNstu;
        students = new Student[maxNstu];
        this.classNum = classNum;
        count = 0;
    }

    public void addStu(Student student) {
        student.classNum = this.classNum;
        this.students[count] = student;
        student.setStuId("b" + student.getClassNum() + "s" + (count + 1));
        count++;
    }

    public void delStu(String id) {
        for (int i = 0; i < count - 1; i++) {
            if (students[i].stuId.equals(id)) {
                System.arraycopy(students, i + 1, students, i, count - 1 - i);
                students[count - 1] = null;
                System.out.print("delete student successfully\n");
                count--;
                break;
            }
            if (i == count - 1 && !students[i].stuId.equals(id)) {
                System.out.print("no such student");
            }
        }
    }

    public void oderByAge() {
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (students[i].getAge() > students[j].getAge()) {
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }
    }

    public double avgSocre() {
        int sum = 0;
        double avg;
        for (int i = 0; i < count; i++) {
            sum += students[i].score;
        }
        return avg = sum / count;
    }

    public void showNameId() {
        for (int i = 0; i < count; i++) {
            System.out.printf("姓名:%s   学号:%s\n",students[i].name,students[i].stuId);
        }
    }
}
