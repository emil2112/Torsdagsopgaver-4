import java.util.Scanner;

class Main{

	public static void main(String[] args){
		int retirementAge = 67;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type your name");
		String input = scanner.nextLine();
		System.out.println("Hello "+input);
		System.out.println("Please type your age");

		int age = scanner.nextInt();
		System.out.println("You are "+age+" years old");
		System.out.println("You have "+(retirementAge-age)+" years to retirement");
	}
}