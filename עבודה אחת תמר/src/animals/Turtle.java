package animals;

import diet.*;
import mobility.*;

public class Turtle extends Chew {
	private double Age;

	public Turtle(String name, int Age) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(80, 0));
		super.setWeight(1.0);
		setAge(Age);
	}
	public Turtle(String name, int Age,Point point) {
		super(name);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(80, 0));
		}
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setWeight(1.0);
		setAge(Age);
	}
	public Turtle(String name) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(80, 0));
		super.setWeight(1.0);
		setAge(1);
	}
	public Turtle(String name,Point point) {
		super(name);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(80, 0));
		}
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setWeight(1.0);
		setAge(1);
	}

	public double getAge() {
		return this.Age;
	}

	public boolean setAge(double trunkLength) {
		if (0 <= trunkLength && trunkLength <= 500) {
			this.Age = trunkLength;
			return true;
		}
		setAge(1);
		return false;
	}

	public String gettaype() {
		return "Turtle";
	}
}
