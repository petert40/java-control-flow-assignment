import java.util.ArrayList;
import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		// 1. Initialize any variables and objects you need (i.e. a scanner, some
		// counters for a total running sum, and a number tracking the # of scores inputted
		int score = 2;
		int scoreSum = 0;
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		// 2. Make a loop that repeatedly asks the user for a number and won't stop
		// until the user answers using a negative number
		// 3. Add some error checking for when a user inputs a number over 100 - we
		// should skip that input and start the loop
		// over to ask again
		while(score >= 0){
			System.out.println("Please give me an Integer number(enter a negative value to end): ");
			score = scanner.nextInt();
			if(score > 100){
				System.out.println("Invalid score! digit shall be from 0 to 100.");
				continue;
			}
			if(score >= 0){
				list.add(score);
				scoreSum += score;
			}
		}
		scanner.close();
		System.out.println("Loop done!");

		
		
		
		
		// 4. Calculate the average of all scores collected during the loop
		Double avgScore = (double)scoreSum / list.size();
		System.out.println("The average of all scores collected during the loop is: " + String.format("%.2f",avgScore));
		
		
		// 5. Display the average grade and corresponding message
		// - If over 90: "Excellent Work!"
		// - If over 80: "Good Job!"
		// - If over 70: "Keep it up!"
		// - anything else: "Let's work hard to get those grades up!"
		if(avgScore > 90){
			System.out.println("Excellent WOrk!");
		}else if(avgScore > 80){
			System.out.println("Good Job!");
		}else if(avgScore > 70){
			System.out.println("Keep it up!");
		}else{
			System.out.println("Let's work hard to get those grades up!");
		}

		
		
		
		
	}
}