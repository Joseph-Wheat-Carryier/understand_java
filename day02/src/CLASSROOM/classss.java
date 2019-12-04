package CLASSROOM;

class classss {
    private Student[] student = new Student[10];
    classss(){
        for(int i=0;i<student.length;i++){
            student[i] = new Student();
        }
    }
    private int sum = 0;

    int sum(){
        for(Student temp:student){
            sum += temp.getScore();
        }
        return sum;
    }

    double avg(){
        return (double)sum/10;
    }

    void setStudent(int index, String name, int score){
        student[index].setName(name);
        student[index].setScore(score);
    }

    int getMaxNum() {
        return this.student.length;
    }
}
