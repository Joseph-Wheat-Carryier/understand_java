package day03.account;

public class Customer extends Account{
    private String firstName;
    private String lastName;


    public Customer(String f,String l){
        this.firstName = f;
        this.lastName = l;
    }

    public Customer(String f,String l,String id,double balance,double annualInterestRate){
        this(f,l);
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    @Override
    public String toString() {
        return "姓名:"+this.getFirstName()+this.getLastName()+'\n'+"账户id:"+this.getId()+'\n'
                +"账户余额:"+this.getBalance()+'\n'+"年利率:"+this.getAnnualInterestRate()*100+"%"+'\n';
    }
}
