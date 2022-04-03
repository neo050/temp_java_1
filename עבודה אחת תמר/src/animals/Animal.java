package animals;
/**
 * 
 */
import mobility.*;
import diet.*;
import food.*;

public abstract class Animal extends Mobile implements IEdible {
	/**
	 * 
	 */
	
	//fildes
	private String name;
	private double weight;
	private IDiet diet;
	private final double weight_movement = 0.00025;

	// Constractors
	public Animal(String name2) {
		this.name = new String(name2);
		System.out.printf("• Constructor: [Class Animal]:",this.name);
	}

	// Getters

	public String getname() {
		return this.name;
	}

	public double getweight() {
		return this.weight;

	}
	public IDiet getDiet() {
		return this.diet;

	}

	// Setters
	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	public boolean setWeight(double weight) {
		this.weight = weight;
		return true;
	}

	protected boolean setDiet(IDiet diet) {
		this.diet = diet;
		return true;
	}

	public boolean eat(IEdible food)// – eat some food
	{
		double temp = this.diet.eat(this, food);
		if (temp == 0) {
			return false;
		}
		this.weight += temp;
		makeSound();
		return true;

	}

	public double move(Point point) {
		double distance = super.move(point);
		if (distance > 0) {
			this.setWeight(this.getweight() - (distance * this.getweight() * weight_movement));
		}
		return distance;
	}

	public abstract void makeSound();

	public EFoodType getFoodtype() {
		return EFoodType.MEAT;
	}

	public abstract String gettaype();
}
