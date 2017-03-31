
/**@java.util.Scanner Package*/
import java.util.Scanner;

/** @create a class */
public class TestDemo {

	private static Scanner obj;

	public static void main(String[] args) {
		double a;
		/** @create a object */
		obj = new Scanner(System.in);
		/** @Print a message */
		System.out.println("Enter the number");
		a = obj.nextDouble();
		/** @CONDITION FOR A NUMBER TO BE */
		if (a == 0)
			/** @Print a message */
			System.out.println("You entered \nZERO ");
		/** @else condition */
		else if (a > 0)
			/** @Show a message if fine positive number */
			System.out.println("You have entered \n positive number");
		/** @Print a message */
		else
			/** @Show a message if fine negative number */
			System.out.println("You have entered a \n negative value");
	}

}