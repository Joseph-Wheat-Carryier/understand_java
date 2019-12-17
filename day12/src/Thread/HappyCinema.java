package Thread;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HappyCinema {
    public static void main(String[] args) throws InterruptedException {
        Cinema happyCinema = new Cinema(20);
        Customer customer1 = new Customer("小李", happyCinema, "1,2,3");
        Customer customer2 = new Customer("小王", happyCinema, "6,4,5");
        Customer customer3 = new Customer("小张", happyCinema, "7,8,9");
        Customer customer4 = new Customer("压缩", happyCinema, "10,11,12");
        Customer customer5 = new Customer("Ez", happyCinema, "13,14,15");
        Customer customer6 = new Customer("潘森", happyCinema, "16,17,18");
        Customer customer7 = new Customer("螳螂", happyCinema, "19,20,21");
        Customer customer8 = new Customer("船长",happyCinema,"19,20");

        Thread t1 = new Thread(customer1);
        Thread t2 = new Thread(customer2);
        Thread t3 = new Thread(customer3);
        Thread t4 = new Thread(customer4);
        Thread t5 = new Thread(customer5);
        Thread t6 = new Thread(customer6);
        Thread t7 = new Thread(customer7);
        Thread t8 = new Thread(customer8);




        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }

    public static class Cinema {
        final List<Integer> seats;

        Cinema(int capacity) {
            seats = new ArrayList<>(capacity);
            for (int i = 1; i <= capacity; i++) {
                seats.add(i);
            }
        }
    }

    public static class Customer implements Runnable {
        String name;
        final Cinema cinema;
        private List<Integer> needsSeat = new ArrayList<>();

        Customer(String name, Cinema cenima, String a) {
            this.name = name;
            this.cinema = cenima;
            String[] temp = a.split(",");
            for (String str : temp) {
                needsSeat.add(Integer.valueOf(str));
            }
        }

        boolean orderTickets(Cinema cinema, List<Integer> needsSeat) {
            if (cinema.seats.containsAll(needsSeat)) {
                cinema.seats.removeAll(needsSeat);
                return true;
            } else {
                return false;
            }
        }

        @Override
        public void run() {
            try {
                Thread.sleep((int)(Math.random()*1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (cinema) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                boolean flag = orderTickets(cinema, needsSeat);

                if (flag) {
                    System.out.printf("%s,购票成功,位置%s,祝您观影愉快\n", this.name, needsSeat.toString());
                    System.out.printf("剩余座位:%s\n", cinema.seats.toString());
                } else {
                    Set<Integer> lack = new HashSet<>();
                    for (Integer i : needsSeat) {
                        if (!cinema.seats.contains(i)) {
                            lack.add(i);
                        }
                    }
                    System.out.printf("%s,购票失败,座位%s已订/不存在\n", this.name, lack.toString());
                    System.out.printf("剩余座位:%s\n", cinema.seats.toString());
                }
            }
        }
    }
}

