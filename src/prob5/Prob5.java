package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		while (true) {

			int minNumber = 1;
			int maxNumber = 100;

			Random random = new Random();
			int correctNumber = random.nextInt(maxNumber) + minNumber;

			int countTry = 0;
			System.out.println( "수를 결정하였습니다. 맞추어 보세요:" );

			while (true) {

				countTry++;

				System.out.println(minNumber + "-" + maxNumber);
				System.out.print(countTry + ">>");


				int guessNumber = scanner.nextInt();
				if (guessNumber == correctNumber) {
					System.out.println("맞췄습니다.");
					break;
				}

				if (guessNumber > correctNumber) {
					System.out.println("더 낮게");
					maxNumber = guessNumber;
				} else {
					System.out.println("더 높게");
					minNumber = guessNumber;
				}
			}

			System.out.print("다시 하시겠습니까?(y/n)>>");
			String answer = scanner.next();
			if( answer.equals("y") == false ) {
				break;
			}
		}
		
		scanner.close();
	}
}