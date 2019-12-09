package homework;

public class Test {
    public static void main(String[] args) {
        /*6）在 main  函数中生成
        一个公司对象；
        一个小时工的对象，每小时工资10，工作 200 小时；
        一个小时工的对象，每小时工资10，工作 230 小时；
        一个销售员工的对象，销售额5000；
        一个销售员工的对象，销售额200000；
        一个普通员工对象，工作小时205 小时。
        将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
        该发的工资总和。*/
        JewelryCompany tiffny = new JewelryCompany();
        HourWorker hourWorker1 = new HourWorker("小时工1", "h001");
        HourWorker hourWorker2 = new HourWorker("小时工2", "h002");
        Sellers sellers1 = new Sellers("销售1", "s001", 0);
        Sellers sellers2 = new Sellers("销售1", "s001", 0);
        Workers workers1 = new Workers("员工1", "w001", 0);
        Workers workers2 = new Workers("员工1", "w001", 0);

        hourWorker1.setSalPerHour(10);
        hourWorker1.setWorkHours(200);
        hourWorker2.setSalPerHour(10);
        hourWorker2.setWorkHours(230);


        sellers1.setSellSum(5000);
        sellers2.setSellSum(200000);

        workers1.setWorkHours(205);
        workers2.setWorkHours(200);

        tiffny.employees.add(hourWorker1);
        tiffny.employees.add(hourWorker2);
        tiffny.employees.add(sellers1);
        tiffny.employees.add(sellers2);
        tiffny.employees.add(workers1);

        for (int i = 0; i < tiffny.employees.size(); i++) {
            tiffny.employees.get(i).calSal();
        }

        System.out.printf("公司因发工资总和为%.2f\n", tiffny.getSumSal());

        for (Employee e : tiffny.employees) {
            System.out.println(e.toString());
        }
        System.out.println("程序结束");
    }
}
