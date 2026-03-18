public class Warrior extends Fighter {
    public Warrior(int baseHp, int wp) {
        super(baseHp, wp);
    }

    @Override
    public double getCombatScore() {
        double score;
        // Trường hợp đặc biệt: nếu ground là số nguyên tố
        if (Utility.isPrime(Battle.GROUND)) {
            score = getBaseHp() * 2;
        }
        // Trường hợp thông thường
        else if (getWp() == 1) {
            score = getBaseHp();
        }
        else {
            score = getBaseHp() / 10.0;
        }
        return Math.min(score, 999);
    }
}