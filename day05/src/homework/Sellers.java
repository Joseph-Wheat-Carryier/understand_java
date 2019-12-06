package homework;

/*4）销售员工类，实现员工接口
        属性：
        销售的总金额
        基本工资

        方法
        1. 设置销售的总金额
        2. 重写计算工资方法：
        基本工资+提成。
        提成的计算：
        当销售额再10000 以下时，则提成10%，
        等销售额再10000-100000之间是，则提成15%。
        再 100000以上是，提成18%。*/

public class Sellers implements Employee{
    private String name;
    private String eNum;
    private double sal;
    private double sellSum;
    private double baseSal;

    Sellers(String name, String eNum, double baseSal) {
        this.name = name;
        this.eNum = eNum;
        this.baseSal = baseSal;
    }


    void setSellSum(double sellSum){
        this.sellSum = sellSum;
    }

    @Override
    public double getSal() {
        return this.sal;
    }

    @Override
    public void calSal(){
        double commission;
        if(sellSum<10000){
            commission = sellSum*0.1;
        }else if(sellSum>=10000&&sellSum<100000){
            commission = sellSum*0.15;
        }else{
            commission = sellSum*0.18;
        }
        this.sal =  baseSal + commission;
    }

    @Override
    public String geteNum() {
        return this.eNum;
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
