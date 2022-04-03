package animals;

import diet.*;
import food.EFoodType;
import food.IEdible;
import mobility.Point;
import java.util.concurrent.ThreadLocalRandom;

public class Lion extends Roar {
	private int scarCount;

	public Lion(String name) {
		super(name);
		Point point = new Point(20, 0);
		Carnivore diet = new Carnivore();
		super.setDiet(diet);
		super.setLocation(point);
		super.setWeight(408.2);
		this.scarCount = 0;
	}
	public Lion(String name,Point point) {
		super(name);
		if(!super.setLocation(point))
		{
			super.setLocation(point = new Point(20, 0));
		}
		Carnivore diet = new Carnivore();
		super.setDiet(diet);
		super.setLocation(point);
		super.setWeight(408.2);
		this.scarCount = 0;
	}

	/// geters
	public int getScarCount() {
		return this.scarCount;
	}

	public EFoodType getFoodtype() {
		return EFoodType.NOTFOOD;
	}

	public boolean eat(IEdible food) {
		if (super.eat(food)) {
			boolean rand_bool = ThreadLocalRandom.current().nextBoolean();
			if (rand_bool)
				scarCount++;
			return true;
		}
		return false;
	}

	public String gettaype() {
		return "Lion";
	}
}
