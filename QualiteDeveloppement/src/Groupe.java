public class Groupe {

	Theme[] sesThemes;
	private int idGroupe;
	private String nomGroupe;
	private String MDP;
	private float limiteBudget;
	private int nbMembres;

	public String getNomGroupe() {
		return this.nomGroupe;
	}

	public void setNomGroupe(String nomGroupe) {
		this.nomGroupe = nomGroupe;
	}

	public String getMDP() {
		return this.MDP;
	}

	public void setMDP(String MDP) {
		this.MDP = MDP;
	}

	public float getLimiteBudget() {
		return this.limiteBudget;
	}

	public void setLimiteBudget(float limiteBudget) {
		this.limiteBudget = limiteBudget;
	}

	public int getNbMembres() {
		return this.nbMembres;
	}

	public void setNbMembres(int nbMembres) {
		this.nbMembres = nbMembres;
	}

	/**
	 * 
	 * @param nomGroupe
	 */
	public Groupe(String nomGroupe) {
		// TODO - implement Groupe.Groupe
		throw new UnsupportedOperationException();
	}

}