package diet;
import animals.*;
import food.*;
public class Carnivore implements IDiet {
	public Carnivore()
	{
		
	}
	public boolean canEat(EFoodType food)
	{
		if(food == EFoodType.MEAT&&food!=EFoodType.NOTFOOD) 
			return true;	
		return false;
	}
	public double eat(Animal animal, IEdible food)
	{
		if(canEat(food.getFoodtype()))
			return animal.getweight()*0.1;
		return 0.0;
	}
	
}
