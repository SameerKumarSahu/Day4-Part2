
public class SnackAndLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

		public static void main(String[] args) {

		int playerPosition = 0;
		int winningPosition = 100;
			System.out.println("player start position = " +playerPosition);

			while (playerPosition <= winningPosition)
			{
				int diceRoll=(int) (Math.random()*(6)+1);
				System.out.println("Dice roll : " +diceRoll);


				int option = (int)((Math.random()*3));
				System.out.println("option : " +option);


				if (playerPosition + diceRoll == 100)
				{
					playerPosition +=diceRoll;
					System.out.println("player reached the winning position " + playerPosition+"....");
					break;
				}

				switch(option)
				{
					case NO_PLAY:
					System.out.println("player stay in the same position");
					System.out.println("");
					playerPosition +=0;
					break;

					case LADDER:
					playerPosition +=diceRoll;
					System.out.println("player moves ahead by " +diceRoll);
					System.out.println("");
					break;

					case SNAKE:
						if(playerPosition < diceRoll ) 
						{
							System.out.println("player position goes below 0 ");
							playerPosition=0;
							System.out.println("So, player position is  set to : " +playerPosition);
							System.out.println("");
							break;
						}

						else {
							playerPosition -= diceRoll;
							System.out.println("player moves behind by " +diceRoll);
							System.out.println("");
							break;
							}
				}

				System.out.println("player position : " +playerPosition);
	}

}
}
