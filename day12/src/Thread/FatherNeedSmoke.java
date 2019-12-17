package Thread;

public class FatherNeedSmoke {
    public static void main(String[] args) {


        System.out.println("老爸想抽烟");
        System.out.println("发现烟没了");
        System.out.println("让儿子出去买烟");
        System.out.println("给了儿子200块💰");
        Son son = new Son();
        Thread t = new Thread(son);
        t.start();
        try {
            t.join();     //father被阻塞
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("老爸接过烟，把零钱给了儿子");

    }


    public static class Son implements Runnable {
        @Override
        public void run() {
            System.out.println("拿着老爸的💰出去了");
            System.out.println("路边有个游戏厅，进去玩会");
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException E) {
                    E.printStackTrace();
                }
                System.out.printf("%d秒过去了", i + 1);
            }
            System.out.println("赶紧买烟去");
            System.out.println("手拿一包中华回家了");

        }
    }
}
