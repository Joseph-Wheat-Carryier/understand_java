package StudentScoreSystemManagement;

public class Test {
    public static void main(String[] args) {
        ExamSystem.initDataBase();
        ExamSystem system = new ExamSystem();
        system.startExam();
    }
}
