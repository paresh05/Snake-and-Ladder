package com.bridgelabz;

public class Snakenladder {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Snake and Ladder Game!");
		int positionplayer1 = 0;
		System.out.println("Roll the Dice Player A");
		int dice1= ((int) Math.floor(Math.random()*10)%6)+1;
		System.out.println("Player A, the value is " + dice1);
		
	}
}