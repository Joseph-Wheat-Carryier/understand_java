package SelectCourse;

import java.util.HashSet;

public class StudentCourse {
    private HashSet <Student> students = new HashSet<>();
    void add(Student student){
        students.add(student);
    }

    void remove(Student student){
        for(Student student1:students){
            if(student1.equals(student)){
                students.remove(student1);
            }
        }
    }

    void showStudentCourse(){
        for(Student s:students){
            System.out.println(s.toString());
        }
    }


    public static void main(String[] args) {
        Student student1 = new Student("小明","01");
        Student student2 = new Student("小刚","02");
        Course course1 = new Course("语文","A001");
        Course course2 = new Course("数学","A002");
        StudentCourse studentCourse = new StudentCourse();

        studentCourse.add(student1);
        studentCourse.add(student2);

        student1.addCourse(course1);
        student2.addCourse(course1);
        student2.addCourse(course2);

        studentCourse.showStudentCourse();

        student2.delCourse(course1);

        studentCourse.showStudentCourse();
    }
}
