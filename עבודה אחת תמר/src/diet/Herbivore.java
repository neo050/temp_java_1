package diet;

import animals.*;
import food.EFoodType;
import food.IEdible;

public class Herbivore implements IDiet {
	public Herbivore() {

	}

	public boolean canEat(EFoodType food) {
		if (food == EFoodType.VEGETABLE)
			return true;
		return false;
	}

	public double eat(Animal animal, IEdible food) {
		if (canEat(food.getFoodtype()))
			return animal.getweight() * 0.07;
		return 0.0;
	}

}
