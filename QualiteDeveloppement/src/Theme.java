public class Theme {

	Groupe sonGroupe;
	Proposition[] sesProposition;
	private int idTheme;
	private String nomTheme;
	private float limiteBudget;

	public float getLimiteBudget() {
		return this.limiteBudget;
	}

	public void setLimiteBudget(float limiteBudget) {
		this.limiteBudget = limiteBudget;
	}

	/**
	 * 
	 * @param nomTheme
	 * @param limiteBudget
	 */
	public void Theme(String nomTheme, float limiteBudget) {
		throw new UnsupportedOperationException();
	}

}