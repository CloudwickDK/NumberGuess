import java.util.Scanner;

public class Number_Guess_Game {

	// define min max as limits
	static int min;
	static int max;

	public Number_Guess_Game(int min, int max) {
		this.min = min;
		this.max = max;
	}

	public static int binary_search() throws NotInRangeIntegerException {

		System.out.print(message1(min, max));

		int mean;
		Scanner input = new Scanner(System.in);
		while (min != max) {
			mean = mean(min, max);
			int answer_bool = 0; //no anwer yet

			Scanner sc = new Scanner(System.in);
			while (answer_bool==0){
				System.out.println("Please answer with a yes or no if your number is bigger than " + mean + "?");
				String answer = sc.next(); // yes or no
				answer_bool = parseAnswer(answer);
			}
			if (answer_bool == 1) { //if positive answer
				min = mean + 1;
			} else { //if negative answer
				max = mean;
			}
		} // while

		System.out.println("Your number is " + max);
		return max;
	}

	static int parseAnswer(String answer) {
		switch (answer) {

		case ("yes"):
		case ("y"):
			return 1; // positive answer

		case ("no"):
		case ("n"):
			return -1; //negative answer
		
		default:
			return 0; //no answer
		}
	}

	 static String message1(int min2, int max2) {
		return "Pick a number between " + min + " and " + max + ".";
	}

	 static int mean(int a, int b) {
		return (a + b) / 2;
	}

	public static void main(String[] args) {

		int min = 2;
		int max = 20;

		Number_Guess_Game game = new Number_Guess_Game(min, max);
		try {
			game.binary_search();

		} catch (NotInRangeIntegerException e) {
			System.out.println("please enter an integer within the specified range.");

		}

	}

}
