public class chapter_2_2 {
    //2つの引数を掛け算するmultiメソッドを定義して
    //このメソッドを呼び出して、「120ｘ120」の計算結果を表示してください。
    public static void main(String[] args) {
        int num = multi(120,120);
        System.out.println(num);
    }
    public static int multi(int x, int y) {
        return x * y;
    }
}
