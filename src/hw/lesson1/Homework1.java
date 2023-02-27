package hw.lesson1;
import java.util.Scanner;
class Homework1 {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Scanner scanner = new Scanner(System.in);
		System.out.println("input name...");
		System.out.println("Hello "+ scanner.nextLine()  );
		scanner.close();
	}
}