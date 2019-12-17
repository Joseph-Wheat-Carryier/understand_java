package Thread;

public class Test extends Thread{
    int i =0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Test(1));
        Thread t2 = new Thread(new Test(2));
        Thread t3 = new Thread(new Test(3));
        Thread t4 = new Thread(new Test(4));
        Thread t5 = new Thread(new Test(5));

        t2.setPriority(2);
        t3.setPriority(3);
        t1.setPriority(10);

        t4.setPriority(1);
        t5.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }

    Test(int i){
        this.i = i;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println(i);
    }
}
