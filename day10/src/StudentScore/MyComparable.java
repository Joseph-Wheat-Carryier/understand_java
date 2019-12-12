package StudentScore;

import java.util.Comparator;

public class MyComparable implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num1 = (int) ((o1.getScore() - o2.getScore()) * 100);
        return num1 != 0 ? num1 : new Integer(o1.getStuNum()) - new Integer(o2.getStuNum());
    }
}