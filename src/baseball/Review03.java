package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam[] baseballTeams = new BaseBallTeam[] { new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4),
                new BaseBallTeam("横浜DeNAベイスターズ", 73, 68, 2), new BaseBallTeam("阪神タイガース", 68, 71, 4),
                new BaseBallTeam("読売ジャイアンツ", 68, 72, 3), new BaseBallTeam("広島東洋カープ", 66, 74, 3),
                new BaseBallTeam("中日ドラゴンズ", 66, 75, 2), };
        for(BaseBallTeam team : baseballTeams) {
            team.report();
        }
        /*
         * 東京ヤクルトスワローズ の2022年の成績は 80勝 59敗 4分、勝率は 0.5755395683453237です。
         * 横浜DeNAベイスターズの2022年の成績は 73勝 68敗 2分、勝率は 0.5177304964539007です。
         * 阪神タイガース の2022年の成績は 68勝 71敗 4分、勝率は 0.4892086330935252です。
         * 読売ジャイアンツ の2022年の成績は 68勝 72敗 3分、勝率は0.4857142857142857です。
         * 広島東洋カープ の2022年の成績は 66勝 74敗 3分、勝率は 0.4714285714285714です。
         * 中日ドラゴンズ の2022年の成績は 66勝 75敗 2分、勝率は 0.46808510638297873です。
         */
    }

}
