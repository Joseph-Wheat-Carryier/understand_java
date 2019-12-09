package Test;

public class DouDiZhu {
    String[] pai = new String[54];
    String[] diZhu = new String[20];
    String[] farmer1 = new String[17];
    String[] farmer2 = new String[17];
    String[] painum = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",};

    DouDiZhu() {

        for (int i = 0; i < 40; i += 13) {
            for (int j = 0; j < painum.length; j++) {
                pai[i + j] = painum[j];
            }
        }

        pai[52] = "小王";
        pai[53] = "大王";

            this.fapai(diZhu);

            this.fapai(farmer1);

            this.fapai(farmer2);
    }

    private void fapai(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * (pai.length));
            arr[i] = pai[num];
            pai = shaopai(pai, num);
        }
    }

    String[] shaopai(String[] arr, int num) {
        String[] arr1 = new String[arr.length - 1];
        for (int i = 0; i < num; i++) {
            arr1[i] = arr[i];
        }

        for (int i = num; i < arr1.length; i ++) {
            arr1[i] = arr[i + 1];
        }

        return arr1;
    }


    public static void main(String[] args) {
        DouDiZhu d = new DouDiZhu();

        for (int i = 0; i <d.diZhu.length; i++) {
            System.out.print(d.diZhu[i]+" ");
        }

        System.out.println("\n");
        for (int i = 0; i <d.farmer1.length; i++) {
            System.out.print(d.farmer1[i]+" ");
        }

        System.out.println("\n");

        for (int i = 0; i <d.farmer2.length; i++) {
            System.out.print(d.farmer2[i]+" ");
        }

    }
}
