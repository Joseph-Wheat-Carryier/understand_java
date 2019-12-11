package Test;

public class Bonus {
    private static String[] reduce(String[] arr, int num) {
        String[] arr1 = new String[arr.length - 1];
        int count = 0;
        System.arraycopy(arr, 0, arr1, 0, num);
        System.arraycopy(arr,num+1,arr1,num,arr1.length-num);

            return arr1;
    }

    public static void main(String[] args) {

        String[] student = {"陈加元", "居柳明", "丁佐根", "朱珍雪", "高新光", "沙天杰", "季伟宽", "张福山", "赵洋", "郑嘉路", "张宇婷", "翁传杰"};
        String[] result = new String[student.length];
        for (int i = 0; i < result.length; i++) {
            int random = (int) (Math.random() * (student.length));
            result[i] = student[random];
            student = Bonus.reduce(student, random);
            System.out.println(result[i]);
        }
    }
}
