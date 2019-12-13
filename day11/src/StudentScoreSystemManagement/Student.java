package StudentScoreSystemManagement;

public class Student {
    private String name;
    private int Score;
    private String stuNum;
    private String password;

    public Student(String name, String stuNum, String password) {
        this.name = name;
        this.stuNum = stuNum;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }

    public String getStuNum() {
        return stuNum;
    }

    public void setStuNum(String stuNum) {
        this.stuNum = stuNum;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
