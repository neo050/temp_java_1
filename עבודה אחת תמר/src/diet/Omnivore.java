package diet;

import animals.*;
import food.*;

public class Omnivore implements IDiet {
	Carnivore carn;
	Herbivore herb;

	public Omnivore() {
		carn = new Carnivore();
		herb = new Herbivore();
	}

	public boolean canEat(EFoodType food) {
		return carn.canEat(food) || herb.canEat(food);
		// we can check if this lion only

	}

	public double eat(Animal animal, IEdible food) {
		return carn.eat(animal, food) + herb.eat(animal, food);
	}
}
