public class Knight extends Fighter {
    public Knight(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double score;
        // Trường hợp đặc biệt: nếu ground là số chính phương
        if (Utility.isSquare(Battle.GROUND)) {
            score = getBaseHp() * 2;
        }
        // Trường hợp thông thường
        else if (getWp() == 1) {
            score = getBaseHp();
        }
        else {
            score = getBaseHp() / 10.0;
        }
        return Math.min(score,999);
    }
}
