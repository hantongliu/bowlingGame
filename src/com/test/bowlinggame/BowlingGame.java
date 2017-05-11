package com.test.bowlinggame;

public class BowlingGame {
	private Round round;

	// Rounds 1-10
	public void play(int firstScore, int secondScore) {
		addRound(new Round(firstScore, secondScore));
	}

	// Round 10 with bonus
	public void play(int firstScore, int secondScore, int thirdScore) {
		addRound(new LastRound(firstScore, secondScore, thirdScore));
	}

	// Link all rounds
	private void addRound(Round round) {
		// TODO Auto-generated method stub
		if (this.round == null) {
			this.round = round;
		} else {
			this.round.getLastRound().setNextRound(round);
		}
	}
	
	// Get total scores
	public void getTotalScore() {
		int roundScore = 0, totalScore = 0, roundNum = 1;
		Round roundIterator = round;
		while (roundIterator != null) {
			roundScore = roundIterator.getScore();
			totalScore += roundScore;
			System.out.println("Round " + roundNum + "  Round Score: " + roundScore + "  Total Score: " + totalScore);
			roundIterator = roundIterator.getNextRound();
			roundNum++;
		}
	}
	
}
