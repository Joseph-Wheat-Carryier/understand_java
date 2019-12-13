package StudentScoreSystemManagement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ExamSystem {
    static HashMap<String, Student> students = new HashMap<>();
    static HashMap<Integer, ExamQuestion> questions = new HashMap<>();

    static void initDataBase() {
        for (int i = 0; i < 10; i++) {
            addStu(new Student(String.format("stu%d", i), String.format("No%02d", i), "123456"));
        }

        for (int i = 0; i < 10; i++) {
            String[] option = getRandomOption(Integer.toString(i + i));
            addQue(new ExamQuestion(String.format("%d+%d=\n", i, i), option[0], option[1]));
        }
    }


    static int getRandom(int min, int max) {
        return (int) ((Math.random() + min / (max - min)) * (max - min));
    }

    static String[] getRandomOption(String rightAnswer) {
        String result[] = new String[2];
        String str1[] = {
                String.format("A.%d  B.%d C.%d D.%s", getRandom(0, 1000), getRandom(0, 1000), getRandom(0, 1000), rightAnswer),
                String.format("A.%d  B.%d C.%s D.%d", getRandom(0, 1000), getRandom(0, 1000), rightAnswer, getRandom(0, 1000)),
                String.format("A.%d  B.%s C.%d D.%d", getRandom(0, 1000), rightAnswer, getRandom(0, 1000), getRandom(0, 1000)),
                String.format("A.%s  B.%d C.%d D.%d", rightAnswer, getRandom(0, 1000), getRandom(0, 1000), getRandom(0, 1000))
        };
        String str2[] = {"D", "C", "B", "A"};
        int index = getRandom(0, 4);
        result[0] = str1[index];
        result[1] = str2[index];
        return result;
    }

    static void addStu(Student stu) {
        students.put(stu.getStuNum(), stu);
    }

    static void addQue(ExamQuestion que) {
        questions.put(ExamQuestion.getQueNum(), que);
    }


    void startExam() {
        System.out.println("开始考试:");
        Scanner scan = new Scanner(System.in);
        String stuNum;
        String pwd;
        do {
            System.out.println("输入用户名:");
            stuNum = scan.nextLine();
            System.out.println("输入密码:");
            pwd = scan.nextLine();
            if (!students.containsKey(stuNum)) {
                System.out.println("找不到用户");
            } else if (!students.get(stuNum).getPassword().equals(pwd)) {
                System.out.println("密码错误");
            }
        } while (!students.containsKey(stuNum) || !students.get(stuNum).getPassword().equals(pwd));
        students.get(stuNum).setScore(executeExam());
    }

    private int executeExam() {
        Scanner scan = new Scanner(System.in);
        String answer;
        int score = 0;
        for (int i = 0; i < ExamQuestion.getQueNum(); i++) {
            System.out.printf("第%d题:\n", i + 1);
            System.out.println(questions.get(i + 1).getQueContent());
            System.out.println(questions.get(i + 1).getQueOption());
            System.out.println("答案:");
            answer = scan.nextLine();
            if (questions.get(i+1).getQueAnswer().equals(answer)) {
                score += 10;
            }
        }
        System.out.printf("考试结束,得分:%d", score);
        return score;
    }

}
