package homework;

public class HourWorker implements  Employee  {
    private String name;
    private String eNum;
    private double sal;
    private int workHours;
    private double salPerHour;

    HourWorker(String name, String eNum) {
        this.name = name;
        this.eNum = eNum;
    }

    void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    void setSalPerHour(double salPerHour) {
        this.salPerHour = salPerHour;
    }

    public String geteNum(){
        return this.eNum;
    }

    public double getSal(){
        return this.sal;
    }

    public void calSal(){
        this.sal =  workHours*salPerHour;
    }

    public String toString(){
        return String.format(
            "姓名:%s\n" +
            "工号:%s\n"+
            "薪水:%.2f\n",this.name,this.eNum,this.sal
        );
    }
}
