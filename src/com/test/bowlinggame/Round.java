package com.test.bowlinggame;

public class Round {
	protected final int firstScore;
	protected final int secondScore;
	private Round nextRound;

	private static final int FULL_SCORE = 10;

	public Round(int firstScore, int secondScore) {
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}

	public int getScore() {
		// TODO Auto-generated method stub
		return getOwnScore() + getBonus();
	}

	public int getOwnScore() {
		return firstScore + secondScore;
	}

	public int getBonus() {
		int bonus = 0;
		if (strike()) {
			bonus = nextRound.getStrikeBonus();
		} else if (spare()) {
			bonus = nextRound.firstScore;
		}
		return bonus;
	}

	public int getStrikeBonus() {
		int bonus;
		if (strike() && getNextRound() != null) {
			bonus = firstScore + getNextRound().firstScore;
		} else {
			bonus = firstScore + secondScore;
		}
		return bonus;
	}

	public boolean strike() {
		return FULL_SCORE == firstScore;
	}

	public boolean spare() {
		return FULL_SCORE == getOwnScore();
	}

	public Round getNextRound() {
		return nextRound;
	}

	public void setNextRound(Round nextRound) {
		this.nextRound = nextRound;
	}

	public Round getLastRound() {
		// TODO Auto-generated method stub
		if (nextRound == null)
			return this;
		return nextRound.getLastRound();
	}

}
