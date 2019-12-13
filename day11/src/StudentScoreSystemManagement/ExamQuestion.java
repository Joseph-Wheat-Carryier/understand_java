package StudentScoreSystemManagement;

public class ExamQuestion {
    static int queNum=0;
    String queContent;
    String queOption;
    String queAnswer;

    public ExamQuestion(String queContent, String queOption, String queAnswer) {
        this.queContent = queContent;
        this.queOption = queOption;
        this.queAnswer = queAnswer;
        queNum++;
    }

    public static int getQueNum() {
        return queNum;
    }

    public static void setQueNum(int queNum) {
        ExamQuestion.queNum = queNum;
    }

    public String getQueContent() {
        return queContent;
    }

    public void setQueContent(String queContent) {
        this.queContent = queContent;
    }

    public String getQueOption() {
        return queOption;
    }

    public void setQueOption(String queOption) {
        this.queOption = queOption;
    }

    public String getQueAnswer() {
        return queAnswer;
    }

    public void setQueAnswer(String queAnswer) {
        this.queAnswer = queAnswer;
    }

    public ExamQuestion() {
        queNum++;
    }
}
