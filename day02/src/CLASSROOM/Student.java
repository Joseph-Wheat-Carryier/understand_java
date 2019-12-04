package CLASSROOM;

import java.util.Scanner;

public class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getScore() {
        return score;
    }

    void setScore(int score) {
        this.score = score;
    }

    public static void main(String[] args) {
        classss []classss = new classss[3];
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        for(int i=0;i<classss.length;i++){
            classss[i] = new classss();
        }
        for(int i=0;i<classss.length;i++){
            System.out.printf("第%d个班级\n请输入学生姓名、成绩\n",i+1);
            for(int j=0;j<classss[i].getMaxNum();j++){
                System.out.printf("第%d个学生\n姓名:\n",j+1);
                String name = scan.nextLine();
                System.out.print("成绩:\n");
                int score = scan2.nextInt();
                classss[i].setStudent(j,name,score);
            }
        }

        for(int i=0;i<classss.length;i++){
            System.out.printf("第%d个班的总成分:%d,平均分:%f\n",i+1,classss[i].sum(),classss[i].avg());
        }
    }
}
