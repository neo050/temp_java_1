package animals;

import diet.*;
import mobility.Point;

public class Elephant extends Chew {
	private double trunkLength;

	public Elephant(String name, int trunkLength) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(50, 90));
		super.setWeight(500.0);
		settrunkLength(trunkLength);
	}

	public Elephant(String name) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(50, 90));
		super.setWeight(500.0);
		settrunkLength(1);
	}
	public Elephant(String name,Point point) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(50, 90));
		}
		
		super.setWeight(500.0);
		settrunkLength(1);
	}
	public Elephant(String name, int trunkLength,Point point) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setWeight(500.0);
		settrunkLength(trunkLength);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(50, 90));
		}
	}
	public double gettrunkLength() {
		return this.trunkLength;
	}

	public boolean settrunkLength(double trunkLength) {
		if (0.5 <= trunkLength && trunkLength <= 3) {
			this.trunkLength = trunkLength;
			return true;
		}
		settrunkLength(1);
		return false;
	}

	public String gettaype() {
		return "Elephant";
	}
}
