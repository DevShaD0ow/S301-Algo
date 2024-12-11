public class Proposition {

	Theme[] sonTheme;
	private int idProposition;
	private float budgetProposition;
	private int nbVotePour;
	private int nbVoteContre;
	private int nbVoteNull;

	public float getBudgetProposition() {
		return this.budgetProposition;
	}

	public void setBudgetProposition(float budgetProposition) {
		this.budgetProposition = budgetProposition;
	}

	public int getNbVotePour() {
		return this.nbVotePour;
	}

	public int getNbVoteContre() {
		return this.nbVoteContre;
	}

	public int getNbVoteNull() {
		return this.nbVoteNull;
	}

	public void setNbVoteNull(int nbVoteNull) {
		this.nbVoteNull = nbVoteNull;
	}

	/**
	 * 
	 * @param id
	 * @param budgetProposition
	 * @param nbVotePour
	 * @param nbVoteContre
	 */
	public Proposition(int id, float budgetProposition, int nbVotePour, int nbVoteContre) {
		// TODO - implement Proposition.Proposition
		throw new UnsupportedOperationException();
	}

}