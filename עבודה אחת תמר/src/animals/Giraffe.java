package animals;

import diet.*;
import mobility.*;

public class Giraffe extends Chew {
	private double neckLength;

	public Giraffe(String name, int neckLength) {
		super(name);
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(50, 0));
		super.setWeight(450.0);
		setNeckLength(neckLength);
	}

	public Giraffe(String name) {
		super(name);
		super.setLocation(new Point(50, 0));
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setWeight(450.0);
		setNeckLength(1.5);
	}
	public Giraffe(String name,Point point) {
		super(name);
		super.setLocation(new Point(50, 0));
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setWeight(450.0);
		setNeckLength(1.5);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(50, 0));
		}
	}
	public Giraffe(String name, int neckLength,Point point) {
		super(name);
		if(!super.setLocation(point))
		{
			super.setLocation(new Point(50, 0));
		}
		Herbivore diet = new Herbivore();
		super.setDiet(diet);
		super.setLocation(new Point(50, 0));
		super.setWeight(450.0);
		setNeckLength(neckLength);
	}
	public double getNeckLength() {
		return this.neckLength;
	}

	public boolean setNeckLength(double neckLength) {
		if (1 <= neckLength && neckLength <= 2.5) {
			this.neckLength = neckLength;
			return true;
		}
		setNeckLength(1.5);
		return false;
	}

	public String gettaype() {
		return "Giraffe";
	}
}
