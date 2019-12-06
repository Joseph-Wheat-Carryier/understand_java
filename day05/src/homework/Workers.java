package homework;

public class Workers implements Employee{
    /*5）普通员工类，实现员工接口
    属性：
    工作的小时
    基本工资
    方法：
    1. 设置工作的小时
    2. 重写计算工资的方法：
    当每月工作的小时数超过196 小时时，超出的部分按每小时200 元。
    基本工资+（工作的小时-196）*200。*/
    private String name;
    private String eNum;
    private double sal;
    private int workHours;
    private double baseSal;

    Workers(String name, String eNum, double baseSal) {
        this.name = name;
        this.eNum = eNum;
        setBaseSal(baseSal);
    }

    void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setBaseSal(double baseSal) {
        this.baseSal = baseSal;
    }

    @Override
    public String geteNum() {
        return this.eNum;
    }

    @Override
    public double getSal() {
        return this.sal;
    }

    @Override
    public void calSal() {
        if(this.workHours<196){
            this.sal = this.baseSal;
        }else {
            this.sal = this.baseSal + (workHours-196)*200;
        }
    }

    @Override
    public String toString(){
        return String.format(
                "姓名:%s\n" +
                        "工号:%s\n"+
                        "薪水:%.2f\n",this.name,this.eNum,this.sal
        );
    }
}
