public class DeathEater extends Monster implements Combatable {
	public DeathEater(Complex mana) {
		super(mana);
	}

	@Override
	public double getCombatScore() {
		Complex mana = getMana();
		return Math.sqrt(mana.getRe() * mana.getRe() + mana.getIm() * mana.getIm());
	}
}
