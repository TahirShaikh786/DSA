import java.util.Scanner;

public class Nested_Switch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Employee ID:- ");
		int empID = in.nextInt();
		System.out.println("Enter Your Department");
		String department = in.next();

		switch (empID) {
			case 1:
				System.out.println("Voc");
				break;
			case 2:
				System.out.println("Com");
				break;
			case 3:
			System.out.println("Emp ID = 3");
				switch (department.toLowerCase()) {
					case "it":
						System.out.println("It Department");
						break;
					case "management":
						System.out.println("Management Department");
						break;
				
					default:
						System.out.println("Not a valid Department");
				}
			break;
		
			default:
				System.out.println("Not a Valid ID");
		}
	}
}
