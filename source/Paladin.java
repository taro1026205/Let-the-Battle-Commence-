public class Paladin extends Knight {
	public Paladin(int baseHp, int wp) {
		super(baseHp, wp);
	}

	@Override
	public double getCombatScore() {
		if (isFibonacci(getBaseHp()) && getBaseHp() >= 2) {
			return 1000 + getFibonacciIndex(getBaseHp());  
		}
		return getBaseHp() * 3;
	}

	private boolean isFibonacci(int n) {
		if (n <= 0) return false;
		int a = 0, b = 1;
		while (b < n) {
			int temp = b;
			b = a + b;
			a = temp;
		}
		return b == n;
	}

	private int getFibonacciIndex(int n) {
		if (n <= 0) return 0;
		if (n == 1) return 1;
		int a = 0, b = 1;
		int index = 1;
		while (b < n) {
			int temp = b;
			b = a + b;
			a = temp;
			index++;
		}
		return index;
	}
}
