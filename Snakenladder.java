package com.bridgelabz;

public class Snakenladder {
	public static final int NO_PLAY=1;
	public static final int LADDER=2;
	public static final int SNAKE=3;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Snake and Ladder Game!");
		int positionplayer1 = 0;
		int dicecount1=0;
		while(positionplayer1<100)
		{
			System.out.println("Roll the Dice Player A");
			int dice1= ((int) Math.floor(Math.random()*10)%6)+1;
			dicecount1=dicecount1+1;
			System.out.println("Player A, the value is " + dice1);
			int nextmove1=(int) Math.floor(Math.random()*10)%4;
			switch(nextmove1) {
			case NO_PLAY:
				positionplayer1+=0;
				System.out.println("No Play");
				break;
			case LADDER:
				positionplayer1+=dice1;
				System.out.println("Ladder!");
				break;
			case SNAKE:
				positionplayer1-=dice1;
				System.out.println("Snake");
				break;
			default:
				positionplayer1+=dice1;
				System.out.println("Move "+dice1);
			}
			
			if(positionplayer1<0)
				positionplayer1=0;
			System.out.println("The position of Player A is "+positionplayer1);
			if(positionplayer1>100)
				positionplayer1-=dice1;
		}
		
		System.out.println("The Dice count of Player A is: " + dicecount1);
		System.out.println("The Position of Player A is: "+positionplayer1);
	}
}