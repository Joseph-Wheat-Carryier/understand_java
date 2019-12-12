package StudentScore;

import java.util.TreeSet;

public class StudentScore {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new MyComparable());
        for(int i=0;i<40;i++){
            students.add(new Student(String.format("J%02d",i),String.format("18020%02d",i)));
        }

        for(Student s:students){
            System.out.println(s.toString());
        }
    }
}
