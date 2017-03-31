
/**@java.util.Scanner Package*/
import java.util.Scanner;

/** @create a class */
public class FindGrade {

	private static Scanner obj;

	public static void main(String[] args) {
		/** @Declaration **/
		int age, marks;
		System.out.println(" Enter age ");
		/** @Create a object for user interface **/
		obj = new Scanner(System.in);
		age = obj.nextInt();
		/** @Show message for user for entering input **/
		System.out.println(" Enter marks");
		marks = obj.nextInt();
		/** @ Condition for Grade A */
		if (marks > 70)
			/** @Output for Grade A */
			System.out.println("your grade is \n A");
		/** @Condition A Grade for age relaxation */
		else if (marks > 60 && age < 15)
			/** @Output for Grade A */
			System.out.println(" your grade is \n A");
		/** @Condition for B Grade */
		else if (marks > 60 && marks < 70)
			/** @Output for Grade B */
			System.out.println(" your grade is \n B");
		/** @Condition B Grade for age relaxation */
		else if (marks > 45 && marks < 60 && age < 15)
			/** @Output for Grade B */
			System.out.println(" your grade is \n B");
		/** @Condition for C Grade */
		else if (marks < 61)
			/** @Output for Grade C */
			System.out.println(" your grade is \n C");
		/** @Condition C Grade for age relaxation */
		else if (marks < 45 && age < 15)
			/** @Output for Grade C */
			System.out.println(" your grade is \n C");
	}

}
