public class chapter_4 {
    //スコープを理解する
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int num = sum(a , b);
        System.out.println();
        System.out.println(num);
        System.out.println(a + "これはmainメソッドの中の変数よ！");
    }
    public static int sum(int x, int y) {//ローカル変数である　この中で定義しているのは上とは別である
        String a = "a = sumメソッドの変数よ！";
        System.out.println(a);
        return x + y;
    }
}
