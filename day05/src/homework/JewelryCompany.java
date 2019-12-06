package homework;

import java.util.ArrayList;

public class JewelryCompany {
    ArrayList <Employee> employees = new ArrayList<>();
    /*方法：
            1, 添加一个员工。
            2,  通过员工的名字来删除员工。
            3,  通过员工的名字来显示员工的工资。
            4,  输出所有员工的工资和。*/

    void addEmpolyees(Employee e){
        this.employees.add(e);
    }


    void delEmpolyees(String eNum){
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).geteNum().equals(eNum)){
                employees.remove(i);
                break;
            }
        }
    }

    void showEmpInfo(String eNum){
        for (Employee employee : employees) {
            if (employee.geteNum().equals(eNum)) {
                System.out.println(employee.toString());
                break;
            }
        }
    }

    double getSumSal(){
        double result = 0;
        for(Employee temp:employees){
            result+=temp.getSal();
        }
        return result;
    }

}
