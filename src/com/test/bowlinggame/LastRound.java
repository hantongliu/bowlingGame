package com.test.bowlinggame;

public class LastRound extends Round {
	private final int thirdScore;

	LastRound(int firstScore, int secondScore, int thirdScore) {
		// TODO Auto-generated constructor stub
		super(firstScore, secondScore);
		this.thirdScore = thirdScore;
	}
	
	@Override
	public int getScore() {
		return firstScore + secondScore + thirdScore;
	}

}
