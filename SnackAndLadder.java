
public class SnackAndLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {

		int initialPositionP1 = 0;
		int initialPositionP2 = 0;
		int winningPosition = 100;

		System.out.println("player1 start position = " +initialPositionP1);
		System.out.println("player2 start position = " +initialPositionP2);
		System.out.println("");

			while (initialPositionP1 <= winningPosition && initialPositionP2 <= winningPosition)
			{
				System.out.println("Player1 Position is " + initialPositionP1);
				int diceRoll=(int) (Math.random()*(6)+1);

				System.out.println("Player1 Roll the Dice : " +diceRoll);

				int option1 = (int)((Math.random()*3));
				System.out.println("Player1 got the option : " +option1);

				if( initialPositionP1+ diceRoll > 100 && option1==1)
				{
					System.out.println("player1 position goes above the 100");
					System.out.println("so, player1 stay in the same position ");
					System.out.println("");
					continue;
				}
				else if (initialPositionP1 + diceRoll == 100 && option1==1)
				{
					initialPositionP1 +=diceRoll;
					System.out.println("player1 reached the winning position " + initialPositionP1+"....");
					break;
				}

				switch(option1)
				{

					case NO_PLAY:

					System.out.println("player1 stay in the same position");
					System.out.println("");
					break;

					case LADDER:
					initialPositionP1 +=diceRoll;
					System.out.println("player1 moves ahead by " +diceRoll);
					System.out.println("Player1 Position is " + initialPositionP1);
					System.out.println("");
					break;

					case SNAKE:

						if(initialPositionP1 < diceRoll )
						{
							System.out.println("player1 position goes below 0 ");
							initialPositionP1=0;
							System.out.println("So, player1 position is  set to : " +initialPositionP1);
							System.out.println("");
							break;
						}
						else
						{
							initialPositionP1-= diceRoll;
							System.out.println("player1 moves behind by " +diceRoll);
							System.out.println("Player1 Position is " + initialPositionP1);
							System.out.println("");
							break;
						}
					}


				System.out.println("Player2 Position is " + initialPositionP2);
				int diceRolls=(int) (Math.random()*(6)+1);

				System.out.println("Player2 roll the Dice  : " +diceRolls);
				int option2 = (int)((Math.random()*3));

				System.out.println("Player2 got the option : " +option2);

				 if( initialPositionP2+ diceRolls > 100 && option2==1)
				{
					System.out.println("player2 position goes above the 100");
					System.out.println("so, player2 stay in the same position ");
					System.out.println(" ");
					continue;
				}

				else if (initialPositionP2 + diceRolls == 100 && option2==1)
				{
					initialPositionP2 +=diceRolls;
					System.out.println("player2 reached the winning position " + initialPositionP2+"....");
					break;

				}

				switch(option2)
				{

					case NO_PLAY:

					System.out.println("player2 stay in the same position");
					System.out.println("");
					break;

					case LADDER:
					initialPositionP2 +=diceRolls;
					System.out.println("player2 moves ahead by " +diceRolls);
					System.out.println("Player2 Position is " + initialPositionP2);
					System.out.println("");
					break;

					case SNAKE:

						if(initialPositionP2 < diceRolls)
						{
							System.out.println("player2 position goes below 0 ");
							initialPositionP2=0;
							System.out.println("So, player2 position is  set to : " +initialPositionP2);
							System.out.println("");
							break;
						}
						else
						{
						initialPositionP2-= diceRolls;
						System.out.println("player2 moves behind by " +diceRolls);
						System.out.println("Player2 Position is " + initialPositionP2);
						System.out.println("");
						break;
						}
					}

				}
	}

}

