package com.test.bowlinggame;

public class BowlingGameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BowlingGameTest test = new BowlingGameTest();
		test.example();
		//test.allStrike();
	}

	public void example() {
		BowlingGame game = new BowlingGame();
		game.play(10, 0);
		game.play(9, 1);
		game.play(5, 5);
		game.play(7, 2);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(9, 0);
		game.play(8, 2);
		game.play(9, 1, 10);
		game.getTotalScore();
	}

	public void allStrike() {
		BowlingGame game = new BowlingGame();
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 0);
		game.play(10, 10, 10);
		game.getTotalScore();
	}

}
