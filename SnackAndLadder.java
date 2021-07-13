import java.util.Random;

public class SnackAndLadder {

	public static void main(String[] args) {

		Random num = new Random();
		int dice = 1 + num.nextInt(6);

		System.out.println("Player rolled the dice and get the number is "+dice);
		int option = 1 + num.nextInt(3);
		System.out.println("Option is "+ option);
		int noplayer =1;
		int ladder =2;
		int snake = 3;
		switch (option) {
		case 1:
			if (noplayer == option) {
				System.out.println("There is no Player ");
				System.out.println(" The Player stay in the same position ");
			}
		case 2 :
			if (ladder== option) {
				System.out.println("There is a Ladder");
				System.out.println("The Player moves ahead by "+dice+" number received by the dice");
			}
		case 3 :
			if (snake== option) {
				System.out.println("There is a Snake");
				System.out.println("The Player moves behind by "+dice+" number received by the dice");
			}
		}
	}
}
