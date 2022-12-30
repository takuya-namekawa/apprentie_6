public class chapter_5 {
    public static void main(String[] args) {
        String[] enemies = {"スライム", "ドラゴン", "モンスター"};
        for (String enemy : enemies) {
            attac(enemy);
        }

    }
    public static void attac(String target) {
        System.out.println("勇者は" + target + "を攻撃した");
        int hit = (int)(Math.random() * 10 + 1);
        if (hit < 6) {
            System.out.println(target + "に、" + hit + "のダメージを与えた！");
        } else {
            System.out.println("クリティカルヒット" + target + "に、100のダメージを与えた");
        }

    }
}
