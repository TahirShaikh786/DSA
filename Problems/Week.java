import java.util.Scanner;

public class Week {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter WeekDays :- ");
		int day = sc.nextInt();

		switch (day) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("WeekDays");
				break;
		
			case 6:
			case 7:
				System.out.println("Weekends");
				break;

			default:
				System.out.println("Not a Valid Number of weeks");
		}
	}
}
