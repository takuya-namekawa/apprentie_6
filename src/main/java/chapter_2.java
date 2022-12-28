public class chapter_2 {
    public static void main(String[] args) {
      sum(30);
      sum2(3, 4);
      int sumtotal =  sum3(10, 10);
        System.out.println(sumtotal);
    }
    public static void sum(int x) {
        System.out.println(x + 20);
    }

    public static void sum2(int x,int y) {
        System.out.println(x + y);
    }

    public static int sum3(int x, int y) {
        return x + y;
    }
}
