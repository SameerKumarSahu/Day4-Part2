import java.util.Random;

public class SnackAndLadder {

	public static void main(String[] args) {

		Random num = new Random();
		int dice = 1 + num.nextInt(6);

		System.out.println("Player rolled the dice and get the number is "+dice);
	}
}
