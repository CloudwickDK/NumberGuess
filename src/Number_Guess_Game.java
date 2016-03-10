import java.util.Scanner;

public class Number_Guess_Game {

	int min;
	int max;

	public Number_Guess_Game(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public void binary_search() throws NotInRangeIntegerException {

		System.out.println("Pick a number between " + min + " and " + max + ".");
		int mean;
		Scanner input = new Scanner(System.in);
		// int num = in.nextInt();
		
		while (min != max) {
			mean = min + (max - min) / 2;
			boolean answer_bool = false;

			Scanner sc = new Scanner(System.in);
			System.out.println("Please answer with a yes or no if your number is bigger than " + mean + "?");
			String answer = sc.next(); // yes or no

			switch(answer) {

			case("yes"):
				answer_bool = true; break;

			case("no"):
				answer_bool = false; break;

			default:
				System.out.println("Please answer with a yes or no.");
			}
			
			if (answer_bool) {
				min = mean + 1;
			} else {
				max = mean;
			}
		}//while

		System.out.println("Your number is " + max);
	}

	public static void main(String[] args) {

		int min = 2;
		int max = 20;

		Number_Guess_Game game = new Number_Guess_Game(min, max);
		try {
			game.binary_search();
			
		}catch (NotInRangeIntegerException e) {
			System.out.println("please enter an integer within the specified range.");

		}

	}

}
