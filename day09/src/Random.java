public class Random {

    static int random(int min, int max) {
        if (max > min) {
            return (int) ((Math.random() + (double) (min / (max - min))) * (max - min));
        } else if (min == max) {
            return min;
        } else {
            System.out.println("输入不合法");
            return 0;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.print(random(2, 4)+" ");
        }
    }
}
