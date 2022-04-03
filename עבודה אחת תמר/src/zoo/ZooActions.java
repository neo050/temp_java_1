package zoo;

import mobility.*;
import food.*;
import java.lang.Object;
import java.util.*;
import animals.*;

public class ZooActions {
	public static boolean eat(Object animal, IEdible food) {
		if (animal instanceof Animal) {
			System.out.println(((Animal) animal).gettaype());
			return ((Animal) animal).eat(food);

		} else
			return false;
	}

	public static boolean move(Object animal, Point point) {
		if (animal instanceof Animal) {
			if (Point.cheackBounderies(point)) {
				if (((Animal) animal).move(point) > 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		} else
			return false;
	}

	public static void main(String args[]) {
		String are_animals[] = { "1.Lion", "2.Bear", "3.Elephant", "4.Giraffe", "5.Turtle" };
		System.out.println("Hi there,how much animals have in are zoo?");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		if (size < 3)
			size = 3;
		int case_number;
		Animal animals[] = new Animal[size];
		for (int i = 0; i < size; ++i) {
			System.out.println("Choose your animal:");
			System.out.println(Arrays.toString(are_animals));
			case_number = sc.nextInt();
			while (case_number < 1 || case_number > 5) {
				System.out.println("please enter values between 1=>5\r\n");
				case_number = sc.nextInt();
			}
			System.out.println("The name of are animal:");
			String name = sc.next();
			switch (case_number) {
			case 1: {
				animals[i] = new Lion(name);
				break;
			}
			case 2: {
				animals[i] = new Bear(name);
				break;
			}
			case 3: {
				animals[i] = new Elephant(name);
				break;
			}
			case 4: {
				animals[i] = new Giraffe(name);
				break;
			}
			case 5: {
				animals[i] = new Turtle(name);
				break;
			}
			default: {

			}
			}

		}

		for (int i = 0; i < animals.length; ++i) {
			System.out.println("Select a value for variable X, and then select a value for the Y variable:");
			int x, y;
			x = sc.nextInt();
			y = sc.nextInt();
			if (Point.cheackBounderies(new Point(x, y))) {
				ZooActions.move(animals[i], new Point(x, y));
			} else
				System.out.println("Error: The point values are not in the range\r\n" + "");
		}
		sc.close();
		Random rand = new Random();
		for (int i = 0; i < (animals.length / 2); ++i)
		{
			int lottery_1,lottery_2;
			lottery_1=rand.nextInt(animals.length+1);
			lottery_2=rand.nextInt(animals.length+1);
			eat(animals[lottery_1],animals[lottery_2]);

		}
		System.exit(0);

	}
}
